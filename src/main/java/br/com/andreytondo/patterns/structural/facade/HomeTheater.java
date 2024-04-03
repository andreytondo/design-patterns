package br.com.andreytondo.patterns.structural.facade;

import lombok.Builder;

@Builder
public class HomeTheater {

    private Amplifier amp;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public HomeTheater() {
        this.amp = new Amplifier();
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.lights = new Lights();
    }

    public HomeTheater(Amplifier amp, DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.amp = amp;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        amp.on();
        dvdPlayer.on();
        projector.on();
        lights.dim(50);
        projector.setInput("DVD");
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        amp.off();
        dvdPlayer.off();
        projector.off();
        lights.dim(0);
    }
}
