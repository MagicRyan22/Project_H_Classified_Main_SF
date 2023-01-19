package class11;
        /*2) Create 2D array of cars : american, german,
        korean, italian. Then retrieve all values from
        that array using 2 different loops*/
public class ProjectClass11H3 {
            public static void main(String[] args) {

                String[][]Cars={{"Ford","Chevrolet","Cadillac"},{"BMW","Mercedes","Volkswagen"},{"Hyundai","KIA"},
                                {"Ferrari","Maserati","Lamborghini"}};

                for (int i = 0; i < Cars.length; i++) {
                    for (int j = 0; j < Cars[i].length; j++) {
                        System.out.println(Cars[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("*******************************");


                for (String []arr:Cars) {
                    for (String brand : arr) {
                        System.out.println(brand);
                    }
                    System.out.println();
                }



            }
}
