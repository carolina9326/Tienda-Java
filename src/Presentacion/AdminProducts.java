package Presentacion;

import AccesoDatos.ProductModel;
import AccesoDatos.UserModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AdminProducts extends javax.swing.JFrame {

    private int selectedTable;
    private ArrayList<ProductModel> products;

    public AdminProducts(UserModel user, Principal w) {
        initComponents();
        this.labelMessages.setVisible(false);
        this.setLocationRelativeTo(null);
        populateTable();
        this.selectedTable = -1;
        this.setVisible(true);
        this.setTitle("Administracion de Productos - " + user.getName());

        addWindowListener(new WindowAdapter() {
            //for closing
            @Override
            public void windowClosing(WindowEvent e) {
                w.setEnabled(true);
            }
            //for closed

            @Override
            public void windowClosed(WindowEvent e) {
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combotipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labeltipo = new javax.swing.JLabel();
        labelcategoria = new javax.swing.JLabel();
        labelMessages = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        labelmarca = new javax.swing.JLabel();
        combocategoria = new javax.swing.JComboBox<>();
        labelprecio = new javax.swing.JLabel();
        tfprecio = new javax.swing.JTextField();
        labelstock = new javax.swing.JLabel();
        tfstock = new javax.swing.JTextField();
        combomarca = new javax.swing.JComboBox<>();
        tfname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        combotipo.setBackground(new java.awt.Color(204, 255, 255));
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hogar", "Farmacia", "Tecnologia" }));

        table.setBackground(new java.awt.Color(255, 204, 255));
        table.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        labeltipo.setText("Tipo");

        labelcategoria.setText("Categoria");

        labelMessages.setForeground(new java.awt.Color(255, 0, 51));
        labelMessages.setText("No deje campos vacios");

        labelnombre.setText("Nombre");

        btnAdd.setBackground(new java.awt.Color(64, 150, 238));
        btnAdd.setText("Agregar");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(64, 150, 238));
        btnUpdate.setText("Actualizar");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(64, 150, 238));
        btnDelete.setText("Eliminar");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        labelmarca.setText("Marca");

        combocategoria.setBackground(new java.awt.Color(204, 255, 255));
        combocategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salud", "Tegnologia", "Deportes", "Oficina" }));

        labelprecio.setText("Precio");

        tfprecio.setBackground(new java.awt.Color(204, 255, 255));

        labelstock.setText("Stock");

        tfstock.setBackground(new java.awt.Color(204, 255, 255));
        tfstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstockActionPerformed(evt);
            }
        });

        combomarca.setBackground(new java.awt.Color(204, 255, 255));
        combomarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bayer", "Wilson", "Apple", "Mabe", "Arroz", "Frijoles", "Suero" }));

        tfname.setBackground(new java.awt.Color(204, 255, 255));
        tfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUser)
                                    .addComponent(labeltipo)
                                    .addComponent(labelnombre)
                                    .addComponent(labelprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelstock, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfprecio)
                                    .addComponent(tfstock))
                                .addGap(125, 125, 125))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(labelcategoria))
                                    .addComponent(combomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(labelMessages)
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltipo)
                    .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcategoria))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addGap(16, 16, 16)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMessages))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnombre)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(labelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfstock))
                        .addGap(5, 5, 5)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        this.selectedTable = this.table.getSelectedRow();

        ProductModel p = this.products.get(this.selectedTable);

        this.combotipo.setSelectedItem(p.getTipo());
        this.combocategoria.setSelectedItem(p.getCategoria());
        this.combomarca.setSelectedItem(p.getMarca());
        this.tfname.setText(p.getNombre());
        this.tfprecio.setText(String.valueOf(p.getPrecio()));
        this.tfstock.setText(String.valueOf(p.getStock()));
    }//GEN-LAST:event_tableMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (!this.validateForm()) {
            this.labelMessages.setVisible(true);
        } else {
            this.labelMessages.setVisible(false);
            ProductModel p = this.getFields();
            boolean result = p.save();
            if (result) {
                this.populateTable();
                this.cleanForm();
            }
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (this.selectedTable == -1) {
            return;
        }
        if (!this.validateForm()) {
            this.labelMessages.setVisible(true);
        } else {
            ProductModel user = this.products.get(this.selectedTable);

            ProductModel p = this.getFields();

            if (p == null) {
                return;
            }

            p.setId(user.getId());

            boolean result = p.save();

            if (result) {
                this.populateTable();
                this.cleanForm();
                this.selectedTable = -1;
            }

        }

    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (this.selectedTable == -1) {
            return;
        }
        ProductModel p = this.products.get(this.selectedTable);

        boolean result = p.delete();

        if (result) {
            this.populateTable();
            this.cleanForm();
            this.selectedTable = -1;
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void tfstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstockActionPerformed

    private void tfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnameActionPerformed

    private boolean validateForm() {
        ProductModel p = this.getFields();
        if (p == null) {
            return false;
        }
        if (p.getTipo().equals("") || p.getTipo() == null) {
            return false;
        }

        if (p.getCategoria().equals("") || p.getCategoria() == null) {
            return false;
        }

        if (p.getMarca().equals("") || p.getMarca() == null) {
            return false;
        }
        if (p.getNombre().equals("") || p.getNombre() == null) {
            return false;
        }
        if (p.getPrecio() == 0) {
            return false;
        }
        if (p.getStock() == 0) {
            return false;
        }

        return true;
    }

    private ProductModel getFields() {
        String tipo = String.valueOf(this.combotipo.getSelectedItem());
        String categoria = String.valueOf(this.combocategoria.getSelectedItem());
        String marca = String.valueOf(this.combomarca.getSelectedItem());
        String nombre = this.tfname.getText();
        boolean isN = isNumeric(this.tfprecio.getText());
        if (!isN) {
            return null;
        }
        isN = isNumeric(this.tfprecio.getText());
        if (!isN) {
            return null;
        }
        double precio = Double.parseDouble(this.tfprecio.getText());
        int stock = Integer.parseInt(this.tfstock.getText());
        ProductModel p = new ProductModel(tipo, categoria, marca, nombre, precio, stock);
        return p;
    }

    private void populateTable() {
        ProductModel p = new ProductModel();
        this.products = p.fromDatabse();

        String columns[] = {"tipo", "categoria", "marca", "nombre", "precio", "stock"};
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
        this.table.setModel(dataModel);
        this.table.setDefaultEditor(Object.class, null);
    }

    private void cleanForm() {
        this.combotipo.setSelectedIndex(0);
        this.combocategoria.setSelectedIndex(0);
        this.combomarca.setSelectedItem(0);
        this.tfname.setText("");
        this.tfprecio.setText("");
        this.tfstock.setText("");
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> combocategoria;
    private javax.swing.JComboBox<String> combomarca;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMessages;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labelmarca;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelprecio;
    private javax.swing.JLabel labelstock;
    private javax.swing.JLabel labeltipo;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tfstock;
    // End of variables declaration//GEN-END:variables
}
