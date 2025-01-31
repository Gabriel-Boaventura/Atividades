import java.util.Scanner;
public class ex8{
    public static void armazem(int n1, int n2){
        System.out.println("A soma dos números é: " + (n1+n2));

    }


    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int n1,n2,soma;
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextInt();

        armazem(n1,n2);
    }
}