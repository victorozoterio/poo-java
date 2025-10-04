package semana08;

public class Descascador {

    public static void run(Fruta f) {
        f.descascar();
    }

    public static void main(String[] args) {
        AbacaxiReal b = new AbacaxiReal();
        run(b);
    }
}
