package org.example.poo.statics;

public class Demo {

    public static void demo1() {

        User user = new User();
        System.out.println(user);
        User user1 = new User("Jean-Michel");
        System.out.println(user1);

        int counter = User.counter;

        Employee e = new Employee();
        System.out.println(e);

        Employee e2 = new Employee("Tam");
        System.out.println(e2);

    }
}

