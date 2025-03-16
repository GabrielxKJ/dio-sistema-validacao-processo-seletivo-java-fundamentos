package projeto.candidato;

public class ProcessoSeletivo {
  public static void main(String[] args) {

    imprimirSelecionados();

    System.out.println("Processo seletivo");
    analisarCandidato(1900.0);
    analisarCandidato(2200.0);
    analisarCandidato(2000.0);

  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Marcos"};
    System.out.println("Imrpimindo a lista de candidatos informando o indice do elemento");
    for(int indice =0; indice < candidatos.length; indice++){
      System.out.println("O candidato de n°" + (indice+1) + "é o" + candidatos[indice]);


    }
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if(salarioBase==salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATO");
    }
  }

}
