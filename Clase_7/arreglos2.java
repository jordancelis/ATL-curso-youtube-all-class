package Clase_7;

import java.util.Scanner;

public class arreglos2 {

    public static void main (String[] args) {

        String[] capitales = new String[4];
        capitales[0] = "Cúcuta";
        capitales[1] = "Medellin";
        capitales[2] = "bogota";
        capitales[3] = "cali";

        String ciudad = capitales[0];

        System.out.println("The best capital the my contry: " + ciudad);


        Scanner scanner = new Scanner(System.in);
        int[] numero= new int[5];

        for(int contador=0; contador< numero.length; contador++){
            System.out.println("Enter a number, please: ");
            int numeros = scanner.nextInt();
            numero[contador]=numeros;

        }

        for (int contador = 0; contador< numero.length; contador++){
            System.out.println("your number is: " + numero[contador]);
        }
        int mayor=0;
        int menos=0;

        for(int contador=0; contador< numero.length; contador++){
            int num = numero[contador];
            if(num >= mayor || contador==0){
                mayor = num;
            }

            if (num<=menos || contador==0){
                menos=num;
            }


        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menos);

        int sumatoria=0;
        for(int contador=0; contador< numero.length; contador++){
            int num = numero[contador];
            sumatoria += num;
        }

        System.out.println("La sumatoria es :  " + sumatoria);

        float promedio = (float) sumatoria / numero.length;
        System.out.println("The average is : " + promedio);

    }
}