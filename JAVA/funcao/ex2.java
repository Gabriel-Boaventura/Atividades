import java.util.Scanner;

public class ex2 {

    public static void calculaAreaRetangulo() {
        Scanner leia = new Scanner(System.in);
    
        float lado, altura,area;
        System.out.println("Informe o lado do retangulo:");
        lado = leia.nextFloat();
        System.out.println("Informe a altura: ");
        altura = leia.nextFloat();

        area = lado * altura;

        System.out.println("A area do retangulo informado é " +area );
        
    }
             public static void main(String[] args){
        
        calculaAreaRetangulo();

    }
}

