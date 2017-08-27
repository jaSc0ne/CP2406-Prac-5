// Converts a string to a lowercase, and
// displays the string's length
// as well as a count of letters
public class FixDebugSeven4 {
    public static void main(String args[]){
        String aString = "Help!! I need to get 37 things DONE today!!";
        int numLetters = 0;
        int stringLength = aString.length();
        System.out.println("In all lowercase, the sentence is: ");
        for(int i = 0; i < stringLength; i++){
            char ch = Character.toLowerCase(aString.charAt(i));
            System.out.print(ch);
            if(Character.isLetter(ch)){
                numLetters++;
            }
        }
        System.out.println();
        System.out.println("The number of characters in the string is "+stringLength);
        System.out.println("The number of letters in the string is "+numLetters);
    }
}
