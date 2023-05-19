import java.util.Scanner;
import java.lang.Math;

public class Exemplo2_2303 {
    public static void main(String[] args) {

        System.out.println("informe o primeiro numero: ");
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        System.out.println("informe o valor do segundo numero: ");
        int n2 = ler.nextInt();

        if (n1>n2){
            System.out.println("O maior numero foi N1");
        }else if(n2>n1){
            System.out.println("O maior numero foi N2");
        }else{
            System.out.println("os numero sao iguais");
        }
    } 
}
