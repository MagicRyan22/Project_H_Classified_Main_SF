package class11;
        /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
         */
public class ProjectClass11H5 {
            public static void main(String[] args) {

                int [][]num={{15,40,20,},
                             {20,45,33},
                              {91,14,5}};
                int sum=0;
                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < num[i].length; j++) {
                        sum+=num[i][j];
                    }
                }
                System.out.println(sum);


            }
}
