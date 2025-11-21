package treinandojava;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Bolsista();

        Pessoa[] pessoa = {p1, p2, p3};

        for (Pessoa correr : pessoa) {
            correr.andar();
        }
    }
}
