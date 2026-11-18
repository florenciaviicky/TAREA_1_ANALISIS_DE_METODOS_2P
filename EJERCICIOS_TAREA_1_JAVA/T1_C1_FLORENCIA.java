import java.util.Scanner;

public class T1_C1_FLORENCIA {

    public static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Ingrese el consumo de agua en m3 (>= 0): ");
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("Error: El consumo no puede ser negativo. Intente nuevamente.");
            }
        } while (m3 < 0);
        return m3;
    }

    public static double calcularValor(double m3) {
        double cargoFijo = 2.50;
        double valorConsumo;
        if (m3 <= 15) {
            valorConsumo = m3 * 0.40;
        } else {
            valorConsumo = (15 * 0.40) + ((m3 - 15) * 0.75);
        }
        return cargoFijo + valorConsumo;
    }

    public static void mostrarPlanilla(double m3, double total) {
        System.out.println("\n--- PLANILLA DE AGUA POTABLE ---");
        System.out.printf("Consumo registrado : %.2f m3\n", m3);
        System.out.printf("Cargo fijo base    : $2.50\n");
        System.out.printf("Total a pagar      : $%.2f\n", total);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = leerConsumo(sc);
        double valorPagar = calcularValor(consumo);
        mostrarPlanilla(consumo, valorPagar);
        sc.close();
    }
}