package Clase_5;

import java.util.Random;
import java.util.Scanner;

public class numero_random {

    public static void main (String[ ] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("hello, today will play a game , can you achieve it ? ");

        Random rand = new Random();
        int n = rand.nextInt(10);
        n += 1;

        System.out.println("Guess what the number is going to come up?  ");
        System.out.println("write the number that you think is correct !!  ");
        int numero = Entrada.nextInt();
        if (numero == n){
            System.out.println("you won, you found the winner number!!   ");
        }else {
            System.out.println("Kip trying!!   ");
        }

        System.out.println("you number random is:  " + n + " " +  n);
    }

}
