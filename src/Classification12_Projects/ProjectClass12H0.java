package class12;
        /*1) Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        For Example String str=hello =>l*/

public class Homework {
        public static void main(String[] args) {

                String hello="HelloGuys";


                        if ((!hello.isEmpty()) && (hello.length() % 2 != 0) && (hello.length() > 3)) {
                            int mid = (hello.length() / 2);
                            System.out.println(hello.charAt(mid));
                        }



            String hello1= "HelloGuys";
            if ((!hello.isEmpty()) && (hello1.length() % 2 != 0) && (hello1.length() > 3)) {
                int middle = (hello1.length() / 2);
                System.out.println(hello1.charAt(middle));
            }



        }
}
