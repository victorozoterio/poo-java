public class UsaMotor {
    public static void main(String[] args) {
        Motor m = new Motor();
        m.ligar();

        for (int i = 1; i <= 200; i++) {
            m.acelerar();
        }
        m.mostrar();
        System.out.println("-----------------------");

        for (int i = 1; i <= 200; i++) {
            m.frear();
        }
        m.mostrar();
    }
}
