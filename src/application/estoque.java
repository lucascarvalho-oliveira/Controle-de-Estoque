package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.produtos;

public class estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<produtos> listaProdutos = new ArrayList<>();
		int menu;
		
		while(true) {
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Adicionar produto ao estoque.");
			System.out.println("2 - Adicionar ou remover quantidade do produto.");
			System.out.println("3 - Mostrar produto no estoque.");
			System.out.println("0 - Encerrarm programa.");
			menu = sc.nextInt();
			
			if(menu == 0) {
				break;
			}
			
			switch(menu) {
			case 1:
				sc.nextLine();
				
				produtos produtos = new produtos();
				
				System.out.println("\nNome do produto.");
				produtos.nome = sc.nextLine();
				System.out.println("Valor unitario do produto.");
				produtos.valor = sc.nextDouble();
				System.out.println("Quantidade que sera armazenado no estoque.");
				produtos.quantidade = sc.nextInt();
				
				listaProdutos.add(produtos);
				
				System.out.println("Produto adicionado ao estoque com sucesso.\n");
				break;
			
			case 2:
				sc.nextLine();
				
				System.out.println("Digite o nome do produto que deseja alterar");
				String busca = sc.nextLine();
				boolean encontrado = false;
				
				for(produtos p: listaProdutos) {
					if (p.nome.equalsIgnoreCase(busca)) {
						encontrado = true;
						
						System.out.println("Produto encontrado quantidade no estoque: " + p.quantidade);
						System.out.println("Qual das operações você deseja fazer:");
						System.out.println("1 - Adicionar | 2 - Remover | 0 - Retorna ao menu");
						int op = sc.nextInt();
						
						if(op == 1) {
							System.out.println("Quanto será adicionado ?");
							p.add_produto(sc.nextInt());
							System.out.println("Estoque ataulizado.");
						}else if(op == 2) {
							System.out.println("Quanto será removido ?");
							p.remove_produto(sc.nextInt());
							System.out.println("Estoque ataulizado.");
						}else {
							break;
						}
					}
					
					if(encontrado == false) {
						System.out.println("Produto de nome " + busca + " Não encontrado\n");
					}
				}
				break;
				
			case 3:
				System.out.println("Relatorio do estoque\n");
				
				for(produtos p: listaProdutos) {
					System.out.printf("produto de nome %s | valor unitario de %.2f | quantidade no estoque %d | valor total no estoque %.2f%n", p.nome, p.valor, p.quantidade, p.valor_estoque());
				}
				System.out.println();
				break;
			}
		}
		
		sc.close();
	}

}
