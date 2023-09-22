package desafio.vaga_emprego;

import java.util.Scanner;

public class AnalisandoCandidatos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Seleção de candidatos");
    System.out.println("Informe o valor do salário pretendido: ");
    double salarioPretendido = sc.nextDouble();
    analisarCandidatos(salarioPretendido);

    sc.close();
  }

  static void analisarCandidatos(double salarioPretendido) {
    double baseSalarial = 2000.0;
    if (baseSalarial > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDADTO");
    } else if (baseSalarial == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}
