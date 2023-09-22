package desafio.vaga_emprego;

public class ImprimindoListaSelecionados {
  public static void main(String[] args) {

    imprimirSelecionados();
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "Marcos", "Joana", "Joao", "Bia", "Yan" };
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato se nº " + (indice + 1) + " é " + candidatos[indice]);
    }
    System.out.println("");

    System.out.println("Forma abreviada de interação - for/each");

    for (String cadidato : candidatos) {
      System.out.println("O candidato selecionado foi " + cadidato);
    }
  }
}
