package Clase_5;

import java.util.Random;

public class Baloto {

    public static void main (String[] args){
        System.out.println("Hello today will guess, the numbers the baloto and be rich  ");

        Random rand = new Random();
        int n = rand.nextInt(43);
        n += 1;

        Random hola = new Random();
        int m = hola.nextInt(43);
        m += 1;

        Random como = new Random();
        int t = como.nextInt(43);
        t += 1;

        Random estas = new Random();
        int p = estas.nextInt(43);
        p += 1;

        Random bien = new Random();
        int j = como.nextInt(43);
        j += 1;

        Random tu  = new Random();
        int c = tu.nextInt(16);
        c += 1;

        System.out.println("you nunbers are :" + n + " " + m + " " + t + " " + p + " " + j + "       " +
                "" +
                "" +
                "" +
                "" +
                " " + c );
    }

}
