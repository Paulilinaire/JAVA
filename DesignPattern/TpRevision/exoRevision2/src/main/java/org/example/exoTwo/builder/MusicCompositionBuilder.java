package org.example.exoTwo.builder;

import org.example.exoTwo.entity.MusicInstrument;
import org.example.exoTwo.entity.MusicComposition;

public abstract class MusicCompositionBuilder {
    public abstract MusicCompositionBuilder title(String title);
    public abstract MusicCompositionBuilder instrument(MusicInstrument instrument);
    public abstract MusicComposition build();

}
