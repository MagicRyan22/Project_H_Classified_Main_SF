package class9;
        /*2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */
public class Homework1 {
        public static void main(String[] args) {

              String[] GroupMembers={"Adem","Tarik","Nelson","Natalia","Hiral","Dena","Daria","Asli","Abeera","Abdul","Slava"};

                System.out.println(GroupMembers[10]);

                for (int i = 0; i < GroupMembers.length; i++) {
                        if(i==10){
                                System.out.println(GroupMembers[i]);
                        }
                }

        }
}
