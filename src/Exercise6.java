import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length    : ");
        double length = in.nextDouble();
        System.out.print("Width     : ");
        double width = in.nextDouble();

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width,2));

        System.out.print("\n");
        System.out.printf("Area      : %,.2f\n", area);
        System.out.printf("Perimeter : %,.2f\n" , perimeter);
        System.out.printf("Diagonal  : %,.2f", diagonal);

        in.close();
    }
}
