import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float n1, n2;

        System.out.println(" Insira um numero: ");
        n1 = leia.nextFloat();

        System.out.println(" Insira outro numero: ");
        n2 = leia.nextFloat();

        if (n1 == n2) {
            System.out.println(" Eles são iguais!!! ");
        }
        if (n1 > n2) {
            System.out.println(" O " + n1 + " é maior que " + n2);
            System.out.println(" Eles são diferentes!!! ");
        }
        if (n1 < n2) {
            System.out.println(" O " + n2 + " é maior que " + n1);
            System.out.println(" Eles são diferentes!!! ");
        }
    }
}
