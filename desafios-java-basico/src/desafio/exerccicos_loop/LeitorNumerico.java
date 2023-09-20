package desafio.exerccicos_loop;

import java.util.Scanner;

public class LeitorNumerico {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // CONTAGEM PROGRESSIVA
    System.out.println("Quantas vezes gostaria de incrementar? ");
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.println("Valor de i: " + i);
    }

    // CONTAGEM REGRESSIVA
    System.out.println("Quantas vezes gostaria de decrementar? ");
    N = sc.nextInt();

    for (int i = N; i >= 1; i--) {
      System.out.println("Valor de i: " + i);
    }
    sc.close();
  }
}
