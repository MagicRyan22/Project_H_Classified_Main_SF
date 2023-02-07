package Classification17_Projects;

public class HomeworkTask3Tester {
    public static void main(String[] args) {

       // HomeworkTask3 task=new HomeworkTask3("Student");  // Private
       // task.tasks();
        HomeworkTask3 task1=new HomeworkTask3("Student","Address");
        task1.tasks();
        HomeworkTask3 task2=new HomeworkTask3("Student","Address","Book");
        task2.tasks();
        HomeworkTask3 task3=new HomeworkTask3("Student","Address","Book","Tasks");
        task3.tasks();


    }
}
