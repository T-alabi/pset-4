import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input values
        System.out.print("Temperature : ");
        double temp = input.nextDouble();
        System.out.print("Wind speed  : ");
        double windSpeed = input.nextDouble();

        //math
        double calcWindChill = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75)*Math.pow(windSpeed, 0.16);

        System.out.print("\n");
        System.out.printf("Wind Chill  : %,.2f" ,  calcWindChill);

        input.close();


    }
}
