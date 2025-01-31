import java.util.Scanner;

public class ex5 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor do litro:");
        float litro = leia.nextFloat();
        System.out.println("quantos reais você deseja colocar:");
        float reais = leia.nextFloat();
        float litros = reais / litro;

        System.out.println("Você pode comprar " + litros + " litros de gasolina");
        }
    }
