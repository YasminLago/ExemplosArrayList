package exemploarraylistdatosbasicos;
import java.util.ArrayList;
import java.util.Collections;
//Yasmin
public class Numeros {
        ArrayList <Integer> lista=new ArrayList();
    public void engadirElementos(){
            lista.add(1);
            lista.add(5);
            lista.add(4);
            lista.add(3);
        }
    public void amosarLista(){
        for(int i=0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }
    public void engadirUnElemento(int l){
        lista.add(l);
                
    }
    public void engadirEnPosicion(int l){
        lista.add(1, l);
        
    }
    public void borrarElemento(){
        lista.remove(3);
    }
    public void ordenar(){
        Collections.sort(lista);
    }
}
