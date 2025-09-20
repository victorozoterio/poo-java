public class Windows {
    public static void main(String[] args) {
        // metodo run não é estático por isso precisa instanciar
        Word01 w1 = new Word01();
        Word02 w2 = new Word02();

        // não executa por ordem de chamada, pode ser que o w2 execute primeiro
        w1.start();
        w2.start();
    }
}
