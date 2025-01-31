import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float idade;
        String nome;

        System.out.println(" digite seu nome: ");
        nome = leia.nextLine();
        System.out.println(" Digite a sua idade: ");
        idade = leia.nextFloat();

        if(idade>=18){
            System.out.println(" Você é maior de idade ");
        }else{
            System.out.println(" Você é menor de idade ");
        }
    }
}
