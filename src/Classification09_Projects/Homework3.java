package class9;
        /*4) Create an array that can store names of cars and store 6 elements into it.
        Print all values from the array.
         */
public class Homework3 {
        public static void main(String[] args) {

          String[] cars={"BMW","Ford","Maserati","Porsche","Cadillac","Ferrari"};

            String[]word=new String[6];
            word[0]=cars[0];
            word[1]=cars[1];
            word[2]=cars[2];
            word[3]=cars[3];
            word[4]=cars[4];
            word[5]=cars[5];

            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);

            }

        }
}
