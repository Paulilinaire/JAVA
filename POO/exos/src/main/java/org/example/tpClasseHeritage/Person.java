package org.example.tpClasseHeritage;

public class Person {
    protected int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "My age is " + age + " years old.";
    }
}
