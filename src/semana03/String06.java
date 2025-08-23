package semana03;

public class String06 {
  public static void main(String[] args) throws InterruptedException {
    String s = "Aula de Progamação Orientada a Objetos";
    String n = "1,2,3,4,5,6,7,8,9,0";

    String[] palavras = s.split(" ");
    String[] numeros = n.split(",");

    for (String palavra : palavras) {
      System.out.println(palavra);
    }

    System.out.println("--------------------------------");

    for (String numero : numeros) {
      System.out.println(numero);
    }
  }
}