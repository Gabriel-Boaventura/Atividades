import java.util.Scanner;
public class ex3{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println(" Qual a sua idade? ");
        idade = leia.nextInt();

        if(idade<= 12 && idade>=0){
            System.out.println(" Você é uma crianca ");
        }
        else{
            if(idade>=13 && idade<=19){
            System.out.println(" Você é um adolescente ");
        }else{
            if(idade>=20 && idade<=64){
            System.out.println(" Você é um adulto ");
        }else{
            System.out.println(" Você é um idoso ");
            
    }
      }
       }
     }
  } 

