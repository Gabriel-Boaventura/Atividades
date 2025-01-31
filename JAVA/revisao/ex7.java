import java.util.Scanner;
public class ex7{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num[];

        num = new int[10];

        for(int i=0; i<=9; i++){
            System.out.println("insira um numero");
            num[i] = leia.nextInt();
        }

        for(int i=0; i<=9;i++){
            if(num[i]%2 == 0 ){
                System.out.println(" o numero "+num[i]+" é par");
            }else{
                System.out.println(" o numero "+num[i]+" é impar");
            }                               
        }

       
    }
}