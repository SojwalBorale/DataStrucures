package Java.ExceptioHandling;

public class SuperExample {

    SuperExample(String name){
        System.out.println(name);
    }

//    public SuperExample() {
//
//    }
}
class SubSuperExample extends SuperExample{
    public static void main(String[] args) {
        SubSuperExample s = new SubSuperExample();

    }
    SubSuperExample(){
        super("Sojwal");
    }
}