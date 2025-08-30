package semana04;

public class excecao04 {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // ação em caso de urgência
            }
        }
    }
}
