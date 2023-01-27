package class13;
        /*1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        2) Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
        characters are there in the String.

        3) You have a String a=”Is it saturday? Is it raining?
        Do we have a Java Class today?” How would you find out how many sentences are in that String?*/



public class Homework {
            public static void main(String[] args) {

                String str="I feel good,I feel great!";
                System.out.println(str.replace(" ",""));


                System.out.println("***************************************");

                String str1="ahewrgegJHGFTFKJHG867948013467&^$^%$&^%$&^$";

                int count=0;
                String str2=(str1.replaceAll("[^A-Za-z0-9]",""));
                for (int i = 0; i < str2.length(); i++) {
                    count++;
                }
                System.out.println(count);


                System.out.println("****************************************");

                String str3="Is it saturday? Is it raining? Do we have a Java Class today?";

                String[]separate=str3.split("[.?!]");
                System.out.println(separate.length);




            }
}
