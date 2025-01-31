import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int num[];
    num = new int[6];

    for(int i = 0; i<6; i++){
        System.out.println("Digite um numero");
        num[i] = leia.nextInt();
    }

    for(int i = 6 - 1; i>=0; i--){
        System.out.println("\n numeros invertidos: " +num[i]);
    }

    
}
}