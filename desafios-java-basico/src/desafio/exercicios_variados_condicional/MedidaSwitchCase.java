package desafio.exercicios_variados_condicional;

public class MedidaSwitchCase {

  public static void main(String[] args) {

    char medida = 'A';

    switch (medida) {
      case 'P': {
        System.out.println("PEQUENO ");
        break;
      }
      case 'M': {
        System.out.println("MEDIO ");
        break;
      }
      case 'G': {
        System.out.println("GRANDE");
        break;
      }
      default:
        System.out.println("INDEFINIDO ");

    }
  }

}
