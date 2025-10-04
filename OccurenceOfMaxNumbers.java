import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers, the input ends with 0 entered: ");
        int num = input.nextInt();

        int largest = num;
        int count = 0;

        if (num != 0) {
            count = 1;
        }

        while (num != 0) {
            num = input.nextInt();

            if (num == 0) {
            break;
            }
            if (num > largest) {
                largest = num;
                count = 1;
            }
            else if (num == largest) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("\nThe largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }
}

