package horarios;

public class Aula {
    final String prof, nome, turma, dia;
    final int data_ini, data_fim, id;

    public Aula(int d1, int d2, String prof, String nome, String turma, String dia, int id){
        this.prof = prof;
        this.data_ini = d1;
        this.data_fim = d2;
        this.nome = nome;
        this.dia = dia;
        this.turma = turma;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.turma;
    }
}
