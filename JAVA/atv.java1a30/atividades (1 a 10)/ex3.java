import java.util.Scanner;

public class ex3 {
    public static void main( String[]args){
        Scanner leia = new Scanner(System.in);
	
		int distancia, combustivel, gasto;
		
		System.out.println("qual a distancia percorrida (km)? ");
		distancia = leia.nextInt();
		System.out.println("quanto de combustivel foi gasto? ");
		combustivel = leia.nextInt();
		gasto = distancia / combustivel;

		System.out.println("o valor gasto foi de:");
		
		System.out.println( gasto + "km/l");
		
	}
}
