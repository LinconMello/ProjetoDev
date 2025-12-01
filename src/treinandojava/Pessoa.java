package treinandojava;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private long cpf;

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, long cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void andar() {
        System.out.println("A pessoa esta andando");
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
