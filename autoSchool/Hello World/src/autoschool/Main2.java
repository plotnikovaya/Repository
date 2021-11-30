package autoschool;

import com.welcome.Hello;

import java.util.Scanner;

import static com.welcome.Hello.*;

public class Main2 {

    public static void main(String[] args) {
        setupName(readName());
        welcome();
        System.out.println("Hello World!");
        byeBye();
    }

    public static String readName() {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        return name;
    }
}








