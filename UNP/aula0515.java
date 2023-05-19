import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class aula0515 {
    
    public static void notasAlunos (String[] nomes, double[][] notas){
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //notasAlunos(alunos,notas);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("NOTAS.txt"));    

            for(int i =0; i<2; i++){
                System.out.println("digite a nome para o aluno: "+(i+1)+": ");
                String nome = input.nextLine();

                double nota1, nota2, nota3;

                do{
                    System.out.println("digite a nota da unidade 1 de "+nome+": ");
                    nota1 = input.nextInt();
                }while(nota1<0 || nota1>10);
                do{
                    System.out.println("digite a nota da unidade 2 de "+nome+": ");
                    nota2 = input.nextInt();
                }while(nota2<0 || nota2>10);
                do{
                    System.out.println("digite a nota da unidade 3 de "+nome+": ");
                    nota3 = input.nextInt();
                }while(nota3<0 || nota3>10);

                input.nextLine();

                String linha = nome + "; "+nota1+"; "+nota2+"; "+nota3;
                writer.write(linha);
                writer.newLine();
                
            }
            input.close();
            writer.close();

            System.out.println("As notas dos alunos foram salvas no arquivo NOTAS.txt.");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
