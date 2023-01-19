package GroupProject;
//3) Create a 2D array of integer values. Print the sum of all numbers.
//4) Create a 2D array or integer type where you will store odd and even numbers.
       // Develop a program which will identify/print the even numbers only.
import java.util.Arrays;
import java.util.Scanner;


public class ProjectClass10Task3 {
    public static void main(String[] args) {

        int [] [] num={{10,20,30,40,50},{11,22,33,44,55}};


        int sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
            }

        }
        System.out.println("Sum of all numbers is "+sum);

        System.out.println("**********************************************");


        int [] [] num1={{5,20,33,47,52},{11,21,30,44,55}};
        System.out.println("even numbers are :");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                if((num1[i][j])%2==0){
                    System.out.print(num1[i][j]+ " ");
                }
            }
        }
        System.out.println();
        System.out.println("odd numbers are :");
        for (int a = 0; a < num1.length; a++) {
            for (int b = 0; b < num1[a].length; b++) {
                if ((num1[a][b]) % 2 != 0) {
                    System.out.print(num1[a][b]+" ");
                }
            }
        }










    }
}
