import java.util.Scanner;
public class ex9{
    public static void gabibooa(){
        Scanner leia = new Scanner(System.in);
        int maior = 999999;

        System.out.println("digite o tamanho do vetor")
        int n1 = leia.nextInt();
        int[] vetor = new int[n1];
        for(int i = 0; i < n1; i++){
            System.out.println("digite o valor do vetor")
            vetor[i] = leia.nextInt();
            }

            for(int i = 1; i < n1; i++){
                if(vetor[i] > maior){
                    maior = vetor[i];
                    }
                }
                        }
                        System.out.println("o maior valor é "+maior);

    }

    public static void main(String[] args) {
        gabibooa();
    }
}







