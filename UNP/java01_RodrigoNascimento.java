public class java01_RodrigoNascimento {
   public static void main(String[] args) {
      int[][] matriz = new int[3][3];
      int counter = 0;
      for(int i=1; i<=3; i++) {
         for(int j=0; j<3; j++) {
            matriz[i-1][j] = counter;
            counter++;
         }
      }

      System.out.println("Numeros da matriz:");
      for(int i=0; i<3; i++) {
         for(int j=0; j<3; j++) {
               System.out.print(matriz[i][j] + " ");
         }
      }
      System.out.println();
      System.out.println("Numeros pares da matriz:");

      for(int i=0; i<3; i++) {
         for(int j=0; j<3; j++) {
            if(matriz[i][j] % 2 == 0) 
               System.out.print(matriz[i][j] + " ");
         }
      }
   }
}