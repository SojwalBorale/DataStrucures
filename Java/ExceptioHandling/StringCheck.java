package Java.ExceptioHandling;

import java.rmi.registry.Registry;

//Custom exception class for invalid input
class InvalidLengthException extends Exception{
    public InvalidLengthException(String message){
        super(message);
    }
}
public class StringCheck {
    // method of signup
    public void signup(String name) {
        try{
            if (name.length() > 8) {
                throw new InvalidLengthException("Invalid name: Length should not exceed more than 8");
            }else{
                System.out.println("Signup successful. Name:"+name);
            }
        }catch (InvalidLengthException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        StringCheck s = new StringCheck();
        s.signup("Sojwalborale");
    }
}
