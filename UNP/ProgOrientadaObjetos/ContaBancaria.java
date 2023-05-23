package ProgOrientadaObjetos;

public class ContaBancaria {
    //atributos da classe
    private float saldo=0;
    private String titular;
    
    public void mostrarSaldo() {
        System.out.println("Saldo: "+saldo);
    }
    public void deposito(float valor) {
        this.saldo = this.saldo+valor;
    }
    public void saque(float valor) {
        this.saldo = this.saldo-valor;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String nome) {
        titular = nome;
    }




    
}
