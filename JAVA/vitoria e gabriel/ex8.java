import java.util.Scanner;

public class ex8 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("camisetas pequenas: ");
        float peq = leia.nextFloat();
        System.out.println("camisetas medias: ");
        float med = leia.nextFloat();
        System.out.println("camisetas grandes: ");
        float grand = leia.nextFloat();

        System.out.println(" O total arrecadado é de: " +((peq*10)+(med*12)+(grand*15)));
        }
    }

