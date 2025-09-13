package semana05;

public class UsaCalculadora {
  public static void main(String[] args) {
    Calculadora c = new Calculadora();
    c.somar(10, 20);
    
    Calculadora.multiplicar(10, 20);

    c.somar(10, 20, 30);
    c.somar(10, 20, "oi");
  }
}