package src.main.java.MyApp;

import src.main.java.MyApp.customerAccount.customerAccountInfo;

public class MyApp {
    public static void main(String[] args)
    {

        System.out.println("I am a Sai Sandeep Reddy Bandi " );
        bank.greetingMessage();
         customerAccountInfo customerAccount =new customerAccountInfo();
        System.out.println("Customer Account UUID = " + customerAccount.generateUUIDNumber());
        System.out.println("Customer Account Number = " + customerAccount.customerAccountNumber());
    }
    }

