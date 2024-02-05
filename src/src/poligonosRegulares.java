import java.util.Scanner;

public class poligonosRegulares extends Figura {
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la Base en cm: ");
        base =teclado.nextDouble();
        System.out.println("Ingrese la Altura en cm: ");
        altura =teclado.nextDouble();


    }
}
