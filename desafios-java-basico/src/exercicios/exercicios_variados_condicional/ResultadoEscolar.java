package exercicios.exercicios_variados_condicional;

public class ResultadoEscolar {

  public static void main(String[] args) {

    double notaAluno = 5.0;

    if (notaAluno >= 7.0) {
      System.out.println("Aprovado!");
    } else if (notaAluno >= 5.0 && notaAluno < 7.0) {
      System.out.println("Recuperacão");
    } else {
      System.out.println("Reprovado.");
    }
  }
}
