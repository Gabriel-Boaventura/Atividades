import java.util.Scanner;

public class ex7 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println(" Dia: ");
        int dia = leia.nextInt();

        System.out.println(" Mês: ");
        int mes = leia.nextInt();

        float total = (mes - 1) * 30;
        total = total + dia;

        System.out.println("O total de dias é: " + total);
        }
    }


