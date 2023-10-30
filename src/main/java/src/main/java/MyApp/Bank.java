package src.main.java.MyApp;

import src.main.java.MyApp.customerAccount.CustomerAccountInfo;
import src.main.java.MyApp.customerResponse.CustResponse;
import src.main.java.MyApp.userLogin.Login;

import java.util.Objects;

public class Bank {

    private  final String customerName = "Madhura";
    public final double DOB = 06.18;

    public  final int SSN = 1234;

    public  CustResponse custResponse = new CustResponse();

    public  CustomerAccountInfo customerAccount =new CustomerAccountInfo();
    private Login login = new Login();


    public  void greetingMessage()
    {
        System.out.println("Please mention your User Type to log in:  ");
        login.loginDo();

    }
    public  void validateCustomer (){

        if (custResponse.nameInput().equalsIgnoreCase(this.customerName) && custResponse.ssnInput() == this.SSN && custResponse.birthInput() == (this.DOB)) {
            System.out.println("Please find your Account number  :   " + customerAccount.customerAccountNumber());
        }
        else
            System.out.println("Input Wrong");
    }


}
