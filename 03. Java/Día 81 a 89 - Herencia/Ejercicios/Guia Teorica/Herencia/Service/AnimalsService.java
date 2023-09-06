package Service;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */

public class AnimalsService {
    
    ArrayList<Animal> animales = new ArrayList();
    
    public void cargarAnimales(){
        
        animales.add(new Animal());
        
        animales.add(new Perro());

        animales.add(new Gato());
            
    }
    
    public void hacerRuido() {
        
        for (Animal animal : animales) {
            
            System.out.println(animal.hacerRuido());
            
        }
        
    }
    
}
