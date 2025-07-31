package Java.Strings;
class Animal{
    void sound(){
        System.out.println("Creates sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
public class TwoClasses {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog s = new Dog();
        s.sound();
        s.bark();
        a.sound();
    }
}
