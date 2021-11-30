package task1;

import java.util.Scanner;

public class Task2 {
    public static String text = "";
    public static String exchange = "";
    public static String renewal = "";

    public static void main(String[] args) {
        enterText();
        textReplacement();
        paste();
    }

    public static void enterText() {
        text = enterText("Enter input string ");
    }

    public static void textReplacement() {
        exchange = enterText("Enter the word you want to replace ");
    }

    public static void paste() {
        String newWord = enterText("Enter the new word ");
        renewal = text.replaceAll(exchange, newWord);
        System.out.println(renewal);
    }

    private static String enterText(String inputMessage) {
        System.out.println(inputMessage + ": ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}