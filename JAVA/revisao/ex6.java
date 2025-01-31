import java.util.Scanner;
public class ex6{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
   
            int numeros[], soma = 0; 

             numeros= new int[10]; 
            
            for(int i =0; i<10; i++ ){
             System.out.println("informe o "+(i+1)+" numero");
             numeros[i]=leia.nextInt();
            }
            
            System.out.println("os numeros sao: ");
            for(int i =0; i<10; i++){
             soma = soma + numeros[i];
            }
            
            System.out.println(soma);

    }
}
