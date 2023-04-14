import java.util.Scanner;

public class CalculadorFrigorias {

    public static void main(String[] arg){
        Scanner miEscaner = new Scanner(System.in);

        // Lectura de datos
        // Solicitemos al usuario la carga de datos
        System.out.println("Ingrese las dimensiones de la habitación (en Metros): ");
        System.out.print("Largo => ");
        double largo = miEscaner.nextDouble();
        System.out.print("Ancho => ");
        double ancho = miEscaner.nextDouble();
        System.out.print("Alto  => ");
        double alto = miEscaner.nextDouble();

        // Procesos y asignaciones
        int kFrigoriasPorMetroCubico = 40;

        double volumen = largo * ancho * alto;
        double cantidadFrigorias = volumen * kFrigoriasPorMetroCubico;

        // Mostrar resultados
        System.out.println("La cantidad de frigorías mínima requerida es: " + cantidadFrigorias);
        System.out.println();

    }

}
