package class9;
        /*5) Create an array of size 5 on integers and calculate the
        sum of all elements in an array.
         */
public class Homework4 {
        public static void main(String[] args) {

            int[]num=new int[5];

            num[0]=120;
            num[1]=56;
            num[2]=35;
            num[3]=222;
            num[4]=18;
            int sum=0;
            for (int i = 0; i < num.length; i++) {
                sum+=num[i];
            }
            System.out.println(sum);
        }
}
