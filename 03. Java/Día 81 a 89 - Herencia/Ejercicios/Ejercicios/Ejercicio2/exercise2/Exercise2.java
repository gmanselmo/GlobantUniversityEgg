package exercise2;

import Service.TVService;
import Service.WasherService;

/**
 *
 * @author Germán M. Anselmo
 */

public class Exercise2 {

    public static void main(String[] args) {

        WasherService ws = new WasherService();
        
        ws.createWasher();
        
        TVService ts = new TVService();
        
        ts.createTV();
        
    }
    
}
