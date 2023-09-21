package exercicios.exerccicos_loop;

import java.util.Scanner;

public class NomeIdade {

  /*
   * Faça um programa que leia conjuntos de dois valores, o primeiro representando
   * o nome do aluno e o segundo representando a sua idade. (Pare o programa
   * inserindo o valor 0 no campo nome)
   */
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String nome = "";
    int idade;

    while (true) {
      System.out.println("Informe o nome: ");
      nome = teclado.nextLine();

      if (nome.equals("0"))
        break;

      System.out.println("Informe a idade: ");
      idade = teclado.nextInt();

      teclado.nextLine();
    }

    System.out.println("Fim do programa ");

    teclado.close();
  }
}
