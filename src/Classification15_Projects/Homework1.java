package class15;

public class Homework1 {

      // 1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
    String numSize(int num1, int num2) {
        if (num1 > num2) {
            return num1+" is the larger one";
        } else {
            return num2+ " is the larger one";
        }
    }

    //2) Create a method that will take a number and prints whether the number is even or odd.
    String evenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is even";
        } else {
            return num + " is odd";
        }
    }

    // 3) Create a method that will print whether given String is palindrome or not.
    String Palindrome(String str){
        String revStr="";

        for (int j = str.length()-1; j >= 0; j--) {
            revStr = revStr + str.charAt(j);

            if (str.toLowerCase().equals(revStr.toLowerCase())) {

                return str + " is Palindrome";
            }
        }
        return " is not Palindrome";
    }

    // 4)Create a method that will say Hello in different language based on the country
    //   that will be passed when method is executed

    String Hello(String country){

        switch (country.toLowerCase()) {

            case "usa":
                return "Hello";
            case "india":
                return "हेलो";
            case "russia":
                return "Привет";
            case "france":
                return "Salut";
            case "germany":
                return "Hallo";
            case "turkey":
                return "Merhaba";
            case "israel":
                return "שלום";
            case "china":
                return "你好";
            case "japan":
                return "こんにちは";
            case "thailand":
                return "สวัสดี";
            default:
                return "False input!";

        }
    }



    //5) Write a method to return whether given number is prime or not?
    String Prime(int given) {
        boolean isPrime = true;

        if (given > 1) {
            for (int i = 2; i < given; i++) {
                if (given % 2 == 0||given%3==0) {
                    isPrime = false;
                    return given+" is not a Prime number" ;
                }
            }

        } else {
            isPrime = false;
            return given+" is not a Prime number" ;
        }
        return given+" is a Prime number" ;
    }


     /*6)Create  class Student that will have a method getGrade. Your method
    should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F*/

String score(int score){
    if((score>0)&&(score<=50)){
        return "your grade is F"; 
    } else if ((score>50)&&(score<=70)) {
        return "your grade is D";
    } else if ((score>70)&&(score<=80)) {
        return "Your grade is C";
    }else if ((score>80)&&(score<=90)){
        return "Your grade is B";
    }else if (score>90){
        return "Your grade is A";
    }
    return " false input";
}


}
