package utils;

import java.util.Random;

public class RandomNumber {
    private static Random random = new Random();

    public static Integer randomIntegerUntilHundred(){
        return random.nextInt(100);
    }

    public static String randomMobileNumber(){
        Integer r = 10 + random.nextInt(90);
        return "0878999999" + r.toString();
    }

    public static void main(String args[]){
        System.out.println(randomMobileNumber());
    }
}
