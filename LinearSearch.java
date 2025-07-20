import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int i,n,item,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        n= sc.nextInt();
        int [] arr = new int[n];
        for (i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the item to search:");
        item = sc.nextInt();
        for ( i=0;i< arr.length;i++){
            if (arr[i]== item){
                c++;
                break;
            }
        }
        if (c>0){
            System.out.println("item exist at position:"+i);
        }
        else {
            System.out.println("item does not exist");
        }
    }
}
