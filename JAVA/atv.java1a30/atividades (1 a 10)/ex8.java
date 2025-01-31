import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float dolar, cotacao, conversao, valor, total;

        System.out.println("quanto vc tem em dolar?: ");
        valor = leia.nextFloat();
        System.out.println("quanto vc quer converter(reais): ");
        dolar = leia.nextFloat();

        cotacao = 5;   
        conversao = cotacao*dolar;
        total  = valor - dolar;

        System.out.println("\nVocê converteu:" + dolar + " e ficará " + conversao);
        System.out.println("Sobrará: " + total);
    }
}
