import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("digite um numero: ");
        numero = leia.nextInt
        ();

        if(numero < 0){
            System.out.println("O numero é negativo ");
        }if(numero == 0){
            System.out.println("O numero é zero ");
        }else{
            System.out.println("O numero é positivo ");
        }
    }
}
