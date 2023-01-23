package class12;

import java.util.Scanner;

/*3) Write a program that reads two people's first
         names and if they expecting boy or girl?
         Based on the input suggests a name for a baby:
         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? boy
         Suggested baby name: DANRY

         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? girl
         Suggested baby name: MAIEL*/
public class Homework3 {
                public static void main(String[] args) {

                        Scanner input=new Scanner(System.in);

                        System.out.println("Please enter Mom's first name");
                        String momsName= input.next();
                    System.out.println("Please enter Dad's first name");
                    String dadsname= input.next();
                    System.out.println("Please Enter the expected Baby gender");
                    boolean boy= input.hasNext("boy");
                    boolean girl= input.hasNext("girl");

                    String babiesName;
                    if (boy){
                        babiesName=(dadsname.substring(0,2).concat(momsName.substring(3)));
                        System.out.println(babiesName.toUpperCase());
                        } else if (girl) {
                        babiesName=(momsName.substring(0,2).concat(dadsname.substring(3)));
                        System.out.println(babiesName.toUpperCase());
                    }


                }
}
