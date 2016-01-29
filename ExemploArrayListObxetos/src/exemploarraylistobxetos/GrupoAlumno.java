package exemploarraylistobxetos;
//Yasmin

import java.util.ArrayList;

public class GrupoAlumno {
    ArrayList<Alumno>lista=new ArrayList<Alumno>();
    
    public void crearLista(){
        Alumno alum1=new Alumno("aa",5);
        lista.add(alum1);
        lista.add(new Alumno("bb",2));
        lista.add(alum1);
        Alumno alum3=new Alumno("cc",3);
        alum1=alum3;
        lista.add(alum1);
    }
    public void engadirAlumno(Alumno al){
        lista.add(al);
    }
}
