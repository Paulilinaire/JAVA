package org.example.exoTwo.entity;

import org.example.exoTwo.builder.OneMusicCompositionBuilder;

public class OneMusicComposition extends MusicComposition {
    private String title;
    private MusicInstrument instrument;

    public OneMusicComposition(OneMusicCompositionBuilder builder){
        title = builder.getTitle();
        instrument = builder.getInstrument();
    }



}
