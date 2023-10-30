package src.main.java.MyApp.customerResponse;

import java.util.Scanner;

public class CustResponse {


    public Scanner scanner = new Scanner(System.in);

    public String nameInput() {

        System.out.println("Enter your name :   ");
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

    public  int ssnInput() {
        System.out.println("Please Enter your last four digits of SSN :    ");
        int SSN = scanner.nextInt();
        return SSN;
    }


    public  double birthInput() {
        System.out.println("Enter your Date of Birth as mm.dd :      ");
        double DOB = scanner.nextDouble();
        return DOB;
    }
}