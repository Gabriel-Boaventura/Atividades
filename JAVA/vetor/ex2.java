import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int num[], media = 0, total;
    num = new int[5];

    for(int i = 0; i<5; i++){
        System.out.println("escreva " + (i+1) + " numero:");
        num[i] = leia.nextInt();

        
    }

    for(int i = 0; i<5; i++){
        media = media + num[i];
    }
    total = media / 5;

    System.out.println(total);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}
}