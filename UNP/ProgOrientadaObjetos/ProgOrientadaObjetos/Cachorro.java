package ProgOrientadaObjetos;

public class Cachorro {
    //atributos da classe
    private String nome;

    //Metodos da Classe
    public void latir() {
        System.out.println("O cachorro "+ nome + " esta latindo");
    }
    
    //Metodos SET e GET
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
