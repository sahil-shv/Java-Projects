import java.util.Random;
import java.util.Scanner;
public class rockPaperScissor {
    void winDecider(String user, String computer){
        if(user.equals(computer)){
            System.out.println("Match draw.");
        }
        else if(user.equals("Rock") && computer.equals("Paper") 
            || user.equals("Paper") && computer.equals("Scissor") 
            || user.equals("Scissor") && computer.equals("Rock")){
            System.out.println("You lost the match.");
        }
        else{
            System.out.println("You won the match.");
        }
    }
    String decisionMapper(int n){
      if(n == 1){
        return "Rock";
      }
      else if(n==2){
        return "Scissor";
      }
      else if(n==3){
        return "Paper";
      }
      return "error";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        rockPaperScissor rps = new rockPaperScissor();
        while (true) {
            int computerChoice = ran.nextInt(3) + 1;
            System.out.println("Enter your Choice:\n1 for Rock\n2 for Scissor\n3 for Paper");
            int userChoice = sc.nextInt();
            System.out.println("You choose "+rps.decisionMapper(userChoice));
            System.out.println("Computer choose "+rps.decisionMapper(computerChoice));
            
            rps.winDecider(rps.decisionMapper(userChoice), rps.decisionMapper(computerChoice));

            //exit loop
            System.out.println("Enter exit if you want to exit.Else anything to continue");
            String exitLoop = sc.next();
            if(exitLoop.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
