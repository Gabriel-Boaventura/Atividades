import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        
        System.out.println(" Qual a sua idade? ");
        idade=leia.nextInt();

        if(idade<0){
            System.out.println("idade invalida");
        } else{
            if(idade<=12 && idade>=0){
                System.out.println(" voce é uma crianca ");
            }else{
                    if(idade>=13 && idade<=19){
                        System.out.println(" voce é um adolescente ");
                 }else{
                    if(idade>=20 && idade<=64){
                        System.out.println(" voce é um adulto ");
                        }else{
                            System.out.println("voce é um idoso");
                 }
                }
            }
        }

    }
    
}