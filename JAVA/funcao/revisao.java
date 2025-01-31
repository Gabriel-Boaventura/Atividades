import java.util.Scanner;

public class revisao {
    
public static void calcular (float num1,float num2){

    float soma = num1 + num2;
    float subtracao = num1 - num2;
    float multiplicacao = num1 * num2;

    System.out.println(" a soma é: "+soma );
    System.out.println(" a subtracao é: "+subtracao);
    System.out.println(" a multiplicacao é: "+multiplicacao);
    
    if(num2==0){
    System.out.println("nao é possivel dividir por zero");
    }else{
        float divisao = num1/num2;
        System.out.println(" a divisao é: "+divisao);
    }
}
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float numero1,numero2;

    System.out.println("Digite o primeiro numero: ");
    numero1 = scanner.nextFloat();
    System.out.println("Digite o segundo numero: ");
    numero2 = scanner.nextFloat();

    calcular (numero1,numero2);
 }

}