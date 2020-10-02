import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What's your favorite city? ");
        String city = in.nextLine();
        int cityLength = city.length();

        System.out.print("\n");
        System.out.println("Text   : " + city);
        System.out.println("Length : " + cityLength);
        System.out.println("Upper  : " + city.toUpperCase());
        System.out.println("Lower  : " + city.toLowerCase());

        in.close();
    }
}
