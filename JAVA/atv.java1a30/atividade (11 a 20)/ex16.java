import java.util.Scanner;

class ex16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3, n4, media;
        String nome;
        System.out.print(" Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print(" Informe a sua nota1: ");
        n1 = leia.nextInt();
        System.out.print(" Informe a sua nota2: ");
        n2 = leia.nextInt();
        System.out.print(" Informe a sua nota3: ");
        n3 = leia.nextInt();
        
        media = (n1 + n2 + n3 ) / 3;
        System.out.print("a media de " + nome + " é : " + media);

        if (media>=7){
            System.out.print(" Você foi aprovado, Parabens!!! ");
        }else if (media<=6.9 && media>=5.1)
            System.out.println(" Você esta de recuperação! ");
        else
            System.out.println(" Você foi reprovado!!! ");
    }
}


