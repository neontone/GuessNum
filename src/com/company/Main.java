package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String Username;

        do {

            int myNum = rand.nextInt(100) + 1;
            boolean userWon = false;

            for (int i = 0; i < 10; i++) {
                int userNum = askInt("Please, enter your guess:", 1, 100);

                if (myNum > userNum) {
                    System.out.println("My number is greater than yours");
                } else if (myNum < userNum) {
                    System.out.println("My number is less than yours");
                } else {
                    System.out.println("You won!");
                    userWon = true;
                    break;
                }
            }

            if (!userWon) {
                System.out.println("Loser!");

            }
            {
                System.out.println("Please enter your name?");
                Username = scan.next();
                if(Username.matches("[a-zA-Z]*") == false){
                    return;

                }
            }

        } while (askYesNo("Do you want to play again, " + Username + "? (Y/N)"));

        System.out.println("Bye!");

    }

    static int askInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.println(msg);
                int answer = scan.nextInt();
                if (answer >= min && answer <= max) {
                    return answer;
                }
            } catch (InputMismatchException ex) {
                System.out.println("It isn't a number :(");
                scan.next();
            }
            System.out.printf("Only numbers from %d to %d\n", min, max);
        }
    }

    static boolean askYesNo(String msg) {
        while (true) {
            System.out.println(msg);
            String answer = scan.next();
            boolean isY = answer.equalsIgnoreCase("y");
            boolean isN = answer.equalsIgnoreCase("n");
            if (isY || isN) {
                return isY;
            }
            System.out.println("Enter 'y' or 'n'");
        }


    }

}


