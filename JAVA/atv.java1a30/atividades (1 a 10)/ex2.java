import java.util.Scanner;

public class ex2 {
    public static void main( String[]args){
        Scanner leia = new Scanner(System.in);
	
		float n1, n2, soma, subtracao, multiplicacao, divisao;
		System.out.println(" Digite o numero 1: ");
		n1= leia.nextFloat();
		System.out.println(" Digite o numero 2: ");
		n2= leia.nextFloat();

		
		soma = n1 + n2;
		subtracao = n1 - n2;
		multiplicacao = n1 * n2;
		divisao = n1 / n2;
		
		System.out.println(" A soma é:" + soma);
		System.out.println(" A subtracao é:" + subtracao);
		System.out.println(" A multiplicacao é:" + multiplicacao);
		
		if(n2 ==0){
			System.out.println(" nao da para fazer a divisao ");
		}else{
		
		System.out.println(" A divisao é:" + divisao);
		}
	}
}