import java.util.Scanner;

public class ex1 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

            System.out.println(" insira um lado do terreno: ");
            float terreno1 = leia.nextFloat();
            System.out.println(" insira o outro lado do terreno: ");
            float terreno2 = leia.nextFloat();

            System.out.println("a area do terreno é de:" +terreno1*terreno2);




    }

        
}