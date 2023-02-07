package class9;
    /*3) Create an array of words: Java, Saturday, day, coding, is.
    Print the following sentence using elements of array: “Saturday is Java coding Day”.
     */
public class Homework2 {
        public static void main(String[] args) {

                String[]words={"Java","Satuday","day","coding","is"};

            String[]word=new String[5];
            word[0]=words[1];
            word[1]=words[4];
            word[2]=words[0];
            word[3]=words[3];
            word[4]=words[2];

            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i]+" ");

            }

        }
}
