package revisaoJava.ADOII_CompraOnline;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pagamento pagamentos = new Pagamento();
        Compra compra = new Compra();
        System.out.println("Informe o total da compra: ");
        compra.setTotal(ler.nextDouble());
        System.out.println("Informe a quantidade de Parcelas: ");
        compra.setParcelas(ler.nextInt());

        double resultado = pagamentos.calcularTotal(compra);

        System.out.println("Total da compra:" + compra.getTotal() + "\n"
                + "Quantidade de Parcelas: " + compra.getParcelas() + "\n" +
                "Valor a ser pago: " + resultado);

        ler.close();
    }

}
