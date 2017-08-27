// Count the number of whitespaces in a user input string
import java.util.Scanner;
public class CountMovieSpaces2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a movie quote: ");
        String movieQuote = input.nextLine();
        int spacesCounter = 0;
        for(int i = 0; i < movieQuote.length(); i++){
            char aChar = movieQuote.charAt(i);
            if(aChar == ' '){
                spacesCounter++;
            }
        }
        System.out.println("In the movie quote: "+movieQuote+", there are "+spacesCounter+" spaces.");
    }
}
