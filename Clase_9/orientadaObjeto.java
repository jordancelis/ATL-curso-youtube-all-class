package Clase_9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class orientadaObjeto {
    public static void main (String [ ] args){




        //Cliente cliente1 =CargarCliente();

        //cliente1.mostrarDatos();
        //Cliente cliente2 = CargarCliente();
        //Cliente cliente3 = CargarCliente();



    }

    private static Cliente  CargarCliente(){
        Scanner teclados = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Escribe tu nombre");
        cliente.nombre = teclados.nextLine();


        System.out.println("Escribe apellido");
        cliente.apellido = teclados.nextLine();

        System.out.println("Escribe edad");
        cliente.edad = teclados.nextInt();

        cliente.mostrarDatos();

        return cliente;

    }


}
