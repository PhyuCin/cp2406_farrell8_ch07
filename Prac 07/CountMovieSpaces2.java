import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a movie quote:");
        String movieQuote = input.nextLine();
        movieQuote = movieQuote.trim();

        final char space = ' ';
        int spaces = 0;
        for(int i = 0; i < movieQuote.length(); i++)
        {
            if (movieQuote.charAt(i) == space){
                ++spaces;
            }
        }
        System.out.print("There are " + spaces + " spaces in the movie quote.");
    }
}
