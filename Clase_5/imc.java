package Clase_5;

import java.util.Scanner;

public class imc {
    public static void main (String[] args){

        //peso en kg / altura en metros al cuadrado
        System.out.println("Escribe tu peso en kilos! ");
        Scanner Entrada = new Scanner(System.in);
        double peso = Entrada.nextDouble();

        System.out.println("Escribe tu altura en metros! ");

        double altura = Entrada.nextDouble();

        double IndiceMasaCorporal = (peso / (altura * altura))  ;
        System.out.println("Tu indice de masa corporal es: " + IndiceMasaCorporal);

        if (IndiceMasaCorporal >= 30){
            System.out.println("Estas en obesidad");
        }

        if (IndiceMasaCorporal >= 25 && IndiceMasaCorporal <30){
            System.out.println("Estas en estado de sobrepeso");
        }

        if (IndiceMasaCorporal >=18.5 && IndiceMasaCorporal <25){
            System.out.println("Estas en un estado normal");
        }

        if (IndiceMasaCorporal <= 18.5){
            System.out.println("Estas desnutrido, ponte a comer");
        }

        /*
        System.out.println("Que edad tienes?");
        Scanner Entrada = new Scanner(System.in);
        int edad = Entrada.nextInt();

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }

         */

        //vamos a calcular la edad de un perro en años perro solo de
        // miltplica * 7

         System.out.println("Porfavor ingrese la edad de su perro!");
         Scanner annos = new Scanner(System.in);

         int edad = annos.nextInt();

         int edad_annos_perros = edad * 7 ;

         System.out.println("La edad real de su perro es : " + edad_annos_perros + " años");

         //Conversor de millas a kilometros

        System.out.println("por favor ingrese el valor en millas");
        Scanner entrada = new Scanner(System.in);
        double millas = entrada.nextDouble();

        double conversor = millas * 1.60934;

        System.out.println("El valor en millas transformado a kilometros es : " + conversor );
    }
    }

