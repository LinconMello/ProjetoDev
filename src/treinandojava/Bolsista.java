package treinandojava;

public class Bolsista extends Aluno {

    float descontoBolsa;

    public float getDescontoBolsa() {
        return descontoBolsa;
    }

    public void setDescontoBolsa(float descontoBolsa) {
        this.descontoBolsa = descontoBolsa;
    }

    public void andar(){
        System.out.println("O bolsista esta andando");
    }
}
