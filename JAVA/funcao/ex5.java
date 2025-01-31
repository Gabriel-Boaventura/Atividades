import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float num1;

        System.out.println(" digite um numero:");
        num1 = leia.nextFloat();

        if(num1<0){
            System.out.println("o numero é negativo");
        }if(num1>100){
            System.out.println("o numero é maior que 100");
        }if(num1<60){
            System.out.println(" voce esta reprovado ");
        }if(num1>=60){
            System.out.println("você esta aprovado!!!");
        }
        
    }
}

