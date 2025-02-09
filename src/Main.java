import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello Welcome to Trinity Theaters! Please enter your age below.");

        int age = in.nextInt();

        if (age >= 21) {
            System.out.println("Thank you for entering your age. You are at least 21 years old. You receive a wristband letting us know that you are.");
        }
    }
}