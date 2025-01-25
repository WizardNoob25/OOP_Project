public class Professor extends Pessoa {
    private String inicioContrato;
    private String departamentoVinculado;

    public Professor(String CPF, String nome, String dataNascimento, String inicioContrato, String departamentoVinculado) {
        super(CPF, nome, dataNascimento);
        this.inicioContrato = inicioContrato;
        this.departamentoVinculado = departamentoVinculado;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getDepartamentoVinculado() {
        return departamentoVinculado;
    }

    public void setDepartamentoVinculado(String departamentoVinculado) {
        this.departamentoVinculado = departamentoVinculado;
    }
}
