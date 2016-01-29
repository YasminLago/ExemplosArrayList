package exemploarraylistobxetos;
//Yasmin
public class Alumno {
    private String nome;
    private int nota;
   
    public Alumno() {
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + '}';
    }


    
}
