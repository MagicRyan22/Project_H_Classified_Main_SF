package class13;

import java.util.Scanner;

/*5) How would you check if String is palindrome or not? aba=> true
         Abbc =>false

         6) How would you swap  2 strings without a temporary variable?*/
public class Homework3 {
     public static void main(String[] args) {

         String str, rev = "";
         Scanner input = new Scanner(System.in);

         System.out.println("Enter a string:");
         str = input.nextLine();

         int length = str.length();

         for ( int i = length - 1; i >= 0; i-- )
             rev = rev + str.charAt(i);

         if (str.equals(rev))
             System.out.println(str+" is a palindrome");
         else
             System.out.println(str+" is not a palindrome");

         System.out.println("************************************************");


         String str2 = "Radar", reverseStr = "";

         int strLength = str2.length();

         for (int i = (strLength - 1); i >=0; --i) {
             reverseStr = reverseStr + str2.charAt(i);
         }

         if (str2.toLowerCase().equals(reverseStr.toLowerCase())) {
             System.out.println(str2 + " is a Palindrome String.");
         }
         else {
             System.out.println(str2 + " is not a Palindrome String.");
         }

         System.out.println("***********  swap strings  ******************");

         String str0="Java is cool";
         String str1="Java is grat";

         str0=str0+str1;
         str1=str0.substring(0,(str0.length()-str1.length()));
         str0=str0.substring(str1.length());

         System.out.println(str0);
         System.out.println(str1);


         System.out.println("*****************************************");

         String a = "We will get a job";
         String b = "If we study hard";

         b = a + (a = b).substring(0, 0);

         System.out.printf("A: %s, B: %s", a, b);
     }
}
