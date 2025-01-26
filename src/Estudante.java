public abstract class Estudante extends Pessoa{
    protected Double CRA;

    public Estudante(String CPF, String nome, String dataNascimento, Double CRA) {
        super(CPF, nome, dataNascimento);
        this.CRA = CRA;
    }

    public Double getCRA() {
        return CRA;
    }

    public void setCRA(Double CRA) {
        this.CRA = CRA;
    }
}
