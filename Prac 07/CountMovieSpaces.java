public class CountMovieSpaces {
    public static void main(String[] args){
        String movieQuote = "May the force be with you";
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
