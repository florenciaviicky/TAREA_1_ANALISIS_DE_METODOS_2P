import java.util.Scanner;

public class T1_C2_FLORENCIA {

    public static double promedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static String estado(double nota) {
        if (nota >= 14.0) {
            return "Aprobado";
        } else if (nota >= 9.0) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    public static double necesitaEnSupletorio(double nota) {
        return 28.0 - nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double n3 = sc.nextDouble();

        double prom = promedio(n1, n2, n3);
        String cond = estado(prom);

        System.out.printf("\nPromedio obtenido: %.2f\n", prom);
        System.out.println("Estado académico : " + cond);

        if (cond.equals("Supletorio")) {
            double minSup = necesitaEnSupletorio(prom);
            System.out.printf("Nota mínima en supletorio para aprobar: %.2f\n", minSup);
        }
        sc.close();
    }
}