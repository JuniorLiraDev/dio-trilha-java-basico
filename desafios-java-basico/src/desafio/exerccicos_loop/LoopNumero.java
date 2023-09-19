package desafio.exerccicos_loop;

import java.util.Scanner;

public class LoopNumero {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe um numero: ");
    int numero = teclado.nextInt();

    int soma = 0;
    while (numero != 0) {
      System.out.println("Informe outro numero: ");
      numero = teclado.nextInt();
      soma += numero;
    }

    System.out.println("Encerrando o programa...");
    System.out.println("Programa encerrado! A soma dos números digitados é: " + soma);

    teclado.close();

  }
}
