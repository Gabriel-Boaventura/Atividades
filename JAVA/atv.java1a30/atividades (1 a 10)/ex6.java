import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float valorB,valorA, valorC, valorCC;
System.out.println("coloque o valor de A");
valorA = leia.nextFloat();
System.out.println("coloque o valor B");
valorB= leia.nextFloat();

valorCC = valorA;

System.out.println(" A virou: " + (valorA = valorB));
System.out.println(" B virou: " + (valorB = valorCC));
    }
}