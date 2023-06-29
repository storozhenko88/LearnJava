package lesson4;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printThreeWords();
        checkSumSign(scanner);
        printColor(scanner);

        scanner.close();

    }

    public static void printThreeWords(){
        System.out.println("Apple\nOrange\nBanana\nApple\n");
    }

    public static void checkSumSign(Scanner scanner){
        System.out.print("a = ");
        int a  = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.println((a+b) > 0 ? "The sum is +" : "The sum is -");
    }

    public static void printColor(Scanner scanner){
        System.out.print("number = ");
        int number  = scanner.nextInt();

        if (number < 0) System.out.println("Red");
        else if (number >= 0 && number < 100) System.out.println("Yellow");
        else System.out.println("Green");
    }

}
