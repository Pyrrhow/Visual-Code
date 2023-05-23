package ProgOrientadaObjetos;
import java.util.Scanner;

public class prova02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int soma=0,temp=0;

        System.out.print("Digite o numero inicial: ");
        int ini = input.nextInt();
        System.out.print("Digite o numero final: ");
        int fin = input.nextInt();

        if (ini>fin){
            temp = fin;
            fin = ini;
            ini = temp;
        }

        System.out.println("Sequencia:");
        while(ini<fin){
            soma=soma+ini;
            System.out.print(ini+", ");
            ini++;
        }

        soma=soma+fin;
        System.out.print(fin);
        System.out.println("\nSoma: "+soma);
        input.close();
    }
}
