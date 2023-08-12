package ProgOrientadaObjetos;
import java.util.Scanner;

public class listaExercicio {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Exercício 01");
            System.out.println("2 - Exercício 02");
            System.out.println("3 - Exercício 03");
            System.out.println("4 - Exercício 04");
            System.out.println("5 - Exercício 05");
            System.out.println("6 - Exercício 06");
            System.out.println("7 - Exercício 07");
            System.out.println("8 - Exercício 08");
            System.out.println("9 - Exercício 09");
            System.out.println("10 - Exercício 10");
            System.out.println("11 - Exercício 11");
            System.out.println("12 - Exercício 12");
            System.out.println("13 - Exercício 13");
            System.out.println("14 - Exercício 14");
            System.out.println("15 - Exercício 15");
            System.out.println("16 - Exercício 16");
            System.out.println("17 - Exercício 17");
            System.out.println("18 - Exercício 18");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1:
                    exercicio01();
                    break;
                case 2:
                    exercicio02();
                    break;
                case 3:
                    exercicio03();
                    break;
                case 4:
                    exercicio04();
                    break;
                case 5:
                    exercicio05();
                    break;
                case 6:
                    exercicio06();
                    break;
                case 7:
                    exercicio07();
                    break;
                case 8:
                    exercicio08();
                    break;
                case 9:
                    exercicio09();
                    break;
                case 10:
                    exercicio10();
                    break;
                case 11:
                    exercicio11();
                    break;
                case 12:
                    exercicio12();
                    break;
                case 13:
                    exercicio13();
                    break;
                case 14:
                    exercicio14();
                    break;
                case 15:
                    exercicio15();
                    break;
                case 16:
                    exercicio16();
                    break;
                case 17:
                    exercicio17();
                    break;
                case 18:
                    exercicio18();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            System.out.println("");
        } while(opcao != 0);
        
        input.close();
    }

    public static void exercicio01() {
        System.out.println("1. Faça um Programa que mostre a mensagem 'Alo mundo' na tela.");
        System.out.println("Alo mundo");
        promptEnterKey();
    }
    public static void exercicio02() {
        System.out.println("2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        double num = input.nextDouble();
        System.out.println("O número informado foi: "+num);
        promptEnterKey();
        
    }
    public static void exercicio03() {
        System.out.println("3. Faça um Programa que peça dois números e imprima a soma.");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double num = input.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = input.nextDouble();
        System.out.println("A soma dos 2 numeroes é: "+(num+num2));
        promptEnterKey();
    }
    public static void exercicio04() {
        System.out.println("4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segunda nota: ");
        double num2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double num3 = input.nextDouble();
        System.out.print("Digite o quarta nota: ");
        double num4 = input.nextDouble();
        System.out.println("A media das quatro notas é: "+((num1+num2+num3+num4)/4));
        promptEnterKey();
    }
    public static void exercicio05() {
        System.out.println("5. Faça um Programa que converta metros para centímetros.");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero em metros: ");
        double num = input.nextDouble();
        System.out.printf("%.2fm = %.2fcm",num,(num*100));
    
        promptEnterKey();
    }
    public static void exercicio06() {
        System.out.println("6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double num = input.nextDouble();
        System.out.println("A area do circule é: "+(Math.pow(num, 2)*Math.PI));
      
        promptEnterKey();
    }

    public static void exercicio07() {
        System.out.println("7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.");
        Scanner input = new Scanner(System.in);
        System.out.print("Tamanho da base (ou altura) do quadrado: ");
        double num = input.nextDouble();
        System.out.printf("A area do quadrado é: %.2f %ne o dobro da sua area é: %.2f",(num*num),(num*num*2));
        
        promptEnterKey();
    }
    public static void exercicio08() {
        System.out.println("8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.");
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double num = input.nextDouble();
        System.out.print("Número de horas trabalhadas no mês: ");
        double num2 = input.nextDouble();
        System.out.printf("Salario do mês é de: R$%.2f",(num*num2));
        
        promptEnterKey();
    }

    public static void exercicio09() {
        System.out.println("9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius");
        Scanner input = new Scanner(System.in);
        System.out.print("Temperatura em graus Fahrenheit: ");
        double num = input.nextDouble();
        System.out.printf("Temperatura em graus Celsius: %.2f°",(5*((num-32)/9)));
       
        promptEnterKey();
    }

    public static void exercicio10() {
        System.out.println("10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.");
        Scanner input = new Scanner(System.in);
        System.out.print("Temperatura em graus Celsius: ");
        double num = input.nextDouble();
        System.out.printf("Temperatura em graus Fahrenheit: %.2fF",(((num*9)/5)+32));
     
        promptEnterKey();
    }

    public static void exercicio11() {
        System.out.println("11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:");
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro numero inteiro: ");
        int num = input.nextInt();
        System.out.print("Segundo numero inteiro: ");
        int num2 = input.nextInt();
        System.out.print("Numero real: ");
        double num3 = input.nextDouble();
        System.out.println("a) o produto do dobro do primeiro com metade do segundo.");
        System.out.println("a) "+((num*2)*(num2/2)));
        promptEnterKey();
        System.out.println("b) a soma do triplo do primeiro com o terceiro.");
        System.out.println("b) "+((num*3)+num3));
        promptEnterKey();
        System.out.println("c) o terceiro elevado ao cubo.");
        System.out.println("c) "+(Math.pow(num3, 3)));
        
        promptEnterKey();
    }

    public static void exercicio12() {
        System.out.println("12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58");
        Scanner input = new Scanner(System.in);
        System.out.print("Altura: ");
        double num = input.nextDouble();
        System.out.printf("Seu peso ideal é de: %.2f",((72.7*num)-58));
     
        promptEnterKey();
    }

    public static void exercicio13() {
        System.out.println("13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:");
        Scanner input = new Scanner(System.in);
        System.out.print("Altura: ");
        double num = input.nextDouble();
        System.out.printf("Para homens o peso ideal é de: %.2f",((72.7*num)-58));
        System.out.printf("%nPara mulheres o peso ideal é de: %.2f",( (62.1*num) - 44.7));
     
        promptEnterKey();
    }

    public static void exercicio14() {
        System.out.println("14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.");
        Scanner input = new Scanner(System.in);
        System.out.print("Peso dos peixes(kg): ");
        double peso = input.nextDouble();
        double excesso=0;
        double multa=0;
        if (peso>50){
            excesso = peso-50; 
            multa = excesso * 4;
            System.out.printf("O excesso foi de: %.2fkg%ne a multa será de: R$%.2f", excesso, multa);
        } else {
            System.out.println("Não houve excesso de peixe.");
        }
       
        promptEnterKey();
    }

    public static void exercicio15() {
        System.out.println("15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:");
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double salario = input.nextDouble();
        System.out.print("Número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();

        double bruto = salario*horas;
        double ir = bruto*0.11;
        double inss = bruto*0.08;
        double sind = bruto*0.05;
        double liqu = bruto -ir-inss-sind;


        System.out.println("a. salário bruto.");
        System.out.printf("Salario do mês é de: R$%.2f%n",bruto);
        promptEnterKey();
        System.out.println("b. quanto pagou ao INSS.");
        System.out.printf("INSS: R$%.2f%n",inss);
        promptEnterKey();
        System.out.println("c. quanto pagou ao sindicato.");
        System.out.printf("Sindicato: R$%.2f%n",sind);
        promptEnterKey();
        System.out.println("d. o salário líquido");
        System.out.printf("Liquido: R$%.2f%n",liqu);
        promptEnterKey();
        System.out.printf("e. calcule os descontos e o salário líquido, conforme a tabela abaixo:%n+ Salário Bruto: R$%n- IR (11%%): R$%n- INSS (8%%): R$%n- Sindicato (5%%): R$%n= Salário Líquido: R$%n%n");
        System.out.printf("+ Salário Bruto: R$%.2f%n- IR (11%%): R$%.2f%n- INSS (8%%): R$%.2f%n- Sindicato (5%%): R$%.2f%n= Salário Líquido: R$%.2f",bruto,ir,inss,sind,liqu);
       
        promptEnterKey();
    }

    public static void exercicio16() {
        System.out.println("16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.");
        Scanner input = new Scanner(System.in);
        System.out.print("Tamanho em metros quadrados da area a ser pintada: ");
        double m2 = input.nextDouble();

        double litros = m2/3;
        int baldes = (int) Math.ceil(litros/18);
        double preco = baldes * 80;
        double sobra = (baldes*18)-litros;
        System.out.printf("Sera preciso %.2f litros de tinta%n%d baldes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta",litros,baldes,preco,sobra);
      
        promptEnterKey();
    }

    public static void exercicio17() {
        System.out.println("17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.");
        Scanner input = new Scanner(System.in);
        System.out.print("Tamanho em metros quadrados da area a ser pintada: ");
        double m2 = input.nextDouble();

        double litros = m2/6;
        double litrosFolga = litros*1.1;
        int galao = (int) Math.ceil(litros/18);
        int balde = (int) Math.ceil(litros/3.6);
        double precoG = galao * 80;
        double precoB = balde * 25;
        double sobraG = (galao*18)-litros;
        double sobraB = (balde*3.6)-litros;
        System.out.printf("a) Sera preciso %.2f litros de tinta%n%d galoes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta%n",litros,galao,precoG,sobraG);
        promptEnterKey();
        
        System.out.printf("b) %d baldes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta",balde,precoB,sobraB);
        promptEnterKey();
        
        System.out.println();
        if(litrosFolga<10.8){
            balde = (int) Math.ceil(litrosFolga/3.6);
            precoB = balde * 25;   
            sobraB = (balde*3.6)-litros;
            System.out.printf("c) Sera preciso %.2f litros de tinta(10%% de folga)%n%d baldes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta",litrosFolga,balde,precoB,sobraB);
        }else if(litrosFolga%18<10.8){
            galao = (int) Math.ceil(litrosFolga/18);
            galao--;
            precoG = galao * 80;
            double litrosSobra = litrosFolga%18;
            balde = (int) Math.ceil(litrosSobra/3.6);
            double precoM = precoG+(balde*25);
            double sobraM = (balde*3.6)-litrosSobra;
            System.out.printf("c) Sera preciso %.2f litros de tinta(10%% de folga)%n%d galoes de tinta%n%d baldes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta",litrosFolga,galao,balde,precoM,sobraM);
        
        }else{
            galao = (int) Math.ceil(litrosFolga/18);
            precoG = galao * 80;
            sobraG = (galao*18)-litros;
            System.out.printf("c) Sera preciso %.2f litros de tinta(10%% de folga)%n%d galoes de tinta%nCustara R$%.2f Reais%nSobrara %.2f Litros de tinta",litrosFolga,galao,precoG,sobraG);
        }

    
        promptEnterKey();
    }
    public static void exercicio18() {
        System.out.println("18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).");
        Scanner input = new Scanner(System.in);
        System.out.print("O tamanho de um arquivo para download (em MB): ");
        double tamanho = input.nextDouble();
        System.out.print("A velocidade de um link de Internet (em Mbps)");
        double velocidade = input.nextDouble();

        double segundos = (tamanho/velocidade);
        double minutos = segundos/60;
        System.out.printf(" tempo aproximado de download do arquivo usando este link %.2fmin%n",minutos);

        int min = (int)Math.floor(minutos);
        int sec = (int)segundos-(min*60);
        
        System.out.printf("%d minuto e %d segundos",min,sec);
        promptEnterKey();
    }


    public static void promptEnterKey(){
        System.out.printf("%nAperte \"ENTER\" para continuar...%n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }





}
