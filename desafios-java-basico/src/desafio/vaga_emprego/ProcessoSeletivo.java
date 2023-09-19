package desafio.vaga_emprego;

import java.util.Scanner;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double baseSalario = 2000;

    System.out.println("Seja Bem-Vindo ao processo seletivo!");
    System.out.println("Por favor, informe o salário pretendido: ");

    double salarioPretendido = sc.nextDouble();

    if (baseSalario > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (baseSalario == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
    sc.close();
  }
}
