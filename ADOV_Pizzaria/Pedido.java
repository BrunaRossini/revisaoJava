package revisaoJava.ADOV_Pizzaria;

import java.util.ArrayList;

public class Pedido {
   private Cliente cliente = new Cliente();
   private ArrayList<Item> itens = new ArrayList<Item>();

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Item> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
