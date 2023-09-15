package desafio.exercicios_variados_condicional;

public class PlanoTelefonicoSwitchCase {

  public static void main(String[] args) {

    String plano = "M";

    switch (plano) {
      case "T": {
        System.out.println("5Gb Youtube");
      }
      case "M": {
        System.out.println("Whats e Instagram grátis");
      }
      case "B": {
        System.out.println("100 minutos de ligacão");
      }
    }

    /*
     * O sistema terá 03 planos: BASIC, MIDIA , TURBO
     * BASIC: 100 minutos de ligação
     * MIDIA:
     * TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube
     */
  }
}
