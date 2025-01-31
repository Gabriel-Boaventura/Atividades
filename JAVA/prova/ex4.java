import java.util.Scanner;

public class ex4 {

    public static void parametro(int num[]) {
        
        for(int i=0; i<=9; i++){
            if(num[i]%2 != 0){
                System.out.println("\nO número "+num[i]+" é ímpar");
            }
        }
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num[];
        num = new int[10];

        for(int i=0; i<=9; i++){
            System.out.println("Digite o "+(i+1)+"º número");
            num[i] = leia.nextInt();
        }

        parametro(num);
    }
    }

    