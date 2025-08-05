package Java.TopicSerializationAndDeserialization;

import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    transient  String password;
}
public class SerializationDemo {
    public static void main(String[] args) {
        Student s= new Student();
        s.rollNo =5;
        s.name = "String";
        s.password = "secret123";
        String fileName = "F:\\Serialization\\Serialization.txt";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);

            oos.close();
            fos.close();
            System.out.println("Object saved in file");
        }
        catch (FileNotFoundException e){
            e.getMessage();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

}
