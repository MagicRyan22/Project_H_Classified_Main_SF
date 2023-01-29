package class15;

        /*Create a method createEmail(). Based on values of users name, lastName and email type,
        your method should return complete email Address.
        Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or*/



public class Homework {

    String eMail(String name,String lastName,String eMail){
        return name.toLowerCase()+lastName.toLowerCase()+"@"+eMail+".com";
    }
}
