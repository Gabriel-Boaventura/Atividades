import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível do veículo (álcool, gasolina, diesel): ");
            String combustivel = leia.nextLine();

            if (combustivel.equalsIgnoreCase("álcool") || combustivel.equalsIgnoreCase("gasolina")
                    || combustivel.equalsIgnoreCase("diesel")) {
                System.out.println("Digite o valor do veículo (ou 0 para encerrar): ");
                double valorVeiculo = leia.nextDouble();
                leia.nextLine();

                if (valorVeiculo == 0) {
                    break;
                }

                double desconto = 0;

                if (combustivel.equalsIgnoreCase("álcool")) {
                    desconto = valorVeiculo * 0.25;
                } else if (combustivel.equalsIgnoreCase("gasolina")) {
                    desconto = valorVeiculo * 0.21;
                } else if (combustivel.equalsIgnoreCase("diesel")) {
                    desconto = valorVeiculo * 0.14;
                }

                double valorPago = valorVeiculo - desconto;

                totalDesconto += desconto;
                totalPago += valorPago;

                System.out.println("Desconto: R$" + desconto);
                System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
            } else {
                System.out.println("Tipo de combustível inválido. Por favor, digite novamente.");
            }
        }

        System.out.println("Total de desconto dado: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

    }
}
