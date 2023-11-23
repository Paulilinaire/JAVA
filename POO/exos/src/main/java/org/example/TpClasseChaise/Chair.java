package org.example.TpClasseChaise;

public class Chair {
    public int chairLeg;
    public String color;
    public String materials;

    public Chair() {

    }
    public Chair(int chairLeg, String color, String materials) {
        this.chairLeg = chairLeg;
        this.color = color;
        this.materials = materials;
    }

    public int getChairLeg() {
        return chairLeg;
    }

    public void setChairLeg(int chairLeg) {
        this.chairLeg = chairLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        System.out.println("----------- Affichage d'un nouvel objet ----------- ");
        return "Je suis une chaise, avec " + chairLeg + " pieds en " + materials + " et de couleur " + color;
    }
}
