import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Text : ");
        String text = in.nextLine();


        String textFirstHalf = text.substring(0,2);
        String textSecondHalf = text.substring(2);

        String upperCased = (textSecondHalf + textFirstHalf).toUpperCase();

        System.out.print("\n");
        System.out.print(upperCased + ".");

        in.close();
    }
}
