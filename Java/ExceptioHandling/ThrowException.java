package Java.ExceptioHandling;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class Student {
    int rollno;

    String name;
    int age;

    public Student(int rollno, String name, int age) throws InvalidAgeException {
        if (age < 35) {
            throw new InvalidAgeException("Invalid age: Age must be 35 or above.");
        }
        this.age = age;
        this.rollno = rollno;
        this.name = name;
    }


    public void display() {
        System.out.println("Roll No:" + rollno);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

    public class ThrowException {
        public static void main(String[] args) {
            try {
                Student s = new Student(101, "Sojwal", 60);
                s.display();
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

