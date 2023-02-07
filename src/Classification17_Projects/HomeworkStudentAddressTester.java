package Classification17_Projects;

public class HomeworkStudentAddressTester {
    public static void main(String[] args) {

        HomeworkStudentAddress Alex=new HomeworkStudentAddress("Alexander","Friz","NRW","Troisdorf","Orchideen pl.",33);
        HomeworkStudentAddress Elisabeth=new HomeworkStudentAddress("Elizabeth","Ronalds","NY","NY","West N",526);
        HomeworkStudentAddress Alexis=new HomeworkStudentAddress("Alexis","Friz","New Jersey","Marlboro","Lincoln Cir.",55);

        Alex.displayAddressInfo();
        System.out.println("*************************");
        Elisabeth.displayAddressInfo();
        System.out.println("**************************");
        Alexis.displayAddressInfo();
    }
}
