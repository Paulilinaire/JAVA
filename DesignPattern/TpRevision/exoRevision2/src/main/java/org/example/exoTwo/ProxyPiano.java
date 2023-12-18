package org.example.exoTwo;

import org.example.exoTwo.MusicSettings;
import org.example.exoTwo.entity.MusicInstrument;
import org.example.exoTwo.entity.Piano;

class ProxyPiano implements MusicInstrument {
    private Piano piano;
    private MusicSettings musicSettings;

    public ProxyPiano() {
        piano = new Piano();
        musicSettings = MusicSettings.getInstance();
    }

    @Override
    public void play() {
        if (musicSettings.getVolume() > 0) {
            piano.play();
        } else {
            System.out.println("Volume is muted. Cannot play the piano.");
        }
    }
}

