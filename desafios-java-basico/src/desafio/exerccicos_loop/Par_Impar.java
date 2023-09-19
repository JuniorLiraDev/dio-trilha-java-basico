package desafio.exerccicos_loop;

import java.util.Scanner;

/*🔸Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.*/
public class Par_Impar {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numeroInteiro = 0;
    int count = 0;
    int qtNumerosPares = 0;
    int qtNumerosImpares = 0;

    System.out.println("Qunatos numeros gostaria de informar: ");
    int qtVezes = teclado.nextInt();

    do {
      System.out.println("Informe o numero: ");
      numeroInteiro = teclado.nextInt();
      if (numeroInteiro % 2 == 0) {
        qtNumerosPares++;
      } else {
        qtNumerosImpares++;
      }
      count++;
    } while (count < qtVezes);

    System.out.println("Quantidade de numero PARES: " + qtNumerosPares);
    System.out.println("Quantidade de numeros IMPARES: " + qtNumerosImpares);

    teclado.close();

  }
}
