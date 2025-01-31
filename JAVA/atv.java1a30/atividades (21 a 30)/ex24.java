import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float n;
        int condicao = 0;

        while (condicao <= 10) {
            System.out.println(" Escrreva um numero: ");
            n = leia.nextFloat();

            if (n > 0) {
                System.out.println(" Positivo!!! ");
            }
            if (n == 0) {
                System.out.println(" Zero!!! ");
            }
            if (n < 0) {
                System.out.println(" Negativo!!!");
            }

        }
    }
}
