import java.util.Scanner;

public class ex4 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite o seu nome: ");
        String nome = leia.nextLine();
        System.out.println(" Digite sua idade: ");
        int idade = leia.nextInt();

        System.out.println(nome+ " Você já viveu " +idade*365+ " dias");
        }
    }