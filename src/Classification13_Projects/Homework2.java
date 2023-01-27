package class13;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

        //4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever



public class Homework2 {
    public static void  main(String[] args) {

        // reverses the string with words in a right written order of letters

        String str="This is sentence i want to reverse";

        String arr[]=str.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("********************  1  ***********************");

        Stack<String> stack=new Stack<>();
        StringTokenizer st=new StringTokenizer(str);
        while (st.hasMoreTokens()){
            stack.push(st.nextToken());
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("***********************  2  ***************************");


        String words1[]=str.split("//s"); //same as space
        String reversewords="";
        for(String w:words1){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reversewords=reversewords+sb.toString()+" ";
        }
        System.out.println(reversewords);
        System.out.println();

        System.out.println("*****************  3   ***********************");

        String[]words2=str.split("//s");
        String revStr="";
        for (int i = 0; i < words2.length; i++) {
            String word=words2[i];
            String revWord="";
            for (int j = word.length()-1; j >=0 ; j--) {
                revWord=revWord+word.charAt(j);
            }
            revStr=revStr+revWord+" ";
        }
        System.out.println(revStr);


        System.out.println("*****************   4   *************************");

        //reverses words in the same order as outgoing String

        String words[]=str.split(" "); // Splitting the String into separate words
        String reversedString="";
        for(String w:words){   // contains  the firs word: This / is / sentence / i / want / to / reverse
            String reverseWord="";
            for (int i = w.length()-1;i>=0;i--) {
                reverseWord=reverseWord+w.charAt(i);
            }
            reversedString=reversedString+reverseWord+" ";  // contains reversed first word: sihT si ecnetnes i...
        }
        System.out.println(reversedString);
        System.out.println();
        System.out.println("*******************  5   **************************");

        Scanner input = new Scanner(System.in);
        System.out.print("Original string : ");

        String originalStr = input.nextLine();
        input.close();

        String Strwords[] = originalStr.split("\\s");
        String revString = "";

        for (int i = 0; i < Strwords.length; i++)
        {
            String word3 = Strwords[i];
            String revWord = "";
            for (int j = word3.length() - 1; j >= 0; j--) {
                revWord = revWord + word3.charAt(j);
            }
            revString = revString + revWord + " ";
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + revString);




    }
}
