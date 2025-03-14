package projeto.contador;

public class ParametrosInvalidosException extends Exception {

  public ParametrosInvalidosException(){
    super("O segundo parametro deve ser maior que o primeiro");
  }

  public ParametrosInvalidosException(String mensagem){
    super(mensagem);
  }

}



