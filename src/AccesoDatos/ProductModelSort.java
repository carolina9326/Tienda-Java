
package AccesoDatos;

import java.util.Comparator;


public class ProductModelSort implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel t, ProductModel t1) {
        return (int) (t.getPrecio() - t1.getPrecio());
    }

}
