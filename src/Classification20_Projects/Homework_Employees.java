package Classification20_Projects;
        /*2. Create an Employee class that will have variables and methods.
        Constructor that should initialize instance variables
        Create 2 subclasses FullTime and PartTime Employees that should
        have own variables and methods.
        Create a Tester Subclass from FullTime Employee
        and add some features and methods to the Tester Class.
        Test your code!*/
public class Homework_Employees {
    String firstName;
    String lastName;
    double hourlyPay=65.0;
    double weeklyFullTimeHours=40.0;
    boolean fullTime = true;
    double monday;
    double tuesday;
    double wednesday;
    double thursday;
    double friday;
    double saturday;

    double overTimeHours(){
        double ovTH=(hoursWorked()-weeklyFullTimeHours);
        return ovTH;
    }
    double hoursWorked(){
        double hW=monday+tuesday+wednesday+thursday+friday+saturday;
        return hW;
    }

    Homework_Employees(String firstName,String lastName,boolean fullTime,double monday,double tuesday,double wednesday,double thursday,double friday,double saturday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.fullTime=fullTime;
        this.monday=monday;
        this.tuesday=tuesday;
        this.wednesday=wednesday;
        this.thursday=thursday;
        this.friday=friday;
        this.saturday=saturday;
    }

    Homework_Employees(String firstName,String lastName,double monday,double tuesday,double wednesday,double thursday,double friday,double saturday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.monday=monday;
        this.tuesday=tuesday;
        this.wednesday=wednesday;
        this.thursday=thursday;
        this.friday=friday;
        this.saturday=saturday;
    }



}
class PartTime extends Homework_Employees{

    PartTime(String firstName, String lastName, double monday, double tuesday, double wednesday, double thursday, double friday, double saturday) {
        super(firstName, lastName, monday, tuesday, wednesday, thursday, friday, saturday);
    }

    double hoursWorkedPart(){
        double hW=monday+tuesday+wednesday+thursday+friday+saturday;
        return hW;
    }
    double basePay(){
        double bp=hoursWorkedPart()*hourlyPay;
        return bp;
    }

    String bonusNot(){
        return "You, as a part Time worker are not eligible for a Bonus";
    }

    void hoursAndPay(){
        System.out.println("You have worked a total of "+hoursWorked()+" hours,  and based on that your payout out will be $"+basePay());
    }

    void bonus(){
        System.out.println(bonusNot());
    }




}

class FullTime extends Homework_Employees{

    FullTime(String firstName, String lastName, boolean fullTime, double monday, double tuesday, double wednesday, double thursday, double friday, double saturday) {
        super(firstName, lastName, fullTime, monday, tuesday, wednesday, thursday, friday, saturday);
    }

    String bonus;

    double overTimePay() {
        double overTimeP = (((overTimeHours() * hourlyPay) / 100)* 25);
        return overTimeP;
    }

    double totalPay(){
        double totalP=((hoursWorked()*hourlyPay)+overTimePay());
        return totalP;
    }
    void pay(){
        System.out.println("You have worked a total of "+hoursWorked()+" hours, you have "+overTimeHours()+" hours of over Time and based on that your pay out will be $"+totalPay());
    }

    String bonusYes(){
        return "You will get a yearly bonus of $ 5000, after a full 12 month Employmentship! ";
    }

    void bonus(){
        System.out.println(bonusYes());
    }
}

class Salary{
    public static void main(String[] args) {

        PartTime pt=new PartTime("Michael","McDonald",6,3,3,4,2,0);

        pt.hoursAndPay();
        pt.bonus();

        System.out.println("***********************************************************");

        FullTime ft=new FullTime("Ryan","Friz",true,9,12,8,14,8,10);

        ft.pay();
        ft.bonus();
    }
}
