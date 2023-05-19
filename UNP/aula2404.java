import java.util.Scanner;

public class aula2404 {
    

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num2 = input.nextInt();
        maiorEntreDoisInt(num1, num2);

        
        input.close();
    }



    public static int maiorEntreDoisInt(int num1, int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }

    }

    public static boolean ePrimo(int num){
        if (num<=1){
            return false;
        }

        for (int i =2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static String ePalindromo(String palavra){
        int esquerda = 0;
        int direita = palavra.length()-1;

        while(esquerda<direita){
            if(palavra.charAt(esquerda) != palavra.charAt(direita)){
                return "não";
            }
            esquerda++;
            direita--;
        }

        return "sim";
    }
}
