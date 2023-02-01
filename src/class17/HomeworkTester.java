package class17;

public class HomeworkTester {
    public static void main(String[] args) {

        Homework task1=new Homework("first Task ",1," two Construtors"," NOTE: please use different names for instance and local variables.");
        Homework task2=new Homework("second Task ",2," Students and Grades "," NOTE: please use different names for instance and local variables.");

        Homework task3=new Homework();


        task1.taskInfo();
        task2.taskInfo();

        task3.taskInfo();
    }
}
