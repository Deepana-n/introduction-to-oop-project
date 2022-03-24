package main.java;

public abstract class Bird {
    protected String name;
    protected String color;

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        Parrot ratty  = new Parrot("Ratty", "Red");
        ratty.speak();
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //marked with abstract means classes extending it should implement method
    //also no body
    public abstract void speak();

    public void fly() {
        System.out.println("Hi there! I can fly.");
    }
}

