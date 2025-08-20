package JavaCodingQuestions.StarProblems;

public class ightAngledTriangleRightAligned {
    public static void main(String[] args) {
        int row = 5;
        for (int i=0;i<row;i++){
            for (int s=0;s<row-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
