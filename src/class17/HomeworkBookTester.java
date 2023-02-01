package class17;

public class HomeworkBookTester {
    public static void main(String[] args) {


        HomeworkBook HarryPotter =new HomeworkBook("Harry Potter","Fantasy","J.K.Rowling",3,10);
        HomeworkBook Metro2033 =new HomeworkBook("Metro 2033","Horror,Science Fiction","Dmitri Glukhovsky",1,9);
        HomeworkBook Law =new HomeworkBook("Constitutional Law And Politics: Civil Rights And Civil Liberties","Law & Politics","David M. O'Brien",1,9);

        HarryPotter.BookInfo();
        Metro2033.BookInfo();
        Law.BookInfo();

        Metro2033.BookRecommendation();
        Law.BookRecommendation();
    }
}
