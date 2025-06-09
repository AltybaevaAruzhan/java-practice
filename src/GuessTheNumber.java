import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess the number between 1 and 100!\n You have 7 tries. Good luck!");
        int target = random.nextInt(100)+1;
        boolean guessed = false;
        for(int i=0; i<7; i++){
            System.out.printf("Attemp: #%d!", i+1);
            int guess = scanner.nextInt();
            if(guess<target){
                System.out.println("Too low");
            }else if(guess>target){
                System.out.println("Too high");
            } else{
                System.out.println("Correct");
                guessed = true;
                break;
            }
        }
        if(!guessed){
            System.out.println("You lost! The correct number was: " + target);
        }

    }
}
