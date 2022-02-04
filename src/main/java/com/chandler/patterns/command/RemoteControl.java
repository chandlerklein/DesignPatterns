package com.chandler.patterns.command;

public class RemoteControl {
    private static final int NUM_COMMANDS = 7;

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[NUM_COMMANDS];
        this.offCommands = new Command[NUM_COMMANDS];

        Command noCommand = new NoOpCommand();
        for (int i = 0; i < NUM_COMMANDS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("\n--------- Remote Control ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuilder.toString();
    }
}
