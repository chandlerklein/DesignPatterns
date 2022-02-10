package com.chandler.patterns.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    public record Amplifier() {
        public void on() {
        }

        public void setStreamingPlayer(StreamingPlayer player) {
        }

        public void setSurroundSound() {
        }

        public void off() {

        }
    }

    public record Tuner() {}

    public record StreamingPlayer() {
        public void on() {

        }

        public void play(String movie) {
        }

        public void stop() {

        }

        public void off() {

        }
    }

    public record Projector() {
        public void on() {

        }

        public void wideScreenMode() {

        }

        public void off() {

        }
    }

    public record TheaterLights() {
        public void dim(int level) {

        }

        public void on() {
        }
    }

    public record Screen() {
        public void down() {

        }

        public void up() {

        }
    }

    public record PopcornPopper() {
        public void on() {

        }

        public void pop() {

        }

        public void off() {

        }
    }
}
