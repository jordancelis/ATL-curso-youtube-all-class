package Clase_9;

import java.util.Scanner;

public class Busqueda_personas {

    public static void main (String [] args){

        String[] personas = {"jordan Santorini", "montero" ,    "Santigo Montoya", "Freddy Celis", "Sara soler", "Martha Cheverrya", "Evelio Santillana"};

        System.out.println("Ecribe tu busqueda: "  );
        Scanner scanner = new Scanner(System.in);
        String buscar = scanner.nextLine();

        for (String persona : personas){
            if (persona.toLowerCase().contains(buscar.toLowerCase())){
                System.out.println("La perona es : " + persona);
            }
        }
        /*
        for (int i = 0; i<personas.length; i++ ){
            String mostrarPersona = personas[i];

        }

        System.out.println(mostrarPersona);
*/
    }
}
