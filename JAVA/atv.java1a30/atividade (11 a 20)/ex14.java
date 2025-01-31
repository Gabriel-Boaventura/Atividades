import java.util.Scanner;

class ex14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2;
        System.out.println(" Digite um numero: ");
        n1 = leia.nextFloat();
        System.out.println(" Digite outro numero: ");
        n2 = leia.nextFloat();

        if(
            n1>n2 )
            System.out.println(" O " +n1+ " é maior que " +n2);

        else 
            System.out.println(" O " +n2+ " é maior que " +n1);
        
    

    }
}
