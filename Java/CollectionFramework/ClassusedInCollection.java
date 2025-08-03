package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Student{
    int rollno;
    String name;
    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
        return "Student{rollno=" + rollno + ", name=" + name + "}";
    }
}
public class ClassusedInCollection {
    public static void main(String[] args) {
        HashMap<Student,String> studentmap = new HashMap<>();
        // create a student object
        Student s1 = new Student(4,"Akshay");
        Student s2 = new Student(3,"Sojwal");
        Student s3 = new Student(2,"samartha");
        Student s4 = new Student(1,"Darshana");

        studentmap.put(s1,"age32");
        studentmap.put(s2,"age22");
        studentmap.put(s3,"age18");
        studentmap.put(s4,"age31");

        for (Map.Entry<Student,String> entry : studentmap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println();
        // sort students based on roll numbers
        // convert map entries into a list
        ArrayList<Map.Entry<Student, String>> list = new ArrayList<>(studentmap.entrySet());
         // sort by student roll no.
        list.sort(Comparator.comparing(e -> e.getKey().rollno));

        // print sorted result
        System.out.println("here we have sorted result in rollno.:");
        for (Map.Entry<Student,String> entry2 : list){
            System.out.println(entry2.getKey() + "->" + entry2.getValue());
        }
        System.out.println();

        // now sort by students name
        ArrayList<Map.Entry<Student,String>> list2 = new ArrayList<>(studentmap.entrySet());
        // sort student by their names
        list.sort(Comparator.comparing(e -> e.getKey().name));

        //print sorted result
        System.out.println("here we have sorted students based on their names");
        for (Map.Entry<Student,String> entry3 : list2){
            System.out.println(entry3.getKey() + "->" + entry3.getValue());
        }
    }
}
