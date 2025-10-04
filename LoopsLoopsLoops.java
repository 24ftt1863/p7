import java.util.Scanner;

public class LoopsLoopsLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;

        System.out.println("Below is generated using while loop:");
        while (count <= 20) {
            System.out.print(count +" ");
            count++;
        }
        System.out.println("\n");

        int count2 = 50;

        System.out.println("Below is generated using dowhile loop:");
        do {
            System.out.print(count2 +" ");
            count2--;
        }
        while (count2 >= 35);

        System.out.println("\n");

        System.out.println("Below is generated using for loop:");
        for (char ch = 'a'; ch <= 'z'; ch++){
        System.out.print(ch +" ");
        }
        System.out.println("\n");
    }
}
