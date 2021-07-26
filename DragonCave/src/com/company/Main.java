package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int D;
        Scanner c = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");

        D = c.nextInt();
        if (D == 1) {
            System.out.println("You approach the cave...\n" +
                    "\n" +
                    "It is dark and spooky...\n" +
                    "\n" +
                    "A dragon flies over you and he leaves you his treasure!" +
                    "\n" +
                    "Congratulations, you are now rich!");
            System.exit(0);
        }
    }}
