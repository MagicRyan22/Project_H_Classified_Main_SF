package GroupProject;
//5)Create a 2D array of integers. Develop a program which will calculate
// the sum of  even and odd numbers for that array.


public class ProjectClass10Task4 {
    public static void main(String[] args) {

        int sum1=0;
        int sum2=0;
        int [] [] num1={{5,20,33,47,52},{11,21,30,44,55}};

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                if((num1[i][j])%2==0){
                    sum1+=num1[i][j];
                }else{
                    sum2+=num1[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is "+sum1);
        System.out.println("Sum of odd numbers is "+sum2);










    }
}
