package semana03;

public class Math06 {
    public static void main(String[] args) {
        String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String senha = "";

        for (int i = 0; i < 10; i++) {
            int indiceSorteado = (int) (Math.random() * s.length());
            senha += s.charAt(indiceSorteado);
        }

        System.out.println(senha);
    }
}
