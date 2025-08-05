package Java.ExceptioHandling;
class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}

public class CustomMethodOfThrows {
    public static void checkNumber(int number) throws InvalidInputException{
        if(number<0){
//            System.out.println("Number cannot be Negative!");
            throw new InvalidInputException("Number cannot be negative babu");
        }else {
            System.out.println("Valid Number:"+number);
        }
    }

    public static void main(String[] args) {
        try{
             checkNumber(10);
             checkNumber(-5);
        }catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }
}
