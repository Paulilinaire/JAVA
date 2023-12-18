package org.example.exoTwo;

class MusicSettings {
    private static volatile MusicSettings instance = null;
    private static final Object lock = new Object();
    private int volume;

    private MusicSettings() {
        volume = 50; // Default volume
    }

    public static MusicSettings getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new MusicSettings();
            }
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicSettings{" +
                "volume=" + volume +
                '}';
    }
}

