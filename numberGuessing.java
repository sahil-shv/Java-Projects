import java.util.Random;
import java.util.Scanner;
public class numberGuessing {
    static int highScore = Integer.MAX_VALUE;
    static int count = 0;
    void winDecider(int computerGuessedNumber, int userGuessedNumber){
        if(computerGuessedNumber < userGuessedNumber){
                System.out.println("Too High.");
                count++;
            }
            else if(computerGuessedNumber > userGuessedNumber){
                System.out.println("Too Low.");
                count++;
            }
            else{
                System.out.println("You guessed it right.");
                count++;
                return;
            }
    }

    void highScoreUpdater(){
        if(highScore > count){
            highScore = count;
        }
    }
    public static void main(String[] args) {
        numberGuessing ng = new numberGuessing();
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        while(true){
            count = 0;
            int computerGuessedNumber = ran.nextInt(100) + 1;
            System.out.println("I have guessed a number between 1 and 100");
            int userGuessedNumber = 1;
            while(computerGuessedNumber != userGuessedNumber){
                System.out.println("Enter your guess:");
                userGuessedNumber = sc.nextInt();
                ng.winDecider(computerGuessedNumber, userGuessedNumber);
            }
            System.out.println("Your current score is: " + count);
            System.out.println("Enter exit to EXIT or any key if you want to continue.");
            String key = sc.next();
            ng.highScoreUpdater();
            if(key.equalsIgnoreCase("exit")){
                System.out.println();
                System.out.println("Your HighScore is: " + highScore);
                break;
            }
        }
    }
}
