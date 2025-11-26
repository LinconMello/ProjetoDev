package treinandojava;

public class Bolsista extends Aluno {

    float descontoBolsa;

    public float getDescontoBolsa() {
        return descontoBolsa;
    }

    public void setDescontoBolsa(float descontoBolsa) {
        this.descontoBolsa = descontoBolsa;
    }

    @Override
    public void andar(){
        System.out.println("O bolsista esta andando");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("O bolsista não paga mensalidade!");
    }
}
