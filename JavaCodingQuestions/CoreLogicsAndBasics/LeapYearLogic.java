package JavaCodingQuestions.CoreLogicsAndBasics;

public class LeapYearLogic {
    public static void main(String[] args) {
        int year = 2020;
        if ((year % 4 == 0 && year%100 != 0 )|| (year % 400 ==0)){
            System.out.println("the year is leap year");
        }else {
            System.out.println("this is not the leap year");
        }
    }
}
