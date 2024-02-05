package Clase_7;

import java.util.Scanner;

public class arreglo_funciones {

    public static void main(String[] args){


        int[] numero = new int[5];
        cargarNumero(numero);
        mostrarNumeros(numero);
    }

    private static void cargarNumero(int[] numero) {
        for (int i=0; i<numero.length; i++){
            int numeros = pedirNumero();
            numero[i] = numeros;
        }
    }


    private static void mostrarNumeros(int [] numero) {
        System.out.println("it is your numbers : ");
        for (int i=0; i<5; i++){
            System.out.println("The numbers are: " + numero[i]);
        }
    }
    private static int pedirNumero(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int numero = scanner.nextInt();
        return numero;

    }

}

