package desafio.exercicios_variados_condicional;

public class CondicaoTernaria {

  public static void main(String[] args) {
    int nota = 7;

    String resuldado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <= 7 ? "Recuperacão" : "Reprovado";
    // IF ELSE IF ELSE
    System.out.println(resuldado);

    String cor = "Amarelo";
    String resultado2 = cor == "Amarelo" ? "Verdadeiro" : "Falso";

    System.out.println(resultado2);

  }
}
