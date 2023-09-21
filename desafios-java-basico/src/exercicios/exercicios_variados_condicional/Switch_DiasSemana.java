package exercicios.exercicios_variados_condicional;

public class Switch_DiasSemana {
  public static void main(String[] args) {

    int numero = 3;

    switch (numero) {
      case 1: {
        System.out.println("Domingo");
        break;
      }
      case 2: {
        System.out.println("Segunda");
        break;
      }
      case 3: {
        System.out.println("Terca");
        break;
      }
      case 4: {
        System.out.println("Quarta");
        break;
      }
      case 5: {
        System.out.println("Quinta");
        break;
      }
      case 6: {
        System.out.println("Sexta");
        break;
      }
      case 7: {
        System.out.println("Sábado");
        break;
      }
    }

    switch (numero) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6: {
        System.out.println("Dia de Semana");
        break;
      }
      case 1:
      case 7: {
        System.out.println("Fim de Semana");
      }
    }
  }
}
