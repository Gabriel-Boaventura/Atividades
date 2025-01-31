import java.util.Scanner;

public class ex3 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

            System.out.println("insira quantidadede de paes comprados: ");
            float pao = leia.nextFloat();
            System.out.println("insira quantidadede de broas comprados: ");
            float broa = leia.nextFloat();

            float total = (pao * 0.12f) + (broa * 1.5f);
            System.out.println("total arrecadado: " + total);
            System.out.println(" \n poupança: "+ (total/100) *10);

        }}