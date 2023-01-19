package GroupProject;
 //6)Write a program to swap 2 numbers without a temporary variable?
 //7)Write a java program to check whether a given number is prime or not?

import java.util.Scanner;

public class ProjectClass10Task5 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("*****************************************");

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number = input.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
         }
         static boolean isPrime(int num) {
             if (num <= 1) {
            return false;
            }
             for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0)
                return false;
             }
             return true;
















    }
}
