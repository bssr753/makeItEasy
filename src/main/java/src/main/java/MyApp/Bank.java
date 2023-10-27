package src.main.java.MyApp;

import src.main.java.MyApp.customerAccount.CustomerAccountInfo;
import src.main.java.MyApp.customerResponse.Response;

import java.util.Objects;

public class Bank {

    private  final String customerName = "Madhura";
    public double DOB = 06.18;

    public  int SSN = 5346;

    //public  Response response = new Response();

    public  CustomerAccountInfo customerAccount =new CustomerAccountInfo();

    public  void greetingMessage()
    {
        System.out.println("Welcome to our SAI bank");
        validateCustomer();

    }
    public  void validateCustomer (){

        if (Response.nameInput().equals(this.customerName) && Response.ssnInput() == this.SSN && Objects.equals(Response.birthInput(), this.DOB)) {
            System.out.println("Please find your Account number  ;   " + customerAccount.customerAccountNumber());
        }
        else
            System.out.println("Input Wrong");
    }


}
