import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int term;
        int first = 0;
        int second = 1;
        int next = 0;

        System.out.print("Please enter the term : ");
        term = input.nextInt();

        for (int i = 2; i <= term; i++){
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println("At term "+ term +" the number is "+ second);
    }
}
