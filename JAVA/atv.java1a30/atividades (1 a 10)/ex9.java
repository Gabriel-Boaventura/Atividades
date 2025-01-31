import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    float valor, poupanca, juros;
    System.out.println(" Digite  o valor do deposito: ");
    valor=leia.nextFloat();
    
    juros = (float) 0.007 * valor;
    poupanca = valor + juros;

    System.out.println("seu valor na poupanca depois de um mes é: "+ poupanca);
    }
}
