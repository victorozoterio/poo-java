package semana03;

public class String03 {
  public static void main(String[] args) throws InterruptedException {
    String aula = "Progamação Orientada a Objetos";
   
    int tamanho = aula.length();

    int controle = 0;
    while (controle < tamanho) {
      System.out.println(aula.charAt(controle));
      controle++;
      Thread.sleep(400);
    }

    System.out.println("--------------------------------");

    for (int i = aula.length() - 1; i >= 0; i--) {
      System.out.println(aula.charAt(i));
      Thread.sleep(400);
    }
    
  }
}