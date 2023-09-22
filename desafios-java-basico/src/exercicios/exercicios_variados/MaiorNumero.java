package exercicios.exercicios_variados;

import java.util.Scanner;

public class MaiorNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    int higher = max(number1, number2, number3);
    showResult(higher);

    sc.close();
  }

  public static int max(int number1, int number2, int number3) {
    int aux;
    if (number1 > number2 && number1 > number3) {
      aux = number1;
    } else if (number2 > number3) {
      aux = number2;
    } else {
      aux = number3;
    }
    return aux;
  }

  public static void showResult(int higher) {
    System.out.println("Higher = " + higher);
  }
}
