import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = leia.nextDouble();

        int numFuncionarios = 584;

        double aumentoTotal = 0;

        for (int i = 0; i < numFuncionarios; i++) {

            System.out.println("Informe o nome do funcionário:");
            String nomeFuncionario = leia.next();
            System.out.println("Informe o salário:");
            double salarioFuncionario = leia.nextDouble();

            double reajuste;
            if (salarioFuncionario < 3 * salarioMinimo) {
                reajuste = salarioFuncionario * 0.5;
            } else if (salarioFuncionario >= 3 * salarioMinimo && salarioFuncionario <= 10 * salarioMinimo) {
                reajuste = salarioFuncionario * 0.2;
            } else if (salarioFuncionario > 10 * salarioMinimo && salarioFuncionario <= 20 * salarioMinimo) {
                reajuste = salarioFuncionario * 0.15;
            } else {
                reajuste = salarioFuncionario * 0.1;
            }

            double novoSalario = salarioFuncionario + reajuste;

            System.out.println("Funcionário: " + nomeFuncionario);
            System.out.println("Reajuste: " + reajuste);
            System.out.println("Novo salário: " + novoSalario);

            aumentoTotal += reajuste;
        }

        System.out.println("Aumento total na folha de pagamento: " + aumentoTotal);

    }
}
