import java.sql.SQLOutput;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;

        System.out.println("This is a test");

        System.out.println("This is " +
                "another " +
                "still more.");

        int anotherVariable = 50;
        myVariable--;

        System.out.println("My Variable: " + myVariable);

        if(myVariable == 0){
            System.out.println("It is now zero");
        }
    }



}
