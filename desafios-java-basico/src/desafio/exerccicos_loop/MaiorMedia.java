package desafio.exerccicos_loop;
/*🔸Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

import java.util.Scanner;

public class MaiorMedia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numero;
    int count = 0;
    int maiorNumero = 0;
    int soma = 0;

    do {
      System.out.println("Informe o numero: ");
      numero = teclado.nextInt();
      soma += numero;
      if (numero > maiorNumero) {
        maiorNumero = numero;
      }
      count++;
    } while (count < 5);

    double media = 0.0;
    media = soma / count;

    System.out.println("Maior numero informado: " + maiorNumero);
    System.out.println("Soma entre os numeros é: " + soma);
    System.out.println("Media: " + media);
    teclado.close();
  }
}
