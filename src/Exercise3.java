import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Length       : ");
        double length = in.nextDouble();
        System.out.print("Width        : ");
        double width = in.nextDouble();
        System.out.print("Diameter     : ");
        double diameter = in.nextDouble();

        double totalArea = length * width;
        double circleArea = (Math.pow((diameter/2),2) * Math.PI);

        System.out.print("\n");
        System.out.printf("Surface area : %,.2f ", (totalArea-circleArea));

        in.close();
    }
}
