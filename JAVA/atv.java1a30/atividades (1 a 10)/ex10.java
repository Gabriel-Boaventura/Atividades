import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float prestacao, valor, total, quantidade;
        System.out.println("Insira o valor do produto: ");
        valor = leia.nextFloat();

        if(valor == 0){
            System.out.println("Não há nada a comprar");
        }else{
        System.out.println(" insira a quantidade: ");
        quantidade = leia.nextFloat();

        if(quantidade == 0){
            System.out.println("Não há nada a comprar");
        }else{
        
            total = (valor*quantidade)/5;
        System.out.println("suas cinco prestacoes ficaram de:"+total+ "R$ por mes");
        }
    }
    }
}
