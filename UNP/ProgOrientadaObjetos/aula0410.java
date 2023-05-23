package ProgOrientadaObjetos;
import java.util.Scanner;
import java.lang.Math;


public class aula0410 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        double num = input.nextDouble();
        double raizQuadrada = Math.sqrt(num);
        

        System.out.printf("A raiz quadrada de %.2f é %.2f",num,raizQuadrada);
        input.close();
    }
}
