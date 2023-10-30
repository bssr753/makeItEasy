package src.main.java.MyApp.userLogin;

import java.util.Scanner;

public class Login {
    private String guestUser = "Guest";
    private String devUser = "dev";
    private String adminUser = "Admin";
    Scanner scanner = new Scanner(System.in);
    private String guestLogin() {
        System.out.println("Enter your User Type: ");
        String guestUserType = scanner.nextLine();
        return guestUserType;
    }

        private String devLogin() {
            System.out.println("Enter your User Type: ");
            String devUserType = scanner.nextLine();
            return devUserType;
        }

            private String adminLogin(){
                System.out.println("Enter your User Type: ");
                String adminUserType = scanner.nextLine();
                return adminUserType;

    }
    public String loginDo () {
        if (guestLogin().equalsIgnoreCase(this.guestUser)){
            Guest guest = new Guest();
            guest.guestAsLogin();
        } else if (devLogin().equalsIgnoreCase(this.devUser)) {
            Developer developer = new Developer();
            developer.devAsLogin();
        }
        else if(adminLogin().equalsIgnoreCase(this.adminUser)){
            Admin admin = new Admin();
            admin.adminAsLogin();
        }
        else
        {
            System.out.println("Please check back your input");
        }
        return loginDo();
    }



}
