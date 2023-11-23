package org.example;

import org.example.TpClasseChaise.Chair;
import org.example.TpClasseHeritage.Person;
import org.example.TpClasseHeritage.Student;
import org.example.TpClasseHeritage.Teacher;
import org.example.TpHouse.Apartment;
import org.example.TpHouse.Door;
import org.example.TpHouse.People;

public class Main {

    public static void main(String[] args) {
        // TP Classe Chaise
        Chair blueChair = new Chair(4, "bleu", "bois");
        System.out.println(blueChair);
        Chair whiteChair = new Chair(4, "blanche", "métal");
        System.out.println(whiteChair);
        Chair transparentChair = new Chair(1, "transparente", "pléxiglass");
        System.out.println(transparentChair);

        // TP Classe Héritage 1
        Person person = new Person(15);
        person.sayHello();
        Student student = new Student(20);
        student.goingToClass();
        System.out.println(student);
        Teacher teacher = new Teacher(99);
        teacher.sayHello();
        teacher.Explain();

        // TP Classe Héritage 2
        Door door = new Door();
        Apartment apartment = new Apartment();
        People people = new People("Thomas");
        people.setHouse(apartment);
        people.display();
        door.setColor("bleu");
        door.display();

        // TP Classe Héritage 3

    }
}