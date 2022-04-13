package entidades;

public abstract class Faculdade {
    private String nome;
    private String cursos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public Faculdade(String nome, String cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }
}
