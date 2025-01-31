import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    float valor, fabrica, distribuidor, impostos, resultado;

    System.out.println(" qual o valor de fabrica?");
    fabrica=leia.nextFloat();

    impostos = (float) 0.73; //imposto de fabrica e distribuição

    resultado = impostos * fabrica ;
    valor= resultado + fabrica;

    System.out.println(" o valor de fabrica: " + fabrica);
    System.out.println(" o valor para o consumidor é de:" +valor );
    }
}