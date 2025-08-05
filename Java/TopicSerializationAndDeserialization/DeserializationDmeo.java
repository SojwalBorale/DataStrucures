package Java.TopicSerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDmeo {
    public static void main(String[] args) {
        String fileName = "F:\\Serialization\\Serialization.txt";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println(s.rollNo);
            System.out.println(s.name);

            ois.close();
            fis.close();
        }catch (FileNotFoundException e){
            e.getMessage();
        }catch (IOException e){
            e.getMessage();
        }catch (ClassNotFoundException e){
            e.getMessage();
        }
    }
}
