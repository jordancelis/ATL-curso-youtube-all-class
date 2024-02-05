package Clase_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios_3_4_5 {


    public static void main (String [] args){
        //CALCULADORA DE DESCUENTOS
        //Pídele al usuario que ingrese el precio original de un producto.
        System.out.println("Ingresa el precio original del producto!! ");
        Scanner Entrada = new Scanner(System.in);
        double precio = Entrada.nextDouble();
        //Pídele al usuario que ingrese el porcentaje de descuento.
        System.out.println("Ingresa el porcentaje de descuento!! ");
        double descuento = Entrada.nextDouble();
        //Calcula el precio final después de aplicar el descuento utilizando la fórmula:
        // precioFinal = precioOriginal - (precioOriginal * descuento / 100).

        double Precio_final = precio - (precio * descuento / 100);

        System.out.println("El precio con descuento es = " + Precio_final);


        //CALCULADORA DE PROPINAS
        //Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        System.out.println("Ingresa el Total de la cuenta!! ");
        double cuenta = Entrada.nextDouble();
        //Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        System.out.println("Ingresa el Porcentaje que desea dar de propina!! ");
        double porcantaje_propina = Entrada.nextDouble();
        //Calcula el monto de la propina utilizando la fórmula:
        // propina = totalCuenta * (porcentajePropina / 100).

        double precio_final = cuenta * (porcantaje_propina/ 100 );
        System.out.println("Su propina es :  "  +  precio_final);


        //Juego de adivinar el número
        System.out.println("hello, today will play a game , can you achieve it ? ");

        Random rand = new Random();
        int n = rand.nextInt(100);
        n += 1;

        System.out.println("Guess what the number is going to come up?  ");
        System.out.println("write the number that you think is correct !!  ");
        int numero = Entrada.nextInt();
        if (numero == n){
            System.out.println("you won, you found the winner number!!   ");
        }else {
            System.out.println("Kip trying!!   ");
        }

        System.out.println("you number random is:  " + n );
    }

}
