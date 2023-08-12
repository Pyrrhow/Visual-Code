package ProgOrientadaObjetos;
public class sala {

    public static void main(String[] args) {
                
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("segundo exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("terceiro exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i <= j){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        
        System.out.println();
        System.out.println("quarto exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
            System.out.println("*");
        }
                
        System.out.println();
        System.out.println("quinto exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
            System.out.println("*");
        }
        
                
        System.out.println();
        System.out.println("sexto exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
            System.out.println("*");
        }


        System.out.println();
        System.out.println("sexto exemplo");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { 
                if (i == 0 || i == 4 || j == 0 || j == 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
