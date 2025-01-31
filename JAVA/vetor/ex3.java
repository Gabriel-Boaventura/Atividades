import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int num[], maior = -9999999 , menor = 9999999;
    num = new int[8];
    

    for(int i = 0; i<8; i++){
        System.out.println("Digite um numero: ");
        num[i] = leia.nextInt();
    }

    for(int i = 0; i<8; i++){
        if (num[i] > maior) {
            maior = num[i];
        }
        if (num[i] < menor) {
            menor = num[i];
        }
    }


        System.out.println(" o menor numero é: " + menor);
        System.out.println(" o maior numero é: " + maior);

}
}

