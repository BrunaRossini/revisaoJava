package revisaoJava.ADOV_Pizzaria;

import revisaoJava.ADOII_CompraOnline.Compra;

public class Pagamento {

    Pedido pedidos = new Pedido();
    Comprovante comprovante = new Comprovante();

    public Comprovante faturarPedido(Pedido pedidos) {
        double totalComprovante = comprovante.getTotal();
        String nome = comprovante.getCliente().getNome();

        pedidos.getItens();

    }

    private double calcularTotal(Pedido pedidos) {
        pedidos.getItens();

        gerarCodigo();

    }

    private int gerarCodigo() {
        int codigo = 12134;
        comprovante.setCodigo(codigo);
        return codigo;
    }

}
