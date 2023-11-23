package org.example;

import org.example.tpClasseChaise.Chair;
import org.example.tpClasseHeritage.Person;
import org.example.tpClasseHeritage.Student;
import org.example.tpClasseHeritage.Teacher;
import org.example.tpHouse.Apartment;
import org.example.tpHouse.People;

public class Main {

    public static void main(String[] args) {
        // TP Classe Chaise
        Chair blueChair = new Chair(4, "bleu", "bois");
        System.out.println(blueChair);
        Chair whiteChair = new Chair(4, "blanche", "métal");
        System.out.println(whiteChair);
        Chair noChair = new Chair(1, "transparente", "pléxiglass");
        System.out.println(noChair);

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
        Apartment apartment = new Apartment();
        People people = new People("Thomas", apartment);
        people.display();

        // TP Classe Héritage 3

    }
}