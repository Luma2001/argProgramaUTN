import java.util.Scanner;

public class CalculadorFrigoriasMinimo {

    public static void main(String[] arg){
        Scanner miEscaner = new Scanner(System.in);

        // Lectura de datos
        double largo;
        largo = miEscaner.nextDouble();
        double ancho = miEscaner.nextDouble();
        double alto = miEscaner.nextDouble();

        // Procesos y asignaciones
        int kFrigoriasPorMetroCubico = 40;

        double volumen = largo * ancho * alto;
        double cantidadFrigorias = volumen * kFrigoriasPorMetroCubico;

        // Mostrar resultados
        System.out.println(cantidadFrigorias);

    }

}
