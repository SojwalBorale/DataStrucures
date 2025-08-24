package JavaCodingQuestions.CollectionsAndMapProblems;
import java.util.*;
 class Students implements Comparable<Students>{
    int id;
    int age;
    String name;
    public Students(int id,String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    @Override
     public int compareTo(Students other){
        return Integer.compare(this.id, other.id);
    }
    @Override
     public String toString(){
        return id+ " - "+ name+ " - "+ age;
    }

}
public class SortbyComparable {
    public static void main(String[] args) {
       ArrayList<Students> student = new ArrayList<>();
       student.add(new Students(3,"sojwal",45));
        student.add(new Students(1,"sid",40));
        student.add(new Students(2,"maxx",50));

        Collections.sort(student);
        System.out.println("Sorted By ID (Comparable)");
        for (Students s : student ){
            System.out.println(s);
        }
    }
}
