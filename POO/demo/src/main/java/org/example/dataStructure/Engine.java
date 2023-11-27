package org.example.dataStructure;

public abstract class Engine { // classe abstraite = classe qui ne peut pas être instanciée constituée de méthode abstraite

//    public abstract void test(); //méthode abstraite = méthode vide

    protected static int count;
    protected int id;
    protected int wheelNb;
    protected String color;

    {
        count++;
    }

    protected abstract void test();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWheelNb() {
        return wheelNb;
    }

    public void setWheelNb(int wheelNb) {
        this.wheelNb = wheelNb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", wheelNb=" + wheelNb +
                ", color='" + color + '\'' +
                '}';
    }
}
