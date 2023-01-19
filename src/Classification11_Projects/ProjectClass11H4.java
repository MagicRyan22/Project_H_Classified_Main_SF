package class11;

import java.util.Arrays;

/*3) Using 2D array create a grocery list.
        Inside you should have an array of veggies,
        fruits, dairy and sweets. Retrieve all values
        from that array using 2 different loops*/
public class ProjectClass11H4 {
            public static void main(String[] args) {

                String [][] List={{"Cucumber","Tomatoes","Carrot"},{"Apples","Oranges","Bananas"},
                        {"Milk","Cheese","Sour-cream"},{"Candy","Chocolate","Marshmallows"}};

                int i=0;
                while(i< List.length){
                    System.out.println(Arrays.toString(List[i]));
                    i++;
                }

                System.out.println("***********************************");

                for (int j = 0; j < List.length; j++) {
                    System.out.println(Arrays.toString(List[j]));

                }


            }
}
