package javaAdvanced;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        // Random r=new Random();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt());// It prints any random integer
            System.out.println(r.nextInt(50));// It prints any random integer below 50

        }
    }
}
