import java.util.Scanner;

public class bool {
    
    public static boolean verificaIdade(int idade){

        if(idade >=18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade para verificar:");
        idade = leia.nextInt();

        if(verificaIdade(idade)){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }

}


