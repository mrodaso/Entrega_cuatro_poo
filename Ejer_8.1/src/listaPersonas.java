
import java.util.*;

public class listaPersonas {
    
    public static ArrayList<persona> personas;

     // Atributo que identifica un vector de personas

    public listaPersonas(){
        personas = new ArrayList();
        
    }
    
    public void añadirPersona(persona p) {
        personas.add(p);
    }
    
    public void eliminarPersona(int i) {
        personas.remove(i);

    }
    
    public void borrarLista() {
        personas.removeAll(personas);
    }

}
