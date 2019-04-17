package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
//        double a = 10/3F;
//        System.out.println(a);
    }
}
