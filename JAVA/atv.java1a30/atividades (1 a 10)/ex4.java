import java.util.Scanner;

public class ex4 {
    public static void main( String[]args){
        Scanner leia = new Scanner(System.in);
        float  salario,salariof, vendas, valor;
        String nome;
        System.out.print("Qual o seu nome: ");
            nome = leia.nextLine();
        System.out.print("Qual seu salario fixo: ");
            salario = leia.nextFloat();
        System.out.print("Total de vendas do mês: ");
            vendas = leia.nextFloat();
        
        valor = (float) (vendas * 0.15);
        salariof = salario + valor;
        System.out.print(" O seu salário é de R$ " + salariof );

        
        


    }
    
}
