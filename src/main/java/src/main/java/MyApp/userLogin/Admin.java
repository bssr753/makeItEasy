package src.main.java.MyApp.userLogin;

import src.main.java.MyApp.Bank;

import java.util.Scanner;

public class Admin {
    public String adminName = "Admin";
    public String adminPassword = "AdminPass";
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();
    public String adminUser(){
        System.out.println("Enter Your Admin User Name:  ");
        String adminUserName= scanner.nextLine();
        return adminUserName;
    }

    public String adminUserPassword(){
        System.out.println("Enter Your Guest Password:  ");
        String adminUserPassword= scanner.nextLine();
        return adminUserPassword;

    }

    public String adminAsLogin()
    {
        if (adminUser().equalsIgnoreCase(this.adminName) && adminUserPassword().equals(this.adminPassword)){

            System.out.println("Thank you you are logged in as Developer  ");

            bank.validateCustomer();

        }
        else
        {
            System.out.println("Please check back your input");
        }
        return adminAsLogin();

    }
}
