package com.chandler.patterns.facade;

import com.chandler.patterns.facade.HomeTheaterFacade.PopcornPopper;
import com.chandler.patterns.facade.HomeTheaterFacade.Projector;

import static com.chandler.patterns.facade.HomeTheaterFacade.Amplifier;
import static com.chandler.patterns.facade.HomeTheaterFacade.Screen;
import static com.chandler.patterns.facade.HomeTheaterFacade.StreamingPlayer;
import static com.chandler.patterns.facade.HomeTheaterFacade.TheaterLights;
import static com.chandler.patterns.facade.HomeTheaterFacade.Tuner;

public class HomeTheaterRunner {

    public static void main(String[] args) {
        var amp = new Amplifier();
        var tuner = new Tuner();
        var player = new StreamingPlayer();
        var projector = new Projector();
        var lights = new TheaterLights();
        var screen = new Screen();
        var popper = new PopcornPopper();

        var homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Star Wars");
        homeTheater.endMovie();
    }
}
