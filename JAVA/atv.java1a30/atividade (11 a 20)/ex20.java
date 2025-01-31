import java.util.Scanner;

class ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor_carro, valor_desconto, valor_carro_desconto;
        double total_geral = 0.0;
        int ano, total_carros_ano_2000 = 0;
        char resposta;

        do {

            System.out.print("Informe o valor do carro sem desconto: ");
            valor_carro = entrada.nextDouble();

            System.out.print("Informe o ano do carro: ");
            ano = entrada.nextInt();

            if (ano <= 2000) {
                valor_desconto = valor_carro * (12.0 / 100.0);

                total_carros_ano_2000 = total_carros_ano_2000 + 1;
            } else {
                valor_desconto = valor_carro * (7.0 / 100.0);
            }

            valor_carro_desconto = valor_carro - valor_desconto;
            System.out.println("Desconto concedido: " + valor_desconto);
            System.out.println("Valor do carro com desconto: " + valor_carro_desconto);

            total_geral = total_geral + valor_carro_desconto;

            System.out.print("Deseja adicionar mais carros? [S, N]: ");
            resposta = entrada.nextLine().charAt(0);
            System.out.println();
        } while ((resposta != 'N') && (resposta != 'n'));

        System.out.println("Total de carros com ano até 2000: " +
                total_carros_ano_2000);
        System.out.println("Total geral a pagar: " + total_geral);
    }

}
