package class9;
        /*6) Create an array of countries. While retrieving all values from an array
        print capital for each country choose any five countries.
         */
public class Homework5 {
        public static void main(String[] args) {


                String[]Countries={"USA","UK","India","Pakistan","Turkey"};

                String USA="Washington";
                String UK="London";
                String India="New Delhi";
                String Pakistan="Islamabad";
                String Turkey="Ankara";

                for (int i = 0; i < Countries.length; i++) {
                        if(Countries[i].equalsIgnoreCase("USA")){
                                System.out.println(Countries[i]+" - Capital is "+USA);
                        }if(Countries[i].equalsIgnoreCase("UK")) {
                                System.out.println(Countries[i] + " - Capital is " + UK);
                        }if(Countries[i].equalsIgnoreCase("India")) {
                                System.out.println(Countries[i] + " - Capital is " + India);
                        }if(Countries[i].equalsIgnoreCase("Pakistan")) {
                                System.out.println(Countries[i] + " - Capital is " + Pakistan);
                        }if(Countries[i].equalsIgnoreCase("Turkey")) {
                                System.out.println(Countries[i] + " - Capital is " + Turkey);
                        }

                }
        }
}
