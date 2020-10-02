import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);

         System.out.print("Centimeters : ");
         int centimeters = in.nextInt();

         int kilometers = centimeters / 100000;
         int meters = (centimeters - (kilometers * 100000))/100;
         int leftOverCentimeters = (centimeters - ((kilometers * 100000) + (meters * 100)));

         System.out.print("\n");
         System.out.println("Kilometers  : " + kilometers);
         System.out.println("Meters      : " + meters);
         System.out.println("Centimeters : " + leftOverCentimeters);

         in.close();
    }
}
