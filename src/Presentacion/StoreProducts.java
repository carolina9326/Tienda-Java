/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ProductModel;
import AccesoDatos.ProductModelSort;
import AccesoDatos.ProductSaleModel;
import AccesoDatos.UserModel;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carolina
 */
public class StoreProducts extends javax.swing.JFrame {

    private ArrayList<ProductModel> products;
    private int selectedTableProducts;
    private int selectedTableCart;
    private ArrayList<ProductModel> productsInCart;
    private UserModel user;
    private double totalSale;

    public StoreProducts(UserModel user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.selectedTableProducts = -1;
        this.selectedTableCart = -1;
        this.products = new ArrayList<ProductModel>();
        this.productsInCart = new ArrayList<ProductModel>();
        this.populateTableProducts();
        this.setVisible(true);

        this.setTitle("Tienda de productos - " + user.getName());

        this.user = user;
        this.totalSale = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitleProducts = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        labelAmount = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        spinAmount = new javax.swing.JSpinner();
        labelAmountTotal = new javax.swing.JLabel();
        labelCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRemoveItemCart = new javax.swing.JButton();
        labelSubTotalCart = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCostShipping = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTax = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTotalCart = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitleProducts.setText("Productos");

        tableProducts.setBackground(new java.awt.Color(255, 204, 204));
        tableProducts.setBorder(new javax.swing.border.MatteBorder(null));
        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Categoria", "Marca", "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        labelAmount.setText("Cantidad");

        labelTotal.setText("Total $");

        spinAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinAmountStateChanged(evt);
            }
        });

        labelAmountTotal.setText("0");

        labelCart.setText("Carrito");

        tableCart.setBackground(new java.awt.Color(204, 255, 204));
        tableCart.setBorder(new javax.swing.border.MatteBorder(null));
        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCart);

        btnAdd.setBackground(new java.awt.Color(64, 150, 238));
        btnAdd.setText("Agregar");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        jLabel1.setText("SubTotal $");

        btnRemoveItemCart.setBackground(new java.awt.Color(64, 150, 238));
        btnRemoveItemCart.setText("Quitar");
        btnRemoveItemCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveItemCartMouseClicked(evt);
            }
        });

        labelSubTotalCart.setText("0");

        jLabel2.setText("Envio $");

        labelCostShipping.setText("0");

        jLabel3.setText("Impuesto $");

        labelTax.setText("0");

        jLabel4.setText("Total $");

        labelTotalCart.setText("0");

        btnPay.setBackground(new java.awt.Color(64, 150, 238));
        btnPay.setText("Pagar");
        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitleProducts)
                    .addComponent(labelCart)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnRemoveItemCart)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spinAmount))
                                    .addComponent(jLabel1)
                                    .addComponent(labelSubTotalCart))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTotal)
                                    .addComponent(labelAmountTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(labelCostShipping))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTax)
                                            .addComponent(jLabel3)))))
                            .addComponent(jLabel4)
                            .addComponent(labelTotalCart)
                            .addComponent(btnPay))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAmount)
                            .addComponent(labelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAmountTotal))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(labelCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubTotalCart)
                            .addComponent(labelCostShipping)
                            .addComponent(labelTax))
                        .addGap(21, 21, 21)
                        .addComponent(btnRemoveItemCart)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotalCart)
                        .addGap(42, 42, 42)
                        .addComponent(btnPay)))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked

        this.selectedTableProducts = this.tableProducts.getSelectedRow();

        this.spinAmount.setValue(1);

        this.calculateSubtotalUI();

    }//GEN-LAST:event_tableProductsMouseClicked

    private void spinAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinAmountStateChanged

        if (this.selectedTableProducts == -1) {
            return;
        }

        this.calculateSubtotalUI();

    }//GEN-LAST:event_spinAmountStateChanged

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (this.selectedTableProducts == -1) {
            return;
        }

        ProductModel p = this.products.get(this.selectedTableProducts);

        int amount = Integer.parseInt(String.valueOf(this.spinAmount.getValue()));

        double subTotal = (amount * p.getPrecio());

        ProductModel isProduct = this.findProductInCart(p.getId());

        if (isProduct != null) {
            int stock = isProduct.getStock() + amount;
            int originalStock = p.getStock();
            originalStock -= amount;
            if (originalStock < 0) {
                return;
            }
            p.setStock(originalStock);
            isProduct.setStock(stock);
        } else {
            ProductModel pToAdd = new ProductModel(p.getId(), p.getTipo(), p.getCategoria(), p.getMarca(), p.getNombre(), p.getPrecio(), amount);
            int stock = p.getStock() - amount;
            if (stock < 0) {
                return;
            }
            p.setStock(stock);
            this.productsInCart.add(pToAdd);

        }

        this.productsInCart.sort(new ProductModelSort());

        this.populateTableCart();
        this.populateTableProducts();

        this.selectedTableProducts = -1;

    }//GEN-LAST:event_btnAddMouseClicked

    private void btnRemoveItemCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveItemCartMouseClicked
        if (this.selectedTableCart == -1) {
            return;
        }

        ProductModel p = this.productsInCart.get(this.selectedTableCart);

        ProductModel pStock = this.findProducts(p.getId());

        if (pStock != null) {
            int stock = pStock.getStock();
            stock++;
            pStock.setStock(stock);
        }

        int stock = p.getStock();
        stock--;
        if (stock <= 0) {
            this.productsInCart.remove(this.selectedTableCart);
            this.selectedTableCart = -1;
        } else {
            p.setStock(stock);
        }

        this.populateTableCart();
        this.populateTableProducts();
    }//GEN-LAST:event_btnRemoveItemCartMouseClicked

    private void tableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCartMouseClicked
        this.selectedTableCart = this.tableCart.getSelectedRow();
    }//GEN-LAST:event_tableCartMouseClicked

    private void btnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseClicked

        if (this.productsInCart.size() == 0) {
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Esta seguro que desea pagar?", "Factura", JOptionPane.OK_OPTION);

        if (opt == 1) {
            return;
        }

        ProductSaleModel p = new ProductSaleModel(this.user.getId());
        ArrayList<ProductSaleModel> sales = p.getHistoryUser();

        int salesCount = sales.size();
        salesCount++;
        p.setSaleNumber(salesCount);
        p.setProducts(this.productsInCart);
        p.setTotal(this.totalSale);

        p.save();

        for (ProductModel pStock : this.products) {
            pStock.save();
        }

        Invoice invoice = new Invoice(this.productsInCart, this.user);

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));


    }//GEN-LAST:event_btnPayMouseClicked

    private ProductModel findProductInCart(String id) {
        for (ProductModel pt : this.productsInCart) {
            if (id.equals(pt.getId())) {
                return pt;
            }
        }

        return null;
    }

    private ProductModel findProducts(String id) {
        for (ProductModel pt : this.products) {
            if (id.equals(pt.getId())) {
                return pt;
            }
        }

        return null;
    }

    private void populateTableProducts() {
        ProductModel p = new ProductModel();
        if (this.products.isEmpty()) {
            this.products = p.fromDatabse();
        }

        String columns[] = {"Tipo", "Categoria", "Marca", "Nombre", "Precio", "Stock"};
        String data[][] = new String[this.products.size()][columns.length];

        for (int i = 0; i < this.products.size(); i++) {
            data[i][0] = this.products.get(i).getTipo();
            data[i][1] = this.products.get(i).getCategoria();
            data[i][2] = this.products.get(i).getMarca();
            data[i][3] = this.products.get(i).getNombre();
            data[i][4] = String.valueOf(this.products.get(i).getPrecio());
            data[i][5] = String.valueOf(this.products.get(i).getStock());
        }

        DefaultTableModel dataModel = new DefaultTableModel(data, columns);
        this.tableProducts.setModel(dataModel);
        this.tableProducts.setDefaultEditor(Object.class, null);
    }

    private void populateTableCart() {
        String columns[] = {"Nombre", "Precio", "Cantidad", "Total"};
        String data[][] = new String[this.productsInCart.size()][columns.length];

        double subTotal = 0;

        for (int i = 0; i < this.productsInCart.size(); i++) {
            data[i][0] = this.productsInCart.get(i).getNombre();
            data[i][1] = String.valueOf(this.productsInCart.get(i).getPrecio());
            data[i][2] = String.valueOf(this.productsInCart.get(i).getStock());
            double total = this.productsInCart.get(i).getPrecio() * this.productsInCart.get(i).getStock();
            data[i][3] = String.valueOf(total);

            subTotal += total;
        }

        double costShipping = 0;
        double tax = 0;

        costShipping = subTotal * 0.3;
        tax = subTotal * 0.2;
        this.totalSale = subTotal + costShipping + tax;

        this.labelSubTotalCart.setText(String.valueOf(subTotal));
        this.labelCostShipping.setText(String.valueOf(costShipping));
        this.labelTax.setText(String.valueOf(tax));
        this.labelTotalCart.setText(String.valueOf(this.totalSale));

        //this.productsInCart;
        DefaultTableModel dataModel = new DefaultTableModel(data, columns);
        this.tableCart.setModel(dataModel);
        this.tableCart.setDefaultEditor(Object.class, null);
    }

    private void calculateSubtotalUI() {

        ProductModel p = this.products.get(this.selectedTableProducts);

        int amount = Integer.parseInt(String.valueOf(this.spinAmount.getValue()));

        double subTotal = (amount * p.getPrecio());
        String amountTotal = String.valueOf(subTotal);
        this.labelAmountTotal.setText(amountTotal);
    }

    private int compareElementCart(ProductModel p1, ProductModel p2) {
        return (int) (p2.getPrecio() - p1.getPrecio());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnRemoveItemCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelAmountTotal;
    private javax.swing.JLabel labelCart;
    private javax.swing.JLabel labelCostShipping;
    private javax.swing.JLabel labelSubTotalCart;
    private javax.swing.JLabel labelTax;
    private javax.swing.JLabel labelTitleProducts;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalCart;
    private javax.swing.JSpinner spinAmount;
    private javax.swing.JTable tableCart;
    private javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables
}
