import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Figura> figuras =new ArrayList<>();
    public static void main(String[] args) {
        boolean mostrarMenu = true;


        do{
            System.out.println("************ MENU ************ ");
            System.out.println("1) Crear una figura  ");
            System.out.println("2) Mostrar la sumatoria de areas de las figuras ");
            System.out.println("0) Salir");

            Scanner scanner = new Scanner(System.in);
            int respuestaUsuarios = scanner.nextInt();
            if(respuestaUsuarios == 1){
                crearFigura();
            }
            if (respuestaUsuarios == 2){
                mostrarSumatoriaDeFiguras();
            }
            if(respuestaUsuarios == 0){
                mostrarMenu = false;
            }
        }while(mostrarMenu);


    }

    private static void mostrarSumatoriaDeFiguras(){
        double sumatoriaDeAreas = 0;
        for(Figura figura : figuras){
            sumatoriaDeAreas += figura.calcularArea();

        }
        System.out.println("La sumatoria de areas de todas las figuras es : "+ sumatoriaDeAreas + " cm ");
    }

    private static void crearFigura() {
        System.out.println("Que figura deseas Crear??");
        System.out.println("1) Circulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triangulo");
        Scanner teclado = new Scanner(System.in);
        int respuestaUsuario = teclado.nextInt();

        if(respuestaUsuario == 1 ){
            System.out.println("El usuario eligio Circulo!!");
            circulo Circulo = new circulo();
            Circulo.cargarDatos();
            System.out.println("El area total es: " + Circulo.calcularArea());
            figuras.add(Circulo);

        }

        if(respuestaUsuario == 2 ){
            System.out.println("El usuario eligio Cuadrado!!");
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("El area total es: " + cuadrado.calcularArea());
            figuras.add(cuadrado);

        }
        if(respuestaUsuario == 3 ){
            System.out.println("El usuario eligio Triangulo!!");
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("El area total es: " + triangulo.calcularArea());
            figuras.add(triangulo);

        }
    }
}
