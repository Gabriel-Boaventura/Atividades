//criar um programa que faça as 4 operaçoe de 2 numeros informados

import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float n1,n2, adi, sub, mul, div;

        System.out.println("\nDigite um numero: ");
        n1 = leia.nextFloat();

        System.out.println("Digite outro numero: ");
        n2 = leia.nextFloat();

        adi = n1+n2;
        sub = n1-n2;
        mul = n1*n2;
        div = n1/n2;

        System.out.println(" os resultados são: \n Adição: " + adi + "\n Subtração: " + sub + "\n Divisão: " + div + "\n Multiplicação: " + mul);
    }
    
}