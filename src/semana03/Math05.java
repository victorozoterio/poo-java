package semana03;

public class Math05 {
    public static void main(String[] args) {
        
       String senha = "";
       int quantidadeDeDigitos = 6;

       for (int i = 0; i < quantidadeDeDigitos; i++) {
        int numero = (int) (Math.random() * 10);
        senha+=numero;
       }

       System.out.println(senha);
    }
}
