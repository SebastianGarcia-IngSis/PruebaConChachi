import java.util.Scanner;

public class PagoConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_POR_KW = 0.20;  // Asume un precio por kilowatt de ejemplo

        // Leer consumo en kilowatts
        System.out.print("Ingrese el consumo de energía en kilowatts: ");
        double kilowatts = scanner.nextDouble();

        // Calcular pago
        double total = kilowatts * PRECIO_POR_KW;

        // Mostrar resultado
        System.out.println("El pago por el consumo de energía es: " + total + " quetzales.");
    }
}