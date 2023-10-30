package src.main.java.MyApp.userLogin;

import src.main.java.MyApp.Bank;

import java.util.Scanner;

public class Developer {
    public String devName = "dev";
    public String devPassword = "devPass";
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();
    public String devUser(){
        System.out.println("Enter Your Developer User Name:  ");
        String devUserName= scanner.nextLine();
        return devUserName;
    }

    public String devUserPassword(){
        System.out.println("Enter Your Developer Password:  ");
        String devUserPassword= scanner.nextLine();
        return devUserPassword;

    }

    public String devAsLogin(){
        if (devUser().equalsIgnoreCase(this.devName) && devUserPassword().equals(this.devPassword)){

            System.out.println("Thank you you are logged in as Developer  ");

            bank.validateCustomer();

        }
        else
        {
            System.out.println("Please check back your input");
        }
        return devAsLogin();

    }

}
