package class8;
        /*5) Print the following pattern:
        55555
        4444
        333
        22
        1

        6) Print the following pattern:
        *

        *

        *
        **
        *
        **
        *

         */
public class Homework3 {
        public static void main(String[] args) {


                for (int num = 5; num > 0; num--) {
                    for (int num1 = 0; num1 < num; num1++) {
                        System.out.print(num);


                    }
                    System.out.println();
                }

                System.out.println("***********************************");


            /*for (int num = 0; num <7; num++) {
                if(num==1||num==2) {
                    System.out.println();
                }

                for (int num2 = 0; num2 < 1; num2++) {
                        System.out.print("*");


                    }
                System.out.println();
                }*/

            System.out.println("***************************************");
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 1; j++) {
                    if (i == 2 || i == 4 ) {
                        System.out.println();
                    } else if (i == 6 || i == 8) {
                        System.out.println("**");
                    } else {
                        System.out.println("*");
                    }

                }
            }

            }
        }