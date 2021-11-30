package com.welcome;

public class Hello {
    public static String name = " ";

    public static void setupName(String name) {
        Hello.name = name;
    }

    public static void welcome() {
        System.out.println("Hello " + name + "!");
    }

    public static void byeBye() {

        System.out.println("Bye " + name + "!");

    }
}

