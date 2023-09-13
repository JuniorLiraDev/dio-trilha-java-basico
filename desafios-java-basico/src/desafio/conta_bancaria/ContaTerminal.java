package desafio.conta_bancaria;

import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    Scanner terminal = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência: ");
    String numeroAgencia = terminal.nextLine();
    System.out.println("Por favor, digite o número da Conta: ");
    String numeroConta = terminal.nextLine();
    System.out.println("Por favor, digite o Nome do Cliente: ");
    String nomeCliente = terminal.nextLine();
    System.out.println("Gostaria de realizar um Depósito Inicial? s/n ");
    char depositoInicial = terminal.nextLine().charAt(0);

    double saldo = 0;
    if (depositoInicial == 's') {
      System.out.println("Informe o valor do Depósito: ");
      saldo = terminal.nextDouble();
    } else {
      System.out.println("Estamos realizando a abertura da sua conta...");
    }
    System.out.println(" ");

    // Testando formatacao
    System.out.println(nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + numeroAgencia
        + " conta " + numeroConta + " e seu saldo no valor de " + saldo + " já está disponível para saque");

    System.out.println(String.format(
        "%s , obrigado por criar uma conta em nosso banco, sua agência é %s conta %s e seu saldo no valor de %.2f já está disponível para saque. ",
        nomeCliente, numeroAgencia, numeroConta, saldo));

    terminal.close();
  }
}
