package revisaoJava.ADOV_Pizzaria;

import java.util.ArrayList;

public class Comprovante {

    private int codigo;
    private double total;
    private Cliente cliente = new Cliente();
    private ArrayList<Item> itens = new ArrayList<Item>();
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
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
