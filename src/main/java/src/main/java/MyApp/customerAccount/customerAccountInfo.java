package src.main.java.MyApp.customerAccount;

import java.util.Random;
import java.util.UUID;

public class customerAccountInfo {


    public String generateUUIDNumber()
    {
        return UUID.randomUUID().toString();

    }

    public long customerAccountNumber(){
        Random random = new Random();
        long min = 100000000000L;
        long max = 999999999999L;
        return min +((long)(random.nextDouble() * (max - min + 1)));
    }


}
