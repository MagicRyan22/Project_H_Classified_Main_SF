package class8;
        /*3) Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers.

         4) Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
         */

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Provide me please the first number");
        int start= input.nextInt();
        System.out.println("Provide me please the second number");
        int end= input.nextInt();

        int even=0;
        int odd=0;

        if(start<end) {
            for (int a = start; a <= end; a++) {

                if (a%2==0) {
                    even+=a;
                }else{
                    odd+=a;
                }
            }
                System.out.println("sum of even numbers " +even);
                System.out.println("sum of odd numbers " +odd);
        }else{
                for (int a = start; a >= end; a--) {
                    if(a%2==0){
                        even+=a;
                    }else{
                        odd+=a;
                     }
                }
            System.out.println("sum of even numbers " +even);
            System.out.println("sum of odd numbers " +odd);
            }

        System.out.println("*********************************************");


        System.out.println("What would you like to buy?");
        String item= input.next();
        //System.out.println("What is the price of it?");

        //Item : Notebook - $1850.99 /Camera - $83.99/Coke - $3.99

        double ammount=0;
        double a=1850.99;
        double b=83.99;
        double c=3.99;
        switch (item){

            case "Notebook":
                System.out.println("Please pay the amount of $1850.99");
                double amount= input.nextDouble();
                if(amount<a){
                    amount-=a;
                    System.out.println("Please pay the balance of $ "+String.format("%.2f",amount));
                }else{
                    amount-=a;
                    System.out.println("U are getting a change of $ "+String.format("%.2f",amount));
                }
                break;
            case "Camera":
                System.out.println("Please pay the amount of $83.99");
                double amount1= input.nextDouble();
                if(amount1<b){
                    amount1-=b;
                    System.out.println("Please pay the balance of $"+String.format("%.2f",amount1));
                }else{
                    amount1-=b;
                    System.out.println("U are getting a change of $ "+String.format("%.2f",amount1));
                }
                break;
            case "Coke":
                System.out.println("Please pay the amount of $3.99");
                double amount2= input.nextDouble();
                if(amount2<c){
                    amount2-=c;
                    System.out.println("Please pay the balance of $ "+String.format("%.2f",amount2));
                }else{
                    amount2-=c;
                    System.out.println("U are getting a change of $ "+String.format("%.2f",amount2));
                }

                break;
            default:
                System.out.println("Item is not available");
        }

    }
}
