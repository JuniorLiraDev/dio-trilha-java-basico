package exercicios.exerccicos_loop;

import java.util.Scanner;

public class AcessoSenha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a senha: ");
    int senha = sc.nextInt();

    while (senha != 2002) {
      System.out.println("Senha Invalida");
      senha = sc.nextInt();
    }
    System.out.println("Acesso Permitido");

    sc.close();
  }
}
