package Java.Strings;

import org.w3c.dom.ls.LSOutput;

interface Aa{
    default void show(){
        System.out.println("A's Show Method");
    }
}
interface Bb extends Aa {
    default void show(){
        System.out.println("B's show method");
    }
}
interface Cc extends Aa {
    @Override
    default void show() {
        System.out.println("C's show method");
    }
}
class Dd implements Bb,Cc{
    @Override
    public void show() {
        Bb.super.show();
        Cc.super.show();
        System.out.println("D's own show method");
    }

}
public class DiamondUsingInheritance {
    public static void main(String[] args) {
        Dd s = new Dd();
        s.show();
    }
}
