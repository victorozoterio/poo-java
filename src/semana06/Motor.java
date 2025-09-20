public class Motor {
    private final int VELOCIDADE_MAXIMA = 100;
    private final int VELOCIDADE_MINIMA = 0;
    private boolean status;
    private int velocidade;

    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void acelerar() {
        if (status && velocidade < VELOCIDADE_MAXIMA) {
            velocidade++;
        }
    }

    public void frear() {
        if (velocidade > VELOCIDADE_MINIMA) {
            velocidade--;
        }
    }

    public void mostrar() {
        System.out.println(status == true ? "Ligado" : "Desligado");
        System.out.println(velocidade);
    }
}
