package class9;
        /*1) Create an array of chars and store grades into it: A,B,C,D,E,F.
        Then print a grade B (use 2 different ways of creating an array).
         */

public class Homework {
        public static void main(String[] args) {
              
                char[]letter={'A','B','C','D','E','F'};

                System.out.println(letter[1]);

                for (int i = 0; i < letter.length; i++) {
                        if(i==1){
                                System.out.println(letter[i]);

                        }
                }

                
                
        }
              
}
