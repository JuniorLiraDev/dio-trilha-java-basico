package desafio.exerccicos_loop;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner teclado = new Scanner(System.in);

    char resposta;
    do {
      System.out.println("Temperatura em Celsius: ");
      double C = teclado.nextDouble();
      double F = C * 9.0 / 5 + 32.0;

      System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
      System.out.print("Deseja repetir? s/n ");
      resposta = teclado.next().charAt(0);

    } while (resposta != 'n');

    teclado.close();
  }
}
