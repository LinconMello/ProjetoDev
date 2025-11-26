package treinandojava;

public class Professor extends Pessoa {

    private String matricula;
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void receberAumento(float valor) {
        this.salario += valor;
    }
    @Override
    public void andar(){
        System.out.println("O professor esta andando");
    }
}
