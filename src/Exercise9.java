import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("First name  : ");
        String fname = in.nextLine();
        System.out.print("Middle name : ");
        String mname = in.nextLine();
        System.out.print("Last name   : ");
        String lname = in.nextLine();

        //        String textFirstHalf = text.substring(0,2);
        String fnameInital = fname.substring(0,1);
        String manmeInitial = mname.substring(0,1);
        String lnameInitial = lname.substring(0,1);

        String initals = fnameInital + manmeInitial + lnameInitial;

        System.out.print("\n");
        System.out.println(initals.toUpperCase() + ".");

        in.close();
    }
}
