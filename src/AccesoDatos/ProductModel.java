package AccesoDatos;

import java.util.ArrayList;

public class ProductModel extends AData {

    private String tipo;
    private String categoria;
    private String marca;
    private String nombre;
    private double precio;
    private int stock;

    public ProductModel() {

    }

    public ProductModel(String tipo, String categoria, String marca, String nombre, double precio, int stock) {
        super();
        this.tipo = tipo;
        this.categoria = categoria;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    public ProductModel(String id, String tipo, String categoria, String marca, String nombre, double precio, int stock) {
        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getId() {
        return id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return this.id + ";" + String.valueOf(this.tipo) + ";" + this.categoria + ";" + this.marca + ";" + this.nombre + ";" + this.precio + ";" + this.stock;
    }

    @Override
    public <E> ArrayList<E> fromDatabse() {

        ArrayList<String> lines = this.getLines();
        ArrayList<E> data = (ArrayList<E>) new ArrayList<ProductModel>();

        for (String line : lines) {
            String[] split = line.split(";");
            String id = split[0];
            String tipo = split[1];
            String categoria = split[2];
            String marca = split[3];
            String nombre = split[4];
            double precio = Double.parseDouble(split[5]);
            int stock = Integer.parseInt(split[6]);

            ProductModel p = new ProductModel(id, tipo, categoria, marca, nombre,precio,stock);
            data.add((E) p);
        }

        return data;

    }

    @Override
    public boolean fromId(String id) {
        ArrayList<ProductModel> products = this.fromDatabse();

        for (ProductModel p : products) {
            if (p.getId().equals(id)) {
                this.id = p.getId();
                this.tipo = p.getTipo();
                this.categoria = p.getCategoria();
                this.marca = p.getMarca();
                this.nombre = p.getNombre();
                this.precio = p.getPrecio();
                this.stock = p.getStock();
                return true;
            }

        }

        return false;
    }

}
