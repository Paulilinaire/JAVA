package org.example.exoTwo.entity;

import java.util.ArrayList;
import java.util.List;
public abstract class MusicComposition {
    private List<MusicInstrument> instruments = new ArrayList<>();

    public MusicComposition() {
    }

    public void addInstrument(MusicInstrument instrument) {
        instruments.add(instrument);
    }

    public void play() {
        System.out.println("Playing composition");
        for (MusicInstrument instrument : instruments) {
            instrument.play();
        }
    }
}

