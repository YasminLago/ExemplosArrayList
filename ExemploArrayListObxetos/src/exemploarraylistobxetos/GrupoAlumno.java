package exemploarraylistobxetos;
//Yasmin

import java.util.ArrayList;
import java.util.Collections;

public class GrupoAlumno {
    ArrayList<Alumno>lista=new ArrayList<Alumno>();
    
    public void crearLista(){
        Alumno alum1=new Alumno("aa",5);    
        Alumno alum2=new Alumno("bb",2);
        Alumno alum3=new Alumno("cc",3);
        Alumno alum4=new Alumno("bb",2);
        lista.add(alum1);
        lista.add(alum2);
        lista.add(alum3);
        lista.add(alum4);
        alum1=alum3;
        lista.add(alum1);
    }
    public void verLista(){
        System.out.println(lista);
             
    }
    public void verIgual(){
        if(lista.get(1).equals(lista.get(3)))
            System.out.println("Son iguais");
        else
            System.out.println("Son distintos");
        
        System.out.println("Alumno1: "+lista.get(1).hashCode()+" Alumno2: "+lista.get(3).hashCode());
        System.out.println("Alumno5: "+lista.get(4).hashCode()+" Alumno1: "+lista.get(2).hashCode());
    }
    public void engadirAlumno(Alumno al){
        lista.add(al);
    }
    public void borrarAlumno(){
        lista.remove(2);
    }
    public void ordenar(){
        Collections.sort(lista);
    }
}
