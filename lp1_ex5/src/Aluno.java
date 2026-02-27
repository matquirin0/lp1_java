public class Aluno {
    private String nome;
    private NotasLP1 notas;

    public Aluno(String nome, NotasLP1 notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NotasLP1 getNotas() {
        return notas;
    }

    public void setNotas(NotasLP1 notas) {
        this.notas = notas;
    }
    public double getMediaFinal() {
        return this.notas.calcularMediaFinal();
    }
}

