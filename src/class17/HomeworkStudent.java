package class17;
/*2)Write a java Class Students that have a constructor which takes
        students name and 3 subject grades. Inside your class also have a
        method to Calculate Average Grade. Test Student class for 5 different
        students with different marks. Your program should print an average
        mark of each students name.
         */
        //NOTE: please use different names for instance and local variables.
public class HomeworkStudent {

    String StudentName;

    double ScienceGrade;

    double MathGrade;

    double HistoryGrade;

    double Average;



    HomeworkStudent(String studentName,int scienceGrade,int mathGrade,int historyGrade){
        StudentName=studentName;
        ScienceGrade=scienceGrade;
        MathGrade=mathGrade;
        HistoryGrade=historyGrade;
        Average=(ScienceGrade+MathGrade+HistoryGrade)/3;

    }

    void AverageGradeInfo(){

        System.out.println(StudentName+" "+String.format("%.1f",Average));
    }


}
