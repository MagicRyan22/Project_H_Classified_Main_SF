package class11;
        /*1) Create a 2D array(shorter way) in which first array
        will consist of 4 names and second array will
        contain grades. Then your program should print
        name of the students that has A and B grade */
public class ProjectClass11H2 {
            public static void main(String[] args) {

                String[][] names={{"Michael","C"},{"Jackson","B"},{"Harrison","B"},{"Ford","A"}};


                for (int i = 0; i < names.length; i++) {
                    for (int j = 0; j < names[i].length; j++) {
                            if(i!=0) {
                                System.out.println(names[i][j]);
                            }

                    }
                }

                System.out.println("*******************************************");

                String[][] names1={{"Michael","Jackson","Harrison","Ford"},{"C","B","B","A"}};

                for (int i = 0; i < names1.length; i++) {
                    for (int j = 0; j < names1[i].length; j++) {
                        if(j!=0){
                            System.out.println(names1[i][j]);
                        }
                    }

                }


                System.out.println("******************************************");


                for (int i = 0; i < names1.length; i++) {
                    for (int j = 0; j < names1[i].length; j++) {
                        if((names1[i][j])==names1[i][6]||(names1[i][j])==(names1[i][7])) {
                            System.out.print(names1[i][j]);
                        }

                    }
                }



            }
}
