package semana08;

public class UsaAnimal {

    public static void main(String[] args) {
        Animal a = new Gato();
        a.comer();
        a.beber();

        Gato gato = new Gato();
        gato.comer();
        gato.beber();

        Galinha galinha = new Galinha();
        galinha.comer();
        galinha.beber();
    }
}
