package exercicios.exerccicos_loop;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    int fatorial = sc.nextInt();
    int mult = 1;
    for (int i = fatorial; i >= 1; i--) {
      mult *= i;
    }
    System.out.println("Fatorial de " + fatorial + " é " + mult);
    sc.close();
  }
}
