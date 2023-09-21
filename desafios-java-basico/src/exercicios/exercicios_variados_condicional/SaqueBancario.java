package exercicios.exercicios_variados_condicional;

import java.util.Scanner;

public class SaqueBancario {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double saldo = 25.0;

    System.out.println("Informe o valor que deseja sacar: ");
    double valorSolicitado = sc.nextDouble();

    if (valorSolicitado < saldo) {
      saldo -= valorSolicitado;
      // saldo = saldo - valorSolicitado;
      System.out.println("Saldo atualizado: " + saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }

    sc.close();
  }
}
