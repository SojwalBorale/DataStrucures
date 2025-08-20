package JavaCodingQuestions.StarProblems;

import java.security.spec.RSAOtherPrimeInfo;

public class InvertedRightAngledTriangleRightAligned {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=rows;i>0;i--){
            for (int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            for (int s=0;s<i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
