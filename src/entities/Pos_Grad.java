package entities;

public class Pos_Grad extends Estudante {
    private String temaPesquisa;

    public Pos_Grad(String CPF, String nome, String dataNascimento, Double CRA, String temaPesquisa) {
        super(CPF, nome, dataNascimento, CRA);
        this.temaPesquisa = temaPesquisa;
    }

    public String getTemaPesquisa() {
        return temaPesquisa;
    }

    public void setTemaPesquisa(String temaPesquisa) {
        this.temaPesquisa = temaPesquisa;
    }
}
