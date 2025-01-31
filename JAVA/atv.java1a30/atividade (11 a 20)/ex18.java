import java.util.Scanner;

class ex18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float idade, contador, intervalo;
    contador = 0;
    intervalo = 0;

    while (intervalo<= 10) {
        intervalo ++;
        System.out.println("Escreva sua idade: "); 
        idade = leia.nextFloat();
        
        if (idade >= 18 && idade<= 100){
            contador ++;
                System.out.println( "Maior de idade \n" );}
            else if (idade <18){
                contador ++;
                System.out.println("Menor de idade \n ");
            }

         }
    }
        
    
}

