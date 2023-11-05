package src.main.java.MyApp.customerAccount;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class CustomerAccountInfo {


    public String generateUUIDNumber()
    {
        return UUID.randomUUID().toString();

    }

    public long customerAccountNumber(){
        Random random = new SecureRandom();
        long min = 100000000000L;
        long max = 999999999999L;
        return min +((long)(random.nextDouble() * (max - min + 1)));
    }


}
