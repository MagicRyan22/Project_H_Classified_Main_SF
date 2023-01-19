package GroupProject;

import java.util.Scanner;

/*1)Using Scanner create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.*/
public class ProjectClass10Task1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int [] num=new int[5];
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            num [i]= input.nextInt();
            sum+=num[i];

        }
        System.out.println(sum);
    }

}
