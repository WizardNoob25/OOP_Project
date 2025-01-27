package entities;

public class Graduando extends Estudante {
    private Professor supervisor;

    public Graduando(String CPF, String nome, String dataNascimento, Double CRA, Professor supervisor) {
        super(CPF, nome, dataNascimento, CRA);
        this.supervisor = supervisor;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }
}
