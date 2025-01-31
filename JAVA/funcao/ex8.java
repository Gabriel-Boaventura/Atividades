import java.util.Scanner;

public class ex8 {
    
public static void raizQuadrada (int n1){

    System.out.println(" o quadrado desse numero é: " + (n1*n1));

    }

 public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    int num1;
  
    System.out.println(" digite um numero: ");
    num1 = leia.nextInt();
 
    raizQuadrada(num1);


}
}