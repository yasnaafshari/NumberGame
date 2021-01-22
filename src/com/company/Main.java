package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number, you have 10 chances" + answer);

        for(int x = 10; x > 0; x--) {
            System.out.println("you have " + x + " chances");
            int number = scanner.nextInt();
            if (number < answer) {
                System.out.println("the answer is greater than " + number);
            }
            else if (number > answer){
                System.out.println("the answer is less than " + number);
            }
            else {
                System.out.println("your answer is correct");
                break;
            }

        }
    }
}
