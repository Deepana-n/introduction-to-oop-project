package main.java;

public class Parrot extends Bird {


    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.print("I am a " + color + " " + name + " parrot. Hear me roar!");
    }
}
