import java.util.ArrayList;

public class Turma implements Avaliavel {
    private ArrayList<Estudante> estudantes = new ArrayList<>();
    private String semestre;
    private Integer ano;

    public Turma(String semestre, Integer ano) {
        this.semestre = semestre;
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double avaliar() {
        Double media = 0.0;
        for (Estudante estudante : estudantes) {
            media += estudante.getCRA();
        }
        media = media / estudantes.size();
        return media;
    }


}
