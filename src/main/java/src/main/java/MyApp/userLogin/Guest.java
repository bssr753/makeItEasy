package src.main.java.MyApp.userLogin;

import src.main.java.MyApp.Bank;

import java.util.Scanner;

public class Guest extends UserAccess{
    private String UserName = "Guest";
    private String UserPassword = "GuestPass";
    private Scanner scanner = new Scanner(System.in);
   private Bank bank = new Bank();
    public String guestUser(){
        System.out.println("Enter Your Guest User Name:  ");
        String guestUserName= scanner.nextLine();
        return guestUserName;
    }

    public String guestUserPassword(){
        System.out.println("Enter Your Guest Password:  ");
        String guestUserPassword= scanner.nextLine();
        return guestUserPassword;

    }

    public String guestAsLogin(){
        if (guestUser().equalsIgnoreCase(this.UserName) && guestUserPassword().equals(this.UserPassword)){

            System.out.println("Thank you you are logged in as guest  ");

            bank.validateCustomer();

        }
        else
        {
            System.out.println("Please check back your input");
        }
        return guestAsLogin();

    }



}
