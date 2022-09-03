import java.util.Random;
import java.util.Scanner;

public class RandomNumberChoosing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int selectedNumber = random.nextInt(100);
        int remainingRight = 5;

        while (remainingRight > 0) {
            System.out.println("--------------------------");
            System.out.print("Please Enter a Number..:");
            int userGivenNumber = scanner.nextInt();
            if (userGivenNumber == selectedNumber) {
                System.out.println("Congrats it is true selection");
            } else {
                if (userGivenNumber < selectedNumber) {
                    System.out.println("Your number is less than selected random number");
                } else {
                    System.out.println("Your number is bigger than selected random number");
                }
                remainingRight--;
                System.out.println("Remaining Write..:" + remainingRight);
            }
        }
        System.out.println("*------------------------*---");
        System.out.println("Selected Number is..:" + selectedNumber + ".You don't know.");

    }
}
