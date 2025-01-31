import java.util.Scanner;

public class ex7 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float F, C;
        System.out.println("informe a temperatura (C)");
        C = leia.nextFloat();

        F = (9*C + 160) / 5;

        System.out.println(" A temperatura em fahrenheit é: " + F);
     }
}
