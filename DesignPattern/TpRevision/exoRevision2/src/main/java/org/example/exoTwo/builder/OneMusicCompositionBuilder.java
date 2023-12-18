package org.example.exoTwo.builder;

import org.example.exoTwo.entity.MusicInstrument;
import org.example.exoTwo.entity.MusicComposition;
import org.example.exoTwo.entity.OneMusicComposition;

public class OneMusicCompositionBuilder extends MusicCompositionBuilder{
    private String title;
    private MusicInstrument instrument;

    @Override
    public MusicCompositionBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public MusicCompositionBuilder instrument(MusicInstrument instrument) {
        this.instrument = instrument;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MusicInstrument getInstrument() {
        return instrument;
    }

    @Override
    public MusicComposition build() {
        return new OneMusicComposition(this);
    }
}
