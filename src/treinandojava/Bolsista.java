package treinandojava;

public class Bolsista extends Aluno {

    public Bolsista() {

    }

    public Bolsista(String nome, String sobrenome, long cpf, int matricula, String turma, float desconto) {
        super(nome, sobrenome, cpf, matricula, turma);
        this.descontoBolsa = desconto;
    }


    private float descontoBolsa;

    public float getDescontoBolsa() {
        return descontoBolsa;
    }

    public void setDescontoBolsa(float descontoBolsa) {
        this.descontoBolsa = descontoBolsa;
    }

    @Override
    public void andar() {
        System.out.println("O bolsista esta andando");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("O bolsista não paga mensalidade!");
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                super.toString() +
                "descontoBolsa=" + descontoBolsa +
                '}';
    }
}
