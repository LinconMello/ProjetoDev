package treinandojava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Lincon", "Mello", 254789);
        Pessoa p2 = new Aluno("Carlos", "Rodrigues", 479514, 2010, "Analise de Sistemas");
        Pessoa p3 = new Bolsista("Vinicuis", "Freitas", 697235, 2085, "Administração", 30);
        Pessoa p4 = new Professor("Alberto", "Alves", 125789, 4635, 5389.2f);

        System.out.println("Pessoa{" + p1.toString() + "\n" + p2.toString() + "\n" + p3.toString() + "\n" + p4.toString());


    }
}
