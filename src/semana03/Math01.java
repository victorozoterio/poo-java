package semana03;

public class Math01 {
    public static void main(String[] args) {
        String s = "ola";
        s.charAt(0); // acesso do método via objeto

        int valorAbsoluto = Math.abs(-5);
        System.out.println(valorAbsoluto);

        int a = 10, b = 20;
        int maior = Math.max(a, b); // acesso do método via classe
        int menor = Math.min(a, b);
        System.out.println(maior);
        System.out.println(menor);
    }
}
