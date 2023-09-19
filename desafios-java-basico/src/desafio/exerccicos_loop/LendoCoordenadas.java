package desafio.exerccicos_loop;

import java.util.Scanner;

public class LendoCoordenadas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o numero de x:");
    int x = sc.nextInt();
    System.out.println("Informe o numero de y: ");
    int y = sc.nextInt();

    while (x != 0 && y != 0) {
      if (x > 0 && y > 0) {
        System.out.println("primeiro");
      } else if (x < 0 && y > 0) {
        System.out.println("segundo");
      } else {
        System.out.println("quarto");
      }

      System.out.println("Informe o numero de x:");
      x = sc.nextInt();
      System.out.println("Informe o numero de y: ");
      y = sc.nextInt();

    }

    sc.close();

  }
}
