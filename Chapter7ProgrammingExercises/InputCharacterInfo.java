// tests a character retrieved from a user input
import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a character, any character: ");
        String aString = keyboard.nextLine();
        char aChar = aString.charAt(0); // the char is the character at the first index (index 0) of the entered string
        System.out.println("The character you entered is "+aChar);

        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is uppercase");
        }else{
            System.out.println(aChar + " is not uppercase");
        }
        if(Character.isLowerCase(aChar)) {
            System.out.println(aChar + " is lowercase");
        }else{
            System.out.println(aChar + " is not lowercase");
        }
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is "+aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is "+aChar);
        if(Character.isLetterOrDigit(aChar)){
            System.out.println(aChar + " is a letter or digit");
        }else{
            System.out.println(aChar + " is neither a letter or digit");
        }
        if(Character.isWhitespace(aChar)){
            System.out.println(aChar + " is whitespace");
        }else{
            System.out.println(aChar+" is not whitespace");
        }

    }
}
