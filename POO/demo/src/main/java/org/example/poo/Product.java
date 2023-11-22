package org.example.poo;

public class Product {
    protected  int id;
    protected String name;

    public Product () {

    }
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id; // pas obligé de spécifier 'this' car il n'y a pas de confusion possible car il y a un id présent dans le scope de la fonction, il va chercher l'attribut id.
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getBonjour(){
        System.out.println("Bonjour");
    }

    public void quiSuisJe(){
        System.out.println("Je suis un produit.");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
