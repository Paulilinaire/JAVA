package org.example;

public class Race {
    private static volatile Race instance = null;
    private static final Object lock = new Object();

    private Race(){
    }

    public static Race getInstance() {
        if(instance == null){
            synchronized (lock){
                instance = new Race();
            }
        }
        return instance;
    }


}
