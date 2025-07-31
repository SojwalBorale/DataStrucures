package Java.Strings;
class Alias{
    String alias;
}
class Person extends Alias {
    String name;
    String gender;

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;


        if (gender.equals("male")) {
            alias = "Mr.";
        } else if (gender.equals("female")) {
            alias = "Ms.";
        } else {
            alias = "";
        }
        if (!alias.equals("")){
            System.out.println(alias + " "+ name);
        }
        else {
            System.out.println("Invalid");
        }
    }
}


public class MrAndMs {
    public static void main(String[] args) {
         new Person("Sojwal","male");
         new Person("Vaishali","female");
         new Person("Sojwal","other");

    }
}
