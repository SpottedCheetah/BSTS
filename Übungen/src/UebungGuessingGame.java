import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UebungGuessingGame {

    public static void main(String[] args) {
        int random = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);

        while (true){
            int guess;

            try {
                guess = Integer.parseInt(scan.nextLine());
            }catch (NumberFormatException e){
                continue;
            }

            if(guess > random){
                System.out.println("Too big!");
            }else if(guess < random){
                System.out.println("Too small!");
            }else if(guess == random){
                System.out.println("DING DING DING!");
                break;
            }
        }
    }
}
