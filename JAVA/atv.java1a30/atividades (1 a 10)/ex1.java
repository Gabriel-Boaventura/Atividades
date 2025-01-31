import java.util.Scanner;


	
public class ex1 {
    public static void main( String[]args){
        Scanner leia = new Scanner(System.in);
	
		int n1, n2, soma, subtracao, multiplicacao, divisao;
		System.out.println(" Digite o numero 1: ");
		n1= leia.nextInt();
		System.out.println(" Digite o numero 2: ");
		n2= leia.nextInt();

		
		soma = n1 + n2;
		
		
		System.out.println("\n A soma é:" + soma);
		
	}
}
