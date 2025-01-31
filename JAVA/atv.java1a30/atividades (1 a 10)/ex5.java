import java.util.Scanner;


class media {

     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, n3, media;
        String nome;
        System.out.print("Digite seu nome: ");
        nome = var.nextLine();
        System.out.print("informe nota1: ");
        n1 = var.nextFloat();
        System.out.print("informe nota2: ");
        n2 = var.nextFloat();
        System.out.print("informe nota3: ");
        n3 = var.nextFloat();
        System.out.print("informe nota4: ");
       
        media = (n1+n2+n3)/3;

        if(media>=6){
            System.out.print("0(a) aluno(a)" + nome + " foi aprovado(a)com a média: " + media);
        }else if(media >=3 && media <6 ){
            System.out.print("0(a) aluno(a)" + nome + " esta de recuperação com a média: " + media);
        }else{
            System.out.print("0(a) aluno(a)" + nome + " foi reprovado(a)com a média: " + media);
        }
     }
}


    

