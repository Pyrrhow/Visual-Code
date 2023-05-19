import java.util.Scanner;

public class java02_RodrigoNascimento {
   public static void main(String[] args) {
      int[] vetor = new int[4];
      Scanner input = new Scanner(System.in);

      System.out.println("Digite os valores para o vetor:");
      for (int i = 0; i < 4; i++) {
         vetor[i] = input.nextInt();
      }
      input.close();

      int aux;
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
            if (vetor[j] > vetor[j + 1]) {
               aux = vetor[j];
               vetor[j] = vetor[j + 1];
               vetor[j + 1] = aux;
            }
         }
      }

      System.out.println("Vetor em ordem crescente:");
      for (int i = 0; i < 4; i++) {
         System.out.print(vetor[i] + " ");
      }
   }
}