import java.util.Scanner;

public class ex6 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("qual o Kg do seu prato: ");
        float Kg = leia.nextFloat();

        System.out.println( "Você irá pagar:" +Kg*28);
        }
    }

