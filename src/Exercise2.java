import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);

        System.out.print("Inches : ");
        int inches = in.nextInt();

        int miles = inches / 63360;
        int feet = (inches - (miles * 63360))/12;
        int leftOverInches = (inches - ((miles * 63360) + (feet * 12)));

        System.out.print("\n");
        System.out.println("Miles  : " + miles);
        System.out.println("Feet   : " + feet);
        System.out.println("Inches : " + leftOverInches);

        in.close();
    }
}
