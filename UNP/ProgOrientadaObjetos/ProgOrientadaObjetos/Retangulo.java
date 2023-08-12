package ProgOrientadaObjetos;

public class Retangulo {
    //atributos da classe
    private double largura=0,altura=0;


    public double getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    //Metodos da Classe
    public double area() {
        return largura*altura;
    }
    public double perimetro() {
        return 2*(largura+altura);
    }
}
