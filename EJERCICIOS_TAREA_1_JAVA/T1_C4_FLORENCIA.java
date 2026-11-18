import java.util.Scanner;

public class T1_C4_FLORENCIA {

    public static int contarDigitos(int n) {
        if (n == 0) return 1;
        int contador = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            temp /= 10;
            contador++;
        }
        return contador;
    }

    public static int potencia(int b, int e) {
        int resultado = 1;
        for (int i = 0; i < e; i++) {
            resultado *= b;
        }
        return resultado;
    }

    public static boolean esArmstrong(int n) {
        if (n < 0) return false;
        int digitos = contarDigitos(n);
        int temp = n;
        int suma = 0;

        while (temp > 0) {
            int digito = temp % 10;
            suma += potencia(digito, digitos);
            temp /= 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();

        if (esArmstrong(num)) {
            System.out.println(num + " ES un número de Armstrong.");
        } else {
            System.out.println(num + " NO es un número de Armstrong.");
        }
        sc.close();
    }
}
