package JavaCodingQuestions.CoreLogicsAndBasics;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int largest;
        if (a>b && a>c){                      // use of logical and relational operator
            largest=a;
        }else if(b>a && b>c){
            largest=b;
        }else {
            largest=c;
        }
        System.out.println("The largest no. is: "+ largest);
    }
}
