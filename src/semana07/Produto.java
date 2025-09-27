package semana07;

public class Produto {
    public static String empresa; // é comum entre todos os objetos
    private int codigo;
    private String nome;
    private double valor;
    private boolean novo;
    private char tipo;

    public Produto(int codigo, String nome, double valor, boolean novo, char tipo) {
        this.codigo = codigo;
        this.nome = nome;
        setValor(valor);
        this.novo = novo;
        this.tipo = tipo;
    }

    public Produto() {
    }

    public Produto(int codigo, String nome, boolean novo) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // Para cada atributo privado é necessário 2 métodos públicos, os getters e os setters

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "empresa='" + empresa + '\'' +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", novo=" + novo +
                ", tipo=" + tipo +
                '}';
    }
}
