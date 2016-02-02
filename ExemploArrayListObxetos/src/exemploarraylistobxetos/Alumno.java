package exemploarraylistobxetos;
//Yasmin

import java.util.Objects;

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
        return "Alumno{" + "nome=" + nome + ", nota=" + nota +"\n"+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.nota;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return true;
    }

}
