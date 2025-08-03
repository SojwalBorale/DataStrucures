package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name , int age){
        this.name=name;
        this.age =age;
    }
    //implement comparable method

    @Override
    public int compareTo(Person o) {
        int namecompare = this.name.compareTo(o.name);
        if (namecompare == 0){
            // if names are equal then compare by age
            return Integer.compare(this.age,o.age);
        }
        return namecompare;
    }
    public String toString(){
        return name +" "+"("+age+")";
    }
}
public class CompareOperation {
    public static void main(String[] args) {
        ArrayList<Person> s = new ArrayList<>();
        s.add(new Person("sojwal",4));
        s.add(new Person("sojwal",6));
        s.add(new Person("darshana",2));
        s.add(new Person("akshay",1));
        s.add(new Person("akshay",5));
        s.add(new Person("samartha",3));
        Collections.sort(s);
        System.out.println("people sorted by name:");
        for (Person p : s){
            System.out.println(p);
        }
    }
}
