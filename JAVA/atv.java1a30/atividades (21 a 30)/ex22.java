import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float precoC, precoV, resultado;
        int condicao = 0;

        while (condicao <= 4) {

            System.out.println(" insira o preço de custo do produto: ");
            precoC = leia.nextFloat();

            System.out.println(" informe o preço de venda: ");
            precoV = leia.nextFloat();

            if (precoV > precoC) {
                System.out.println(" Você teve lucro!!! ");
            }
            if (precoV == precoC) {
                System.out.println(" Você teve um empate!!! ");
            }
            if (precoV < precoC) {
                System.out.println("Você teve prejuizo!!!");
            }
        }
    }
}