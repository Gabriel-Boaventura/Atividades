import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);

        int num,total=0;

       System.out.println("digite um numero: ");
       num=leia.nextInt();

       for(int i=0; i<=num;i++){
            total = total + i;

       }

       System.out.println(" A soma dos numeros é " +total);
    }
}
