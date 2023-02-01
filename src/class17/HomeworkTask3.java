package class17;
        /*3) Write a java class that have 4 constructors with 4 different access
        levels of constructors(private,public,default,protected) and create 4
        objects of this class: 1 - inside same class; 2 - from outside the class;
        3 - from different class inside different package  and observe result.*/

        /*4)Write program that have static constructor and observe result.
        You do not have permission to send messages in this channel.*/
public class HomeworkTask3 {

        String Task1;
        String Task2;
        String Task3;

        String Task35;
        String Task4;

        private HomeworkTask3 (String taskStudent){
               Task1=taskStudent;


        }
        public HomeworkTask3 (String taskStudent,String taskAddress){
                        Task1=taskStudent;
                        Task2=taskAddress;
                }
        HomeworkTask3(String taskStudent,String taskAddress,String taskBook){
                        Task1=taskStudent;
                        Task2=taskAddress;
                        Task3=taskBook;
                }
        protected HomeworkTask3(String taskStudent,String taskAddress,String taskBook,String tasks){
                        Task1=taskStudent;
                        Task2=taskAddress;
                        Task3=taskBook;
                        Task4=tasks;
                }
        /* static HomeworkTask3(String taskStudent,String taskAddress,String taskBook,String tasks,String task35){
                        Task1=taskStudent;
                        Task2=taskAddress;
                        Task3=taskBook;
                        Task4=tasks;
                        Task35=task35;
                }   */


        public void tasks(){
                System.out.println(Task1+Task2+Task3+Task4);
        }

        public static void main(String[] args) {
                HomeworkTask3 task=new HomeworkTask3("Student");
                task.tasks();
                HomeworkTask3 task1=new HomeworkTask3("Student","Address");
                task1.tasks();
                HomeworkTask3 task2=new HomeworkTask3("Student","Address","Book");
                task2.tasks();
                HomeworkTask3 task3=new HomeworkTask3("Student","Address","Book","Tasks");
                task3.tasks();
        }

}
