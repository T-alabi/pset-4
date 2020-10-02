import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Diameter      : ");
        double diameter       = in.nextDouble();

        double area = Math.PI * Math.pow((diameter/2),2);
        double circumference  = Math.PI * diameter;

        System.out.print("\n");
        System.out.printf("Area           : %,.2f\n", area);
        System.out.printf("Circumference  : %,.2f" , circumference);

        in.close();
    }
}
