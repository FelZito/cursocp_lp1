package entidades;

public class Disciplinas {
    private String nome;
    private String dia, horario;
    private String codigo;
    private int ch; //carga horária
    private String prerequesitos = "";
    private String turno;
    private String tipo;
    private float nota = 0;

    public Disciplinas(String nome, String dia, String horario, String codigo, int ch, String prerequesitos, String turno, String tipo) {
        this.nome = nome;
        this.dia = dia;
        this.horario = horario;
        this.codigo = codigo;
        this.ch = ch;
        this.prerequesitos = prerequesitos;
        this.turno = turno;
        this.tipo = tipo;
    }

    public Disciplinas(String nome, String dia, String horario, String codigo, int ch, String turno, String tipo) {
        this.nome = nome;
        this.dia = dia;
        this.horario = horario;
        this.codigo = codigo;
        this.ch = ch;
        this.turno = turno;
        this.tipo = tipo;
    }

    public Disciplinas() {
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getPrerequesitos() {
        return prerequesitos;
    }

    public void setPrerequesitos(String prerequesitos) {
        this.prerequesitos = prerequesitos;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome;
    }
}
