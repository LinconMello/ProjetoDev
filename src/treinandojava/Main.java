package treinandojava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Bolsista();

        Pessoa[] pessoa = {p1, p2, p3};


        for (Pessoa correr : pessoa) {
            correr.andar();
        }
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("\nNome digitado: " + nome);

    }
}
