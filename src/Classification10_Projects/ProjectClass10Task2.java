package GroupProject;
/*2)Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital for each country.
        (use 2 different loops).*/
import java.util.Scanner;


public class ProjectClass10Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] countries = new String[5];
        String[] capitals = new String[5];

        int a = 0;
        while (a < countries.length && a < capitals.length) {
            System.out.println("Please enter The Countries");
            countries[a] = input.next();
            System.out.println("Please enter the Capitals");
            capitals[a] = input.next();
            System.out.println();
            System.out.println("The Capital of the County " + countries[a] + " is " + capitals[a]);
            a++;

        }


        System.out.println("************************************************");

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter country ");
            countries[i] = input.next();

            System.out.println("Please enter capital ");
            capitals[i] = input.next();
            System.out.println("\nThe capital of the  " + countries[i] + " is " + capitals[i] + "\n");

        }

        System.out.println("*****************************************************");

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Please enter The Countries");
            countries[i] = input.next();
            System.out.println("Please enter the Capitals");
            capitals[i] = input.next();
        }
        for (int j = 0; j < countries.length; j++) {

            System.out.println("The Capital of the County " + countries[j] + " is " + capitals[j]);
            System.out.println();
        }

        System.out.println("**************************************************");

        int i = 0;
        int j=0;
        while (i < countries.length) {
            System.out.print("Enter Name of the Country: ");
            countries[i] = input.nextLine();
            System.out.print("Enter it's Capital: ");
            capitals[i] = input.nextLine();
            //   System.out.println(capitals[i]+" is the capital of "+countries[i]);
            i++;
        }
        while(j < capitals.length){
            System.out.println(capitals[j]+ " is the capital of " + countries[j]);
            j++;
        }








    }
}
