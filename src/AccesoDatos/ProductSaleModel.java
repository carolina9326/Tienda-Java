/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ProductSaleModel extends AData {

    private ArrayList<ProductModel> products;
    private int saleNumber;
    private String idUser;
    private String total;
    private String date;

    public void setProducts(ArrayList<ProductModel> products) {
        this.products = products;
    }
    
    public ArrayList<ProductModel> getProducts(){
        return this.products;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public void setTotal(double total) {
        this.total = String.valueOf(total);
    }
    
    public String getDate(){
        this.date = this.date.replace("T", " - ");
        return this.date;
    }
    
    public String getTotal(){
        return this.total;
    }

    public ProductSaleModel(String idUser) {
        super();
        this.products = new ArrayList<ProductModel>();
        this.idUser = idUser;
    }

    public ArrayList<ProductSaleModel> getHistoryUser() {

        ArrayList<ProductSaleModel> data = new ArrayList<ProductSaleModel>();
        int count = 1;
        while (true) {
            this.generatePath();
            this.PATH = this.PATH + "." + this.idUser + "." + String.valueOf(count);

            ArrayList<String> lines = this.getLines();

            if (lines.size() == 0) {
                break;
            }

            ProductSaleModel sale = new ProductSaleModel(this.idUser);

            data.add(sale);

            for (String line : lines) {
                String[] split = line.split(";");
                String id = split[0];
                String tipo = split[1];
                String categoria = split[2];
                String marca = split[3];
                String nombre = split[4];
                double precio = Double.parseDouble(split[5]);
                int stock = Integer.parseInt(split[6]);
                sale.total = split[7];
                sale.date = split[8];

                ProductModel p = new ProductModel(id, tipo, categoria, marca, nombre, precio, stock);
                sale.products.add(p);
            }

            count++;
        }

        return data;
    }

    @Override
    public <E> ArrayList<E> fromDatabse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean fromId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        this.generatePath();
        this.PATH = this.PATH + "." + this.idUser + "." + String.valueOf(this.saleNumber);
        StringBuilder sb = new StringBuilder();

        LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        for (ProductModel p : this.products) {
            String save = p.toString() + ";" + this.total + ";" + now.toString();
            sb.append(save);
            sb.append("\n");
        }

        return sb.toString();
    }

}
