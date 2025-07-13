class Types{
    int n=10;
    int [] arr = new int[n];
    int top =-1;

     public void display(){
         for (int i=top;i>=0;i--){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
    public void push(int value){
      if(top==n-1){
          System.out.println("overflow");
        }
      top++;
      arr[top]= value;
    }
    public void pop(){
         if (top==-1){
             System.out.println("underflow");
         }
         top=top-1;
    }
}

public class Stack {
    public static void main(String[] args) {
        Types s = new Types();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.display();
        s.pop();
        s.display();

    }
}
