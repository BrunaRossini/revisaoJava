package revisaoJava.ADOII_CompraOnline;

public class Pagamento {

    Compra compra = new Compra();

    // A função/ método que tiver a instancia é a que contera o final que seria
    // enviado pra Main pra executar.
    public double calcularTotal(Compra compra) {
        double total = compra.getTotal();
        int parcelas = compra.getParcelas();
        double juros = buscarTaxa(compra.getParcelas());
        double totalFinal = total * (Math.pow(1 + juros, parcelas));
        return totalFinal;

    }

    public double calcularParcelas(double totalFinal, int parcelas) {
        double calcularParcelas = (totalFinal / parcelas);
        return calcularParcelas;
    }

    private static double buscarTaxa(int parcelas) {
        double taxa = 0.0;
        if (parcelas == 0) {
            taxa = 0.0;

        } else if (parcelas > 1 && parcelas < 3) {
            taxa = 0.3;

        } else if (parcelas >= 3 && parcelas < 12) {
            taxa = 0.5;

        } else if (parcelas >= 12) {
            taxa = 0.10;

        }

        else {
            System.out.println("Valor Inválido");
        }

        return taxa;

    }

}
