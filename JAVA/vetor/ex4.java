import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int num[], pares = 0;
    num = new int[15];

    for(int i = 0; i<15; i++){
        System.out.println("escreva " + (i+1) + " numero:");
        num[i] = leia.nextInt(); 
    }

    for(int i=0; i<15; i++){
        if(num[i]%2 == 0){
            pares++;
        }
    }
        
    System.out.println(" a quantidade de numeros pares são:" +pares);
    
    }
}

