package class11;

import java.util.Scanner;

public class PhoneTesting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Phone Samsung=new Phone();
        Samsung.brand="Samsung";
        Samsung.colour="Black";
        Samsung.model="S22Ultra";
        Samsung.ScreenSize=6.9;
        Samsung.Functions="Touch";
        Samsung.PriceRange=1200;

        Samsung.VoiceTone();
        Samsung.Vibration();
        Samsung.RingTone();



        Phone IPhone=new Phone();
        IPhone.model="14Pro";
        IPhone.brand="Apple";
        IPhone.colour="Silver";
        IPhone.Functions="Touch";
        IPhone.ScreenSize=6.7;
        IPhone.PriceRange=1600;

        IPhone.RingTone();
        IPhone.Vibration();
        IPhone.VoiceTone();


        Phone Pixel=new Phone();
        Pixel.brand="Google";
        Pixel.model="7Pro";
        Pixel.ScreenSize=6.5;
        Pixel.colour="white";
        Pixel.Functions="Touch";
        Pixel.PriceRange=800;

        Pixel.VoiceTone();
        Pixel.Vibration();
        Pixel.RingTone();



    }
}
