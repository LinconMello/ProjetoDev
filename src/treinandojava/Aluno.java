package treinandojava;

public class Aluno extends Pessoa {
    private int matricula;
    private String turma;

    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, long cpf, int matricula, String turma) {
        super(nome, sobrenome, cpf);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void andar() {
        System.out.println("O aluno esta andando");
    }

    public void pagarMensalidade() {
        System.out.println("O aluno pagou a mensalidade!");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                super.toString() +
                "matricula=" + matricula +
                ", turma='" + turma + '\'' +
                '}';
    }
}
