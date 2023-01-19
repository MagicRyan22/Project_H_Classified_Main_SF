package class11;
        /*Create a 2D array or integer type where you will store odd and even numbers
        in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
         */
public class ProjectClass11H1 {
            public static void main(String[] args) {

                int[][]nmbers={{12,35,90,40},{31,21,20,11},{22,15,64,42}};

                for (int i = 0; i < nmbers.length; i++) {
                    for (int j = 0; j < nmbers[i].length; j++) {
                        if((nmbers[i][j])%2==0){
                            System.out.print(nmbers[i][j]+" ");
                        }
                    }
                }


            }
}
