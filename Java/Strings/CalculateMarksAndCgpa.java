package Java.Strings;
class Marks {
    float s1, s2, s3;

    public Marks(float s1, float s2, float s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public void diplayschool() {
        System.out.println(s1+s2+s3);
        System.out.println("percentage:" + percentage());
    }
    public void diplaycgpa() {
        System.out.println(s1+s2+s3);
        System.out.println("Cgpa:" + Cgpa());
    }


    public float percentage() {
        float total = s1 + s2 + s3;
        float percent = total/3;
        return percent;
    }
    public float Cgpa() {
        float total = s1 + s2 + s3;
        float percent = total/3;
        float cgpa=percent/9.5f;
        return cgpa;
    }
}

class School extends Marks{
    String Name;
    School(String Name,float s1, float s2, float s3){
        super(s1,s2,s3);
        this.Name = Name;
    }

}
class College extends Marks{
    String Name;
    College(String Name,float s1, float s2, float s3){
        super(s1,s2,s3);
        this.Name = Name;
    }

}

public class CalculateMarksAndCgpa {
    public static void main(String[] args) {
        School s = new School("Sojwal", 30, 30, 30);
        s.diplayschool();
        College c = new College("Akshay", 40, 40, 40);
        c.diplaycgpa();
    }
}


