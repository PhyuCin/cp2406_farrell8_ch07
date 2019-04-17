import java.util.Arrays;
import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        String initial1, initial2, initial3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = input.nextLine();
        String[] arrOfStr = userInput.split(" ", 3);
        System.out.println(Arrays.toString(arrOfStr));

        initial1 = arrOfStr[0];
        initial2 = arrOfStr[1];
        initial3 = arrOfStr[2];
        System.out.println(initial1.charAt(1) + initial2.charAt(1) + initial3.charAt(1));
    }
}
