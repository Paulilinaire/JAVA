package org.example.exoTwo;


import org.example.exoTwo.builder.OneMusicCompositionBuilder;
import org.example.exoTwo.entity.MusicComposition;
import org.example.exoTwo.entity.MusicInstrument;

public class Main {
    public static void main(String[] args) {

        // Create unique MusicSettings
        MusicSettings musicSettings = MusicSettings.getInstance();

        // Create an instrument via proxy
        MusicInstrument piano = new ProxyPiano();

        // Create composition using builder
        MusicComposition composition = new OneMusicCompositionBuilder()
                .title("My song")
                .instrument(piano)
                .build();

        // Set volume using Singleton
        musicSettings.setVolume(80);

        //Play the composition
        composition.play();




    }
}