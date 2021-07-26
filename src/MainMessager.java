import java.util.Scanner;

public class MainMessager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your first name");
        String myFirstName = in.nextLine();
        System.out.println("Your last name");
        String myLastName = in.nextLine();
        System.out.println("Choose your country");
        String myCountry = in.nextLine();

        System.out.println(checkYourInfo());



    }

    public static String checkYourInfo () {
        String yourInfo = "";
        return yourInfo;
    }

}
