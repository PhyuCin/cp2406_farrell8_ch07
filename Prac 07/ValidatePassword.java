import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean valid = false;
        while (!valid){
            System.out.println("Enter password:");
            String userInput = input.nextLine();
            int upperCases = 0;
            int lowerCases = 0;
            int digits = 0;


            for (int i = 0; i < userInput.length(); i++){
                if (Character.isUpperCase(userInput.charAt(i))){
                    ++upperCases;
                }
                else if (Character.isLowerCase(userInput.charAt(i))){
                    ++lowerCases;
                }
                else if (Character.isDigit(userInput.charAt(i))){
                    ++digits;
                }
            }

            if(upperCases >= 2 && lowerCases >=2 && digits >= 2){
                System.out.println("Valid password!");
                valid = true;
            }
            else{
                System.out.println("Invalid password.\nYou need at least 2 uppercase letters, 2 lowercase letters and " +
                        "2 digits.\nYou only have " + upperCases + " uppercase letters, " + lowerCases + " lowercase letters and " +
                digits + " digits only");
            }

        }

    }
}
