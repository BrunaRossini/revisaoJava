public class Boletim {

    NotasAluno notas = new NotasAluno();

    //Passar por parametro o tipo da classe e assim pode usar os gets/sets e demais funções e metódios uma vez que tem um objeto instanciado
    public double calcularMedia(NotasAluno notas) {        
        double media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
        System.out.println("Sua média final: " + media);
        return media;
    }

    public String verificarSituacao(double media) {
        if (media <= 5) {

            return "Reprovado";
        } else {

            return "Aprovado";
        }
    }

}
