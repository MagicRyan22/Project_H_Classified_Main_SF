package Classification17_Projects;
        /*5) Write a Student class   that have instance variables name and address.
        Create a constructor that will initialize those variables. Print name &
        address of given  student using displayInfo method.*/
public class HomeworkStudentAddress {

        String StudentName;
        String StudentLastname;
        String State;
        String City;
        String Street;
        int HouseNumber;

        HomeworkStudentAddress(String studentName,String studentLastname,String state,String city,String street,int houseNumber){
                StudentName=studentName;
                StudentLastname=studentLastname;
                State=state;
                City=city;
                Street=street;
                HouseNumber=houseNumber;
        }
        void displayAddressInfo(){
                System.out.println("First Name - "+StudentName+"\n"+"Last Name - "+StudentLastname+"\n"+"State - "+State+"\n"+"City - "+City+"\n"+"Street - "+Street+"\n"+"HouseNumber - "+HouseNumber);
        }


}
