interface Animal {
    void sample();
}

class Dog implements Animal {
    public void sample() {
        System.out.println("Wafoo");
    }
}

class Cat implements Animal {
    public void sample() {
        System.out.println("Meow");
    }
}

public class Sub_animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.sample();
        c1.sample();
    }
}
