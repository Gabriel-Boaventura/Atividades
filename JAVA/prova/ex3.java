import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num;
        int soma=0;
        int contador=1;

        System.out.println( " digite um numero: ");
        num = leia.nextInt();

        if(num<0){
            System.out.println("O número é negativo");
        }else{
        while (contador<=num) {
            soma = soma + contador;
            contador++;
            
        }

        System.out.println(" a soma dos numeros é: " +soma);
    }
}
}