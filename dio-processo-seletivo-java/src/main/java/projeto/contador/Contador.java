package projeto.contador;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {

  public static void main(String[] args) {

    try (Scanner terminal = new Scanner(System.in)) {
      System.out.println("Digite o primeiro parâmetro:");
      int parametroUm = terminal.nextInt();

      System.out.println("Digite o segundo parâmetro:");
      int parametroDois = terminal.nextInt();

      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    if(parametroUm > parametroDois){
      throw new ParametrosInvalidosException();
    }
    int contagem = parametroDois - parametroUm;
    for(int i = 1; i <= contagem; i++) {
      System.out.println("imprimindo o número " + i);
    }
  }
}