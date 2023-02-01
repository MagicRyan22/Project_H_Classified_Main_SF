package class17;
        /*Write a java class that will have a constructor: one with
        parameters and second without any parameters. Create a
        separate Test class where you will execute both of the
        constructors 1 by 1.
        //NOTE: please use different names for instance and local variables.*/



public class Homework {

    String taskName;

    int taskNumber;
    String task;

    String taskHint;


   /* static Homework(String TaskName,int TaskNumber){
        taskName=TaskName;
        taskNumber=TaskNumber;
    }*/


    Homework(String TaskName,int TaskNumber,String Task,String TaskHint){
        taskName=TaskName;
        taskNumber=TaskNumber;
        task=Task;
        taskHint=TaskHint;
    }
    Homework(){

    }
    void taskInfo(){
        System.out.println(taskName+taskNumber+task+taskHint);
    }



    public static void main(String[] args) {




    }

}
