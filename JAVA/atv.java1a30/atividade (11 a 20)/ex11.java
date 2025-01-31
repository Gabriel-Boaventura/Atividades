import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    float preco, valor, acrescimo, compra, quantidade;
    System.out.println(" insira o preco do produto:");
    preco=leia.nextFloat();

    System.out.println("qual sera a quantidade?");
    quantidade=leia.nextFloat();

    System.out.println("total: R$"+preco+ "");

    System.out.println("quantidade: "+quantidade+" unidades ");

    System.out.println("qual o acrecimo da compra?");
    acrescimo=leia.nextFloat();
    
    valor = preco *  quantidade; 
    compra = valor + acrescimo;

    System.out.println("total= "+compra);

    }
}

