import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int totalAptos = 0;
        int totalInaptos = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Dados da pessoa " + i + ":");

            System.out.print("Nome: ");
            String nome = leia.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = leia.nextLine();

            System.out.print("Saúde (Boa/Ruim): ");
            String saude = leia.nextLine();

            System.out.print("Idade: ");
            int idade = leia.nextInt();
            
            clearBuffer(leia);
            


            if (idade>=18 && saude.equalsIgnoreCase("Boa")) { 
                System.out.println("Você esta apto para servir");
                totalAptos++;
            }if(idade<18 || saude.equalsIgnoreCase("Ruim")){
                System.out.println("Você não esta apto para servir");
                totalInaptos++;
            }
            }
        

        System.out.println("\nTotal de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);
        } 
        
        private static void clearBuffer (Scanner scanner){
            if (scanner.hasNextLine()){

            scanner. nextLine();
        }
        }
    }

