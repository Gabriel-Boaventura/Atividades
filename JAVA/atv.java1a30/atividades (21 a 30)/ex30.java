import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = leia.nextLine();
        System.out.println("Informe a idade do funcionário:");
        int idade = leia.nextInt();
        System.out.println("Informe o sexo do funcionário (M/F):");
        char sexo = leia.next().charAt(0);
        System.out.println("Informe o salário fixo do funcionário:");
        double salarioFixo = leia.nextDouble();

        double abono;
        if (idade >= 30) {
            if (sexo == 'M') {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else {
            if (sexo == 'F') {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido: " + salarioLiquido);

    }

}
