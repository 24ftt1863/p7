import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int rounds = 0;
        int userscore = 0;
        int computerscore = 0;
        String playagain;

        do{
        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();
        int computer = rand.nextInt(3);

        System.out.print("The computer is ");
            if (computer == 0)
                System.out.print("rock.");
            else if (computer == 1)
                System.out.print("paper.");
            else
                System.out.print("scissor.");

            System.out.print(" You are ");
            if (user == 0)
                System.out.print("rock.");
            else if (user == 1)
                System.out.print("paper.");
            else
                System.out.print("scissor.");

            if (user == computer) {
                System.out.println(" It is a draw.");
            } else if ((user == 0 && computer == 2) ||
                       (user == 1 && computer == 0) ||
                       (user == 2 && computer == 1)) {
                System.out.println(" You win!");
                userscore++;
            } else {
                System.out.println(" You lose!");
                computerscore++;
            }
            rounds++;

            System.out.print("\nEnter y to play again: ");
            playagain = input.next();
            System.out.println();
        }
        while((playagain.equalsIgnoreCase("y")));

        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userscore + ", Computer scored " + computerscore);

        if (userscore > computerscore) {
            System.out.println("You won the game!");
        } else if (userscore < computerscore) {
            System.out.println("You lost the game!");
        } else {
            System.out.println("It is a draw game!");
        }

    }
}
