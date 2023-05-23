package ProgOrientadaObjetos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class aula0508 {
    public static void main (String[] args){
        ex05();
    }

    public static void ex01 (){
        try {
            FileWriter myWriter = new FileWriter("meu_arquivo.txt");
            myWriter.write("Ola, mundo!"); 
            myWriter.close(); 
            System.out.println("Arquivo criado com sucesso!"); 
          } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo."); 
            e.printStackTrace();
          }
    }

    public static void ex02 (){
        try {
            FileWriter myWriter = new FileWriter("numeros.txt");
            for (int i=1;i<=10;i++){
                myWriter.write(i+"\n");
            }
            myWriter.close(); 
            System.out.println("Arquivo criado com sucesso!"); 
          } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo."); 
            e.printStackTrace();
          }
    }

    public static void ex03 (){
        try {
            File myFile = new File("numeros.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine(); 
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao abrir o arquivo."); 
            e.printStackTrace();
          }
    }

    public static void ex04 (){
        try {
            File myFile = new File("meu_arquivo.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine(); 
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao abrir o arquivo."); 
            e.printStackTrace();
          }
    }

    public static void ex05 (){
        try {
            FileWriter myWriter = new FileWriter("pares.txt");
            for (int i=2;i<=20;i+=2){
                myWriter.write(i+"\n");
            }
            myWriter.close(); 
            System.out.println("Arquivo criado com sucesso!"); 
          } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo."); 
            e.printStackTrace();
          }
    }
    
}
