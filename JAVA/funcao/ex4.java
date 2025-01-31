import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1,total;

        System.out.println("Digite um numero inteiro: ");
        num1 = leia.nextInt();

        if((num1%2) == 0){ 
            System.out.println("O numero é par");
        }else{
            System.out.println(" o numero é impar");
        }


    }
    
}