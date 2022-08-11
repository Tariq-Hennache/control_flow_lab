import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        int secretNumber = 7;

        System.out.println("what is the secret number?");

        Scanner reader = new Scanner(System.in);
        String guessedNumber = reader.nextLine();

        int guessedNumberNew = Integer.parseInt(guessedNumber);

        if(guessedNumberNew == secretNumber){
            System.out.println("Your a wizard Harry");
        } else if (guessedNumberNew > secretNumber){
            System.out.println("too high DO BETTER");
        } else {
            System.out.println("too low Do Better");
        }


    }
}
