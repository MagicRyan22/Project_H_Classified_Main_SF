package class8;

import java.util.Scanner;

/*1) Print numbers from 1 to 50 except those that are divisible by 3

        2) Create a program that will be asking user to apply for a credit card 10 times.
        As soon you get an “yes” from a user program should stop asking.
        */
public class Homework1 {
    public static void main(String[] args) {

        for(int num=0;num<=50;num++){
            if(num%3!=0){
                System.out.print(num+" ");
            }
        }

        System.out.println("*****************************************");

        Scanner input=new Scanner(System.in);



        System.out.println("Would you like to apply for a credit card?");
        for(int num1=0;num1<11;num1++) {

            boolean card=input.nextBoolean();
            if (!card){
                // Scanner can be also here!!!!!
                System.out.println("Would you like to apply for a credit card?");
                continue;
            } else if(card){
                System.out.println("Looks like you have already one");
                break;


            }
        }

        // (card.equalsIgnoreCase("Yes")) reassigning of true , or false



    }
}
