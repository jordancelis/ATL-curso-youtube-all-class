package Clase_7;

import java.util.Scanner;

public class Arreglos_Listas {

    public static void main(String[] args) {

        String[] ciudades = new String[10];
        ciudades[0] = "Cúcuta";
        ciudades[1] = "Medellin";
        ciudades[2] = "Bogota";
        ciudades[3] = "Bucaramanchester";

        String laPerlaDeLNorte = ciudades[1];

        System.out.println("The best city in Colombia is:  " + laPerlaDeLNorte);


        int[] numero = new int[5];
        Scanner scanner = new Scanner(System.in);


        for (int contador =0; contador<numero.length ; contador++){
            System.out.println("Escribe un numero: ");
            int numeros = scanner.nextInt();
            numero[contador] = numeros;
        }
        /*int contador=0;

        do{
            System.out.println("Escribe un numero: ");
            int numeros = scanner.nextInt();
            numero[contador] = numeros;
            contador++;
        }while(contador<numero.length);*/

       /* while (contador<numero.length){
            System.out.println("Escribe un numero: ");
            int numeros = scanner.nextInt();
            numero[contador] = numeros;
            contador++;
        }*/

        System.out.println("Los numeros selecionados son:    ");
        for (int contador=0; contador<numero.length; contador++){
            System.out.println("numero:" + numero[contador]);
        }


        int mayor = 0;
        int menor = 0;

        for (int contador=0; contador<numero.length; contador++){
            int num = numero[contador];
            if (num >= mayor || contador ==0 ){
                mayor = num;

            }

            if (num <= menor || contador ==0 ){
                menor = num;
            }

        }
        System.out.println("El numero mayor es : " + mayor );
        System.out.println("El numero menor es : " + menor );

        int sumatoria = 0;
        for(int contador=0; contador<numero.length; contador++){
            int num = numero[contador];
            sumatoria +=num;
        }

        System.out.println("La sumatoria es : " + sumatoria);
        float promedio = (float) sumatoria / numero.length;
        System.out.println("El promedio es : " + promedio);

        /*contador=0;
        do {
            System.out.println("numero:" + numero[contador]);
            contador++;
        }while(contador<numero.length);
/*

        /*System.out.println("Los numeros selecionados son:    ");
        while(contador<numero.length){
            System.out.println("numero:" + numero[contador]);
            contador++;
        }*/
    }
}

