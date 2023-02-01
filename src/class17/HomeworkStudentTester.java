package class17;

public class HomeworkStudentTester {
    public static void main(String[] args) {

        HomeworkStudent Michael=new HomeworkStudent("Michael",86,99,75);
        HomeworkStudent Rebecca=new HomeworkStudent("Rebecca",89,85,70);
        HomeworkStudent Jessica=new HomeworkStudent("Jessica",96,89,99);
        HomeworkStudent Donald=new HomeworkStudent("Donald",56,99,100);
        HomeworkStudent Sam=new HomeworkStudent("Sam",87,66,64);

        Michael.AverageGradeInfo();
        Rebecca.AverageGradeInfo();
        Jessica.AverageGradeInfo();
        Donald.AverageGradeInfo();
        Sam.AverageGradeInfo();
    }
}
