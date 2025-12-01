package treinandojava;

public class Professor extends Pessoa {

    public Professor() {

    }

    public Professor(String nome, String sobrenome, long cpf, int matricula, float salario) {
        super(nome, sobrenome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    private int matricula;
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void receberAumento(float valor) {
        this.salario += valor;
    }

    @Override
    public void andar() {
        System.out.println("O professor esta andando");
    }

    @Override
    public String toString() {
        return "Professor{" +
                super.toString() +
                "matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
