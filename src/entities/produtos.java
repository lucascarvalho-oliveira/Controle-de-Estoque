package entities;

public class produtos {
	public String nome;
	public double valor;
	public int quantidade;
	
	public double valor_estoque() {
		double QTD = valor * quantidade;
		return QTD;
	}
	
	public void add_produto(int A_quantidade) {
		quantidade += A_quantidade;
	}
	
	public void remove_produto(int R_quantidade) {
		quantidade -= R_quantidade;
	}
}
