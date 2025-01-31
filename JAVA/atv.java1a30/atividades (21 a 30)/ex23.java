import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float n;

        System.out.println(" Insira um número: ");
        n = leia.nextFloat();

        if (n > 80) {
            System.out.println(" Você é bonito ");
        }
        if (n < 25) {
            System.out.println(" Você é feio ");
        }
        if (n == 40) {
            System.out.println(" você é padrão ");
        }
    }
}
