package JavaCodingQuestions.StarProblems;

public class InvertedRightAngleTriangleLeftAligned {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
