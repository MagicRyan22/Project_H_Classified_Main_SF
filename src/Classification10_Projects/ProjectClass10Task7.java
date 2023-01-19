package GroupProject;
  //10)Write a java program to find the second largest number in the array?
  // 11)Write a program to print out duplicate elements from an Array of Strings?
public class ProjectClass10Task7 {
    public static void main(String[] args) {

        /*
        iter    Iterate (for each..in)
        itin    Iterate (for..in)
        itli    Iterate over a List
        itar    Iterate elements of array
        ritar   Iterate elements of array in reverse order
         */
        int temporary =0;
        int size = 0;
        int []num={10,20,30,40,50,11,22,33,44,55};

        size = num.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(num[i]>num[j]) {
                    temporary = num[i];
                    num[i] = num[j];
                    num[j] = temporary;
                }
            }
        }
        System.out.println("The second largest number in the Array is "+num[size-2]);

        System.out.println("****************************************");


        String [] Words = {"Name","Cat","Mouse","City","Mouse","Hello","Cat","Cat"};

        int sum1=0;
        int sum=0;
        for (int i = 0; i < Words.length; i++) {

            if(Words[i]=="Cat"){
                sum++;
                System.out.print(Words[i]+" ");
                System.out.println();
            }else if(Words[i]=="Mouse"){
                sum1++;
                System.out.print(Words[i]+" ");
                System.out.println();
            }
        }
        System.out.println("Cat is present :"+sum+" times. Mouse is present :"+sum1+" times");



    }
}
