import java.util.Scanner;

public class ex2 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("insira quantos cavalos comprados: ");
        float cavalo = leia.nextFloat();

        System.out.println("voce precisara de: " +cavalo*4+ "ferraduras");

        }
    }
