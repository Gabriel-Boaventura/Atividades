import java.util.Scanner;
public class ex5{
    public static void bobi(){
        Scanner leia = new Scanner(System.in);

        int n1,n2,total;

        System.out.println(" Digite um numero: ");
        n1 = leia.nextInt();
        System.out.println(" Digite outro numero");
        n2 = leia.nextInt();

        total = n1*n2;

        System.out.println(" A multiplicação entre eles é: " +total);

    }

    public static void main(String[] args) {
        bobi();
    }
}