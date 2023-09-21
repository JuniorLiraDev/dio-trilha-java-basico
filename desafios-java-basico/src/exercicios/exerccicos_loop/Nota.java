package exercicios.exerccicos_loop;

import java.util.Scanner;
//🔸Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

public class Nota {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero entre 0 e 10: ");
    int nota = sc.nextInt();

    while (nota < 0 || nota > 10) {
      System.out.println("Nota Iválida! Informe outra nota: ");
      nota = sc.nextInt();
      if (nota >= 0 || nota <= 10) {
        System.out.println("A nota infomada foi: " + nota);
      }

    }

  }
}
