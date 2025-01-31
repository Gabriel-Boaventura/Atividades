import java.util.Scanner;

public class ex1 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    //declaracao    
        int numeros[], soma = 0; 

    //definicao do tamanho
        numeros= new int[10]; 
       
    //preechendo vetor
       for(int i =0; i<10; i++ ){
        System.out.println("informe o "+(i+1)+" numero");
        numeros[i]=leia.nextInt();
       }
       
    //mostrando o vetor
       System.out.println("os numeros sao: ");
       for(int i =0; i<10; i++){
        soma = soma + numeros[i];
       }
       
       System.out.println(soma);


}
    
}