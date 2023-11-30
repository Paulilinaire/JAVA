package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import org.example.models.House;
import org.example.models.Person;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception { // not to do when you can treat exception, exception for the demo

        String asciiArt = FigletFont.convertOneLine("KARAOKE TIME !!"); //static method from the downloaded depedency Jfiglet
        System.out.println(asciiArt);

        Person person = new Person();
        Person person1 = new Person(2);

        person.setId(1);
        person.setLastname("toto");
        person.setFirstname("titi");

        person1.setFirstname("titi");
        person1.setLastname("toto");

        System.out.println(person.getId());
        System.out.println(person);
        System.out.println(person1);

        System.out.println(person1.equals(person));
        // false event with the same id because address memory are different
        // now true because of @EqualsAndHashCode, do not compare the adress anymore, compare the values

        House house = new House(4);
        house.setCity("New York City");
        System.out.println(house.getCity());

    }
}