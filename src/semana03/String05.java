package semana03;

public class String05 {
  public static void main(String[] args) throws InterruptedException {
    String ra = "1050482423017";
    String unidade = ra.substring(0, 3);
    String curso = ra.substring(3, 6);
    String ano = "20" + ra.substring(6,8);
    String semestre = ra.substring(8, 9);
    semestre = semestre.equals("1") ? "primeiro semestre" : "segundo semestre";

    System.out.println("RA: " + ra);
    System.out.println("Unidade: " + unidade);
    System.out.println("Curso: " + curso);
    System.out.println("Ano: " + ano);
    System.out.println("Semestre: " + semestre);
  }
}