import java.util.Scanner;

class ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome, sexo;
        int homem = 0, mulher = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Informe seu nome:");
            nome = leia.next();
            System.out.println("Informe seu sexo M/F");
            sexo = leia.next();
            if (sexo.equals("M") || sexo.equals("m")) {
                System.out.println("Seu nome é " + nome + " e você é homem");
                homem++;
            } else if (sexo.equals("F") || sexo.equals("f")) {
                System.out.println("Seu nome é" + nome + " e você é mulher");
                mulher++;
            }
        }
        System.out.println("Homens: " + homem);
        System.out.println("Mulheres: " + mulher);
    }
}
