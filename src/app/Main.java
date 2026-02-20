package app;

import model.Item;
import model.Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Estoque Estoque = new Estoque();
        boolean sair = false;

        do{
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Cadastrar novo produto.");
            System.out.println("2 - Adicionar ou remover quantidade do produto.");
            System.out.println("3 - Relatório do estoque.");
            System.out.println("4 - sair.");
            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    sc.nextLine();
                    System.out.println();
                    System.out.println("Qual o nome do Produto:");
                    String nome = sc.nextLine();
                    System.out.println("Qual a quantidade do produto:");
                    int quantidade = sc.nextInt();
                    System.out.println("Qual o valor unitario do produto:");
                    double valor = sc.nextDouble();
                    Estoque.adicionarItem(new Item(nome, quantidade, valor));
                    System.out.println();
                    break;

                case 2:
                    boolean sair_2 = false;
                    do{
                        sc.nextLine();
                        System.out.println();
                        System.out.println("Qual o nome do produto:");
                        String busca = sc.nextLine();

                        Item BuscaNome = Estoque.buscarNome(busca);

                        if(BuscaNome != null){
                            System.out.println();
                            System.out.println("Produto encontrado:");
                            System.out.println("Nome: " + BuscaNome.getNome() + " | Quantidade armazenada: " + BuscaNome.getQuantidade());
                            System.out.println("1 - Adicionar quantidade | 2 - Remover quantidade");
                            int menu_2 = sc.nextInt();

                            if(menu_2 == 1){
                                System.out.println();
                                System.out.println("Informe a quantidade a ser adicionada.");
                                int GTD = sc.nextInt();
                                BuscaNome.setAddQuantidade(GTD);
                                break;
                            }else if(menu_2 == 2){
                                System.out.println();
                                System.out.println("Informe a quantidade a ser Removida.");
                                int GTD = sc.nextInt();
                                BuscaNome.setRemoQuantidade(GTD);
                                break;
                            }
                        }else{
                            System.out.println();
                            System.out.println("Produto nao encontrado");
                            System.out.println("1 - Deseja continuar procurando | 2 - sair");
                            int menu_3 = sc.nextInt();

                            if(menu_3 == 1){
                                continue;
                            }else{
                                sair_2 = true;
                            }
                        }
                    }while(!sair_2);
                    System.out.println();
                    continue;

                case 3:
                    System.out.println();
                    System.out.println("-------------- Relatório do estoque --------------");

                    for(Item itens : Estoque.getItens()){
                        System.out.println("Nome: " + itens.getNome());
                        System.out.println("Quantidade: " + itens.getQuantidade());
                        System.out.println("valor: R$ " + itens.getValor());
                        System.out.printf("Valor total: R$ %.2f%n", itens.setSomaTotal());
                        System.out.println();
                    }

                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Sistema finalizado");
                    sair = true;
            }

        }while(!sair);

        sc.close();
    }
}
