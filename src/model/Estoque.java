package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public Item buscarNome(String busca){
        for(Item item : itens){
            if(item.getNome().equalsIgnoreCase(busca)){
                return item;
            }
        }
        return null;
    }

    public List<Item> getItens(){
        return this.itens;
    }
}
