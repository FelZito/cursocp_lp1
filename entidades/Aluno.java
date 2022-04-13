package entidades;

public class Aluno {
    private String nome;
    private String matricula = "2022";
    private String area;
    private Curso curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean validaNome(String text) {
        //Caso tenha algum número no nome, retornará false. Caso retorne true, o nome será validado
        return text.matches("[^\\d]+");
    }

    @Override
    public String toString() {
        return "Aluno: " + nome +
                " || Aréa de interesse: " + area +
                " || Matrícula: " + matricula + ".";
    }
}
