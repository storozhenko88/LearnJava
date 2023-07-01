package lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String beginWord = "юукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] wordAfter = beginWord.trim().split("Z");
        StringBuffer buffer = new StringBuffer();
        int count = 0;
        for (String word: wordAfter){
            buffer.setLength(0);
            for (int i = word.length()-1; i >= 0; i--){
                buffer.append(word.charAt(i));
            }
            wordAfter[count] = buffer.toString();

            System.out.println(wordAfter[count]);
            count++;
        }

        calculator();
    }

    public static void calculator () {

        Scanner scanner = new Scanner(System.in);
        String choice = "no";

        while (choice.equals("no")){
            System.out.print("first number - ");
            int firstNumber = scanner.nextInt();

            System.out.print("choose '+ - / *' - ");
            String character = scanner.next();

            System.out.print("second number - ");
            int secondNumber = scanner.nextInt();

            switch (character) {
                case "+" -> System.out.println(firstNumber + secondNumber);
                case "-" -> System.out.println(firstNumber - secondNumber);
                case "*" -> System.out.println(firstNumber * secondNumber);
                case "/" -> {
                    if (secondNumber != 0)
                        System.out.println(firstNumber / secondNumber);
                    else
                        System.out.println("error");
                }
            }
            System.out.println("exit? \nyes - enter 'yes'\nno - 'no'");
            choice = scanner.next();
        };
    }
}
