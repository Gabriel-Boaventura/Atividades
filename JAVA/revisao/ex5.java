import java.util.Scanner;
public class ex5{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int contador=1;
        int n;
        int soma = 0;

        System.out.println(" digite um numero: ");
        n = leia.nextInt();

        while (contador <= n) {
            soma = soma + contador;
            contador= contador+1;
 
        }
        System.out.println(" a soma de todos os elementos é " +soma);
     
    }
}




















