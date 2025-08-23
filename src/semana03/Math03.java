package semana03;

public class Math03 {
    public static void main(String[] args) {
        
        for (int cartao = 1; cartao <= 10; cartao++) {
            System.out.println("Cartão " + cartao + ": ");
            for (int i = 1; i <= 6; i++) {
                System.out.println((int) ( Math.random() * 60 + 1) + " ");
            }
            System.out.println();
        }
    }
}
