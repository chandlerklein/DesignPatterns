package com.chandler.patterns.command;

public class RemoteControl {
    private static final int NUM_COMMANDS = 7;

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[NUM_COMMANDS];
        this.offCommands = new Command[NUM_COMMANDS];

        Command noCommand = new NoOpCommand();
        for (int i = 0; i < NUM_COMMANDS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("\n--------- Remote Control ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getTypeName() + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuilder.toString();
    }
}
