package semana07;

public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.titular = "Sérgio";
        c.definirNumero(100);
        c.depositar(1000);
        System.out.println(c.titular); // vê o estado atual do objeto
        System.out.println(c.consultar()); // vê o estado atual do objeto
        System.out.println(c.pegarNumero()); // vê o estado atual do objeto
        System.out.println(c.sacar(600));

        System.out.println("-----------");
        System.out.println(c.toString());
        System.out.println("-----------");

        ContaBancaria c2 = new ContaBancaria();
        c2.depositar(1000);

        ContaBancaria.fazerPix(c, c2, 300);
        System.out.println("Conta 1: "+ c);
        System.out.println("Conta 2: "+ c2);
    }
}
