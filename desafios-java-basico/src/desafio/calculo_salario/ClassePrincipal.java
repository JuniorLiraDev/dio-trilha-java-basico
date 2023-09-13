package desafio.calculo_salario;

import java.util.Scanner;

public class ClassePrincipal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Desafio Calculo Salário
    System.out.println("Informe o salario base: ");
    double valorSalario = sc.nextDouble();
    System.out.println("Informe o valor do benefício: ");
    double valorBeneficio = sc.nextDouble();

    double valorImposto = 0;

    if (valorSalario >= 0 && valorSalario <= 1100) {
      valorImposto = 0.05 * valorSalario;
    } else if (valorSalario <= 2500) {
      valorImposto = 0.10 * valorSalario;
    } else {
      valorImposto = 0.15 * valorSalario;
    }

    double resultado = valorSalario + valorImposto + valorBeneficio;
    System.out.println(String.format("Total: " + "%.2f", resultado));

    // Outro desafio
    sc.close();
  }
}
