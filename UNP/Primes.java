import java.util.Scanner;  
  
public class Primes  {  
   public static void main(String args[]) {   
      int N = 24;  
      boolean[] sieve = new boolean[N];  
       
      for (int i = 0; i< sieve.length; i++) {  
         sieve[i] = true;  
      }  
      for (int i = 2; i< Math.sqrt(N); i++) {  
         if(sieve[i] == true) {  
            for(int j = (i*i); j<N; j = j+i) {  
               sieve[j] = false;  
            }  
         }
      }  
      System.out.println("List of all prime numbers up to 24 are: ");  
      for (int i = 2; i< sieve.length; i++) {  
         if(sieve[i]==true) {  
            System.out.println(i);  
         }  
      }  
   }  
}  