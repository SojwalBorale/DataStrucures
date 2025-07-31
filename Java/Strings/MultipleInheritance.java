package Java.Strings;
interface A{
    void methodA();
}
interface B{
    void methodB();
}
class C implements A,B{
    @Override
    public void methodA() {
        System.out.println("Method A of interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B of interface B");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
    }
}
