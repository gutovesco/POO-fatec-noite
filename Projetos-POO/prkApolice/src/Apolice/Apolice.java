package Apolice;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public Apolice(String nomeSegurado, int idade, float valorPremio){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("nomeSegurado = " + nomeSegurado);
        System.out.println("idade = " + idade);
        System.out.println("valorPremio = " + valorPremio);

    }
}
