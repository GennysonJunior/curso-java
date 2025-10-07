package pedidos;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> pedido = new ArrayList<>();

    public void adicionarItem(String nome, int qtd, double precoUni) {
        this.pedido.add(new ItemPedido(nome, qtd, precoUni));
    }

    public double valorTotal() {
        double res = 0.0;
        for(ItemPedido item : pedido) {
            res += item.subtotal();
        }

        return res;
    }
    
}
