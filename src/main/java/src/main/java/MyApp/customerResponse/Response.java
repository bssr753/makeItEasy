package src.main.java.MyApp.customerResponse;

import java.util.Objects;
import java.util.Scanner;

public class Response {


    public static Scanner scanner = new Scanner(System.in);

    public  static String nameInput() {

        System.out.println("Enter your name ;   ");
        String name = scanner.nextLine();
        System.out.println(name);

        return name;
    }



//    public static void statusInput() {
//        System.out.println("Hello %s, How are you doing? :    " + nameInput());
//        String status = scanner.nextLine();
//        scanner.close();
//        ssnInput();
//    }

    public static int ssnInput() {
        System.out.println("Please Enter your last four digits of SSN :    ");
        int SSN = scanner.nextInt();
        return SSN;
    }


    public static double birthInput() {
        System.out.println("Enter your Date of Birth as mm.dd.yyyy :      ");
        double DOB = scanner.nextDouble();
        return DOB;
    }
}