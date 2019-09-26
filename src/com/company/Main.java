package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int myNum = rand.nextInt(100) + 1;
        boolean userWon = false;
        String answer;
        for (int i = 0; i < 10; i++)
            do {

                    System.out.println("Enter your guess");
                    int userNum = scan.nextInt();


                    if (myNum == userNum) {
                    System.out.println("Yes!");
                    userWon = true;
                    break;
                    } else if (myNum > userNum) {
                    System.out.println("No! Its greater than yours!");
                     } else {
                    System.out.println("No! Its less than yours");
                    }
                    if (!userWon) {
                    System.out.println("Loser!");
                    }
                    System.out.println("New game? (Y/N)");
                    answer = scan.next();
                } while (answer.equals("Y"));
    }
}