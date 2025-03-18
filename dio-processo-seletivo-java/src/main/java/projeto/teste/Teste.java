package projeto.teste;
import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String operacao;
    int qtdTransacoes;

    System.out.println("Digite o saldo inicial: ");
    double saldoInicial = scanner.nextDouble();
    scanner.nextLine();

    for (qtdTransacoes = 0; qtdTransacoes < 3; qtdTransacoes++) {
      System.out.println("Qual operação você deseja realizar: \n"
          + "1 - sacar\n"
          + "2 - Depositar");
      operacao = scanner.nextLine();
      switch (operacao) {
        case "1":
          System.out.println("Digite o valor que deseja sacar");
          double valorSaque = scanner.nextDouble();
          scanner.nextLine();
          saldoInicial = saldoInicial - valorSaque;
        break;
        case "2":
          System.out.println("Digite o valor que deseja depositar");
          double valorDeposito = scanner.nextDouble();
          scanner.nextLine();
          saldoInicial = saldoInicial + valorDeposito;
          break;
        default:
          System.out.println("campo preenchido incorretamente");
      }
    }

    // Entrada do saldo inicial

    // TODO: Na linha abaixo, implemente a entrada das três transações:

    // TODO: Na linha abaixo, realize o cálculo do saldo final:
    // Saldo final
    System.out.printf("%.2f\n", saldoInicial);

    scanner.close();
  }
}