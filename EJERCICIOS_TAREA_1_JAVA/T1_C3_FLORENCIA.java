import java.util.Scanner;

public class T1_C3_FLORENCIA {

    // Sobrecarga 1: Cubo
    public static double volumen(double lado) {
        return lado * lado * lado;
    }

    // Sobrecarga 2: Cilindro
    public static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // Sobrecarga 3: Prisma rectangular
    public static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== CÁLCULO DE VOLÚMENES (ING. TIC) ===");
            System.out.println("1. Volumen de un Cubo");
            System.out.println("2. Volumen de un Cilindro");
            System.out.println("3. Volumen de un Prisma Rectangular");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cubo: ");
                    double l = sc.nextDouble();
                    System.out.printf("Volumen del cubo: %.2f u³\n", volumen(l));
                    break;
                case 2:
                    System.out.print("Ingrese el radio del cilindro: ");
                    double r = sc.nextDouble();
                    System.out.print("Ingrese la altura del cilindro: ");
                    double h = sc.nextDouble();
                    System.out.printf("Volumen del cilindro: %.2f u³\n", volumen(r, h));
                    break;
                case 3:
                    System.out.print("Ingrese el largo: ");
                    double largo = sc.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = sc.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = sc.nextDouble();
                    System.out.printf("Volumen del prisma: %.2f u³\n", volumen(largo, ancho, alto));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}