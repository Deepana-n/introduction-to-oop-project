package main.java;

public abstract class Bird implements Dance {
    protected String name;
    protected String color;

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();
        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();
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
    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }
}

