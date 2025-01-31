import java.util.Scanner;

public class ex9 {
    
public static void avarage (int n1,int n2, int n3, String nome){

System.out.println("A média de " + nome +" é: " + (n1+n2+n3)/3);


}

public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int n1, n2, n3;
    String nome;

    System.out.println("Digite o nome do aluno: ");
    nome = leia.nextLine();
    System.out.println("Digite o primeiro numero:");
    n1 = leia.nextInt();
    System.out.println("Digite o segundo numero:");
    n2 = leia.nextInt();
    System.out.println("Digite o terceiro numero:");
    n3 = leia.nextInt();

    avarage(n1,n2,n3,nome);

}
}