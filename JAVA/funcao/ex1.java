import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
    
        String nome, cidade;
        float idade;

        System.out.println("digite seu nome: ");
        nome= leia.nextLine();
        System.out.println(" digite sua cidade: ");
        cidade = leia.nextLine();
        System.out.println("digite sua idade: ");
        idade = leia.nextFloat();
         
        System.out.println( " seu nome é : " +nome+ " da cidade: " +cidade+ " e sua idade é : " +idade );







}
}
