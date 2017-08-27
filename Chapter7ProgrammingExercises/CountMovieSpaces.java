// Counts the total number of spaces in a string that contains a movie quote.
public class CountMovieSpaces {
    public static void main(String args[]){
        String movieQuote = "'Here's looking at you kid!'";
        int spaceCounter = 0;
        int i = 0;
        for(i=0; i< movieQuote.length(); i++){
            char aChar = movieQuote.charAt(i);
            if(aChar == ' '){
                spaceCounter++;
            }
        }
        System.out.println("In the movie quote: "+movieQuote+", there are "+spaceCounter+" spaces.");
    }
}
