import java.util.Scanner;



public class prova01{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero X: ");

        int x = input.nextInt();
        

        int y = 0, j=0;
        double media=0;


        for(int i=5; i<=200; i++){
            y = y+x+i;
            media=x+i;
            j++;
        }
        media = media/j;
        input.close();
        System.out.println("Y= "+y);
        System.out.println("Media= "+media);
    }

}