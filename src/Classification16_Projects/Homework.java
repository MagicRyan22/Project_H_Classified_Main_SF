package class16;
        /*1) Create a method that will accept an array as parameters and will return a sum of all
        elements from that array. Method should be visibly only within same package and
        accessible by the creating an instance of the class.
        2) Create a method that will take a String as a parameter and returns reversed String.
        Method should be available to all classes within your project and accessible by class name.
        3) Create a method that will accept a String as a parameter and return a new String
        that consist only of vowels. Method should be available inside the class only
        where it was declared and executed by calling it is name.*/

public class Homework {


    int sumArrElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public String revString(String regString ){

        StringBuilder str=new StringBuilder(regString);
        str.reverse();
        String reversedStr=str.toString();
        return  regString+ "---revered is--- "+str;
    }

    private String vowels(String original){

        String str =original.replaceAll("[^aeiou]"," ");

        return original+ " otput is "+str;
    }


    public static void main(String[] args) {

        int[]arr={10,20,30,40,50};
        Homework homework=new Homework();

        System.out.println(homework.sumArrElements(arr));

        System.out.println(homework.revString("Java is awesome!"));


        System.out.println(homework.vowels("Java is awesome!"));
    }
}
