import java.util.Scanner;

class ex17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, contador, intervalo;
    contador = 0;
    intervalo = 0;

    while (intervalo<= 10) {
        intervalo ++;
        System.out.println(" Escreva um numero: ");
        n1 = leia.nextFloat();
        
        if (n1 >= 10 && n1<= 150){
            contador ++;
        }
    }

    System.out.println(" Foram digitados " +contador+ " numeros entre 10 e 150");
    }
}
