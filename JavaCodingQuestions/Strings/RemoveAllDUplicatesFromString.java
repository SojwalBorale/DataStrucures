package JavaCodingQuestions.Strings;

public class RemoveAllDUplicatesFromString {
    public static void main(String[] args) {
        String str = "engineering";
        String result = "";
        for (int i=0;i<str.length();i++){
            char current = str.charAt(i);

            // now check if character is already in result
            boolean isDuplicate = false;
            for (int j=0;j<result.length();j++){
                if (current== result.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                result+= current;
            }
        }
        System.out.println("main string: " + str);
        System.out.println("removed duplicate: "+ result);
    }
}
