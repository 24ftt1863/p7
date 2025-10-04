import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int positive = 0;
        int negative = 0;
        int total = 0;
        int count = 0;
        double average;

        System.out.println("Enter an integer, the input ends if it is 0: ");

        while(true){
            number = input.nextInt();

            if (number == 0){
                break;
            }

            if (number > 0){
                positive++;
            }
            else if (number < 0){
                negative++;
            }

            total += number;
            count++;
        }

        if (count != 0){
            average = (double) total/count;
            System.out.println("\nThe number of positive is "+ positive);
            System.out.println("The number of negatives is "+ negative);
            System.out.println("The total is "+ total);
            System.out.println("The average is "+ average);
        }
        else {
            System.out.println("No number is entered except for 0 to end the program. ");
        }
    }
}


