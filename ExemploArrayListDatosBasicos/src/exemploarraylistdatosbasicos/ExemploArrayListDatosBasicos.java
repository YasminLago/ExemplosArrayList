package exemploarraylistdatosbasicos;
//Yasmin
public class ExemploArrayListDatosBasicos {
    public static void main(String[] args) {
       Numeros n=new Numeros();
       n.engadirElementos();
       //engadir un elemento
       n.engadirUnElemento(8);
       n.engadirEnPosicion(3);
       n.borrarElemento();
       n.ordenar();
       n.amosarLista();
    }
    
}
