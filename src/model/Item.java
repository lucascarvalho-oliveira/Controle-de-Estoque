package model;

public class Item {
    private String nome;
    private int quantidade;
    private double valor;

    public Item(String nome, int quantidade, double valor){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        if(valor <= 0){
            throw new IllegalArgumentException("Valor tem que ser maior que zero");
        }

        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getValor(){
        return valor;
    }

    public void setAddQuantidade(int addQuantidade){
        this.quantidade += addQuantidade;
    }

    public void setRemoQuantidade(int remoQuantidade){
        this.quantidade -= remoQuantidade;
    }

    public double setSomaTotal(){
        return quantidade * valor;
    }

}
