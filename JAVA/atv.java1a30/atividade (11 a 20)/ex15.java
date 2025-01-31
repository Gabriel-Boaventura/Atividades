import java.util.Scanner;

class ex15 { 

public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    float n1, contador, intervalo;
    contador = 0;
    intervalo = 0;

    while (intervalo<= 2) {
        intervalo ++;
        System.out.println(" Escreva um numero: ");
        n1 = leia.nextFloat();
        
        if (n1 >= 100 && n1<= 200){
            contador ++;
        }
    }

    System.out.println(" Foram digitados " +contador+ " numeros entre 100 e 200");
}
}