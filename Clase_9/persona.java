package Clase_9;

import java.util.Date;
import java.util.Scanner;

public class persona {
   // id, nombre, edad, fecha de nacimiento y DNI.
    public int id;
    public String nombre;
    public int edad;
    public Date fecha;
    public  int cedula;

    public persona(int id, String nombre, int edad, Date fecha, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void mostrar(){
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String nombre = scanner.nextLine();
        int edad = scanner.nextInt();
        int cedula = scanner.nextInt();
        System.out.println("El id es: " + id + "nombre: " + nombre + "edad: " + edad + "cedula: " + cedula);
    }
}
