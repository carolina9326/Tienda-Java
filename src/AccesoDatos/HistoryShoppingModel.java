
package AccesoDatos;

import java.time.LocalDateTime;
import java.util.ArrayList;



public class HistoryShoppingModel extends AData {
    
    private String idUser;
    private String products;
    private LocalDateTime date;
    private double total;
    private ArrayList<String> productsParse;

    @Override
    public <E> ArrayList<E> fromDatabse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean fromId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
