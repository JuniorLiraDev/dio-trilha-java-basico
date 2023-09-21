package exercicios.exerccicos_loop;

import java.util.Scanner;

/*
 * 🔸Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 */

public class Tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero entre 1 e 10: ");
    int mult = sc.nextInt();

    System.out.println("Tabuada: " + mult);
    for (int i = 1; i <= 10; i++) {
      int tabuada = mult * i;
      System.out.println(mult + " X " + i + " = " + tabuada);
    }

    System.out.println();

    sc.close();

  }
}
