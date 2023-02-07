package Classification17_Projects;
        /*6) Write Book class that will have instance variables and 2 Constructors.
        While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed
        You do not have permission to send messages in this channel.*/
public class HomeworkBook {

        String BookName;
        String BookGenre;

        String BookAuthor;

        int BookTome;

        int BookRating;

        HomeworkBook(String bookName,String bookGenre,String bookAuthor,int bookTome,int bookRating){
             BookName=bookName;
             BookGenre=bookGenre;
             BookAuthor=bookAuthor;
             BookTome=bookTome;
             BookRating=bookRating;

        }
        void BookInfo(){
                System.out.println("BookName: "+BookName+",  Genre: "+BookGenre+",  Author: "+BookAuthor+",  Tome: "+BookTome+",  Rating: "+BookRating);
        }

        void BookRecommendation(){
                System.out.println("BookName: "+BookName+",  Genre: "+BookGenre);
        }
}
