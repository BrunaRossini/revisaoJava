import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double media;
		String resultado;
    //Passar por parametro o tipo da classe e assim pode usar os gets/sets e demais funções e metódios uma vez que tem um objeto instanciado
		NotasAluno notas = new NotasAluno();
		Boletim boletim = new Boletim();

		System.out.println("Informe nota1");
		notas.setNota1(ler.nextDouble());
		System.out.println("Informe nota2");
		notas.setNota2(ler.nextDouble());
		System.out.println("Informe nota3");
		notas.setNota3(ler.nextDouble());

		media = boletim.calcularMedia(notas);

		resultado = boletim.verificarSituacao(media);

		System.out.println("Sua situação: " + resultado);

		ler.close();

	}
}