package Clase_6;

import java.util.Scanner;

public class Ejecicios_7_8 {
    public static void main (String[] args){
        System.out.println("hola Eligue tu propia aventura");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n");

        int Eleccion = scanner.nextInt();

        if (Eleccion == 1){
            System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n");
        }else if (Eleccion == 2){
            System.out.println(" Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        }else {
            System.out.println(" Elegiste mal vuelve a intentarlo");
        }
        System.out.println("Escoje 1 , 2 o 3? \n");
        int Eleccion2 = scanner.nextInt();
        System.out.println("has escogido el numero  :  \n" + Eleccion2 + "  Buena elección");

        if (Eleccion2 == 1){
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n");
        }else if (Eleccion2 == 2){
            System.out.println(" Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\n");
        }else if(Eleccion2 == 3){
            System.out.println(" Al abrir la puerta de la derecha, te encuentras en una sala bañada por la luz del sol. No hay tesoros relucientes ni objetos extravagantes, solo una vista impresionante de un paisaje idílico. Ante ti se extiende un jardín exuberante, lleno de flores de colores vibrantes y árboles frondosos que bailan con la suave brisa. \n");
        }else {
            System.out.println("Elegiste mal Vuelve a intentarlo");
        }



        System.out.println("Mostrar los numeros del 1 - 100");

        int contador=0;

        while (contador < 100){
            contador++;
            System.out.println("Contador" + " " +   contador);
        }

    }







}
