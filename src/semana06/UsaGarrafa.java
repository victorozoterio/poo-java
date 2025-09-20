public class UsaGarrafa {
    public static void main(String[] args) {
        Garrafa garrafa = new Garrafa();

        garrafa.material = "vidro";
        garrafa.abrir();
        garrafa.encher();
        garrafa.mostrar();
        System.out.println("-----------------------");

        System.out.println(garrafa.consumir(5000));
        garrafa.fechar();
        garrafa.mostrar();
    }
}
