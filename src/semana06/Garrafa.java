public class Garrafa {

    public String material;
    private int volume;
    private char status;

    public void encher() {
        volume = 1000;
    }

    public void esvaziar() {
        volume = 0;
    }

    public String consumir(int v) {
        String resposta = "Consumo realizado com sucesso!";
        if (volume > v) {
            volume -= v;
        } else {
            resposta = "Não é possível realizar o consumo - a garrafa possui apenas " + volume;
        }
        return resposta;
    }

    public void abrir() {
        status = 'A';
    }

    public void fechar() {
        status = 'F';
    }

    public void mostrar() {
        System.out.println(material);
        System.out.println(volume);
        System.out.println(status == 'A' ? "Aberta" : status == 'F' ? "Fechada" : "Desconhecido");
    }
}
