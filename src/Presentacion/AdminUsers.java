package Presentacion;

import AccesoDatos.UserModel;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author carolina
 */
public class AdminUsers extends javax.swing.JFrame {
    
    private int selectedTable;
    private ArrayList<UserModel> users;
    private UserModel user;
    
    public AdminUsers(UserModel user) {
        initComponents();
        this.user = user;
        this.labelMessages.setVisible(false);
        this.setLocationRelativeTo(null);
        populateTable();
        this.selectedTable = -1;
        this.setVisible(true);
        
        this.setTitle("Administracion usuarios");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelName = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        comboRole = new javax.swing.JComboBox<>();
        labelRole = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName(""); // NOI18N

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Role", "Nombre", "Usuario", "Contrasena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        labelName.setText("Nombre");

        labelUser.setText("Usuario");

        labelPassword.setText("Contrasena");

        txtName.setBackground(new java.awt.Color(204, 255, 255));

        txtUser.setBackground(new java.awt.Color(204, 255, 255));

        btnAdd.setBackground(new java.awt.Color(64, 150, 238));
        btnAdd.setText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(64, 150, 238));
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(64, 150, 238));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Cliente" }));
        comboRole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelRole.setText("Role");

        txtPassword.setBackground(new java.awt.Color(204, 255, 255));

        labelMessages.setForeground(new java.awt.Color(255, 0, 51));
        labelMessages.setText("No deje campos vacios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelRole)
                                .addGap(94, 94, 94)
                                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName)
                            .addComponent(labelUser)
                            .addComponent(labelPassword))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(labelMessages)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(labelMessages)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRole))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUser)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (!this.validateForm()) {
            this.labelMessages.setVisible(true);
        } else {
            this.labelMessages.setVisible(false);
            UserModel u = this.getFields();
            
            ArrayList<UserModel> users = u.fromDatabse();
            
            for (UserModel urs : users) {
                if (urs.getUser().equals(u.getUser())) {
                    this.labelMessages.setVisible(true);
                    this.labelMessages.setText("Usuario Repetido");
                    return;
                }
                
            }
            
            boolean result = u.save();
            if (result) {
                this.populateTable();
                this.cleanForm();
            }
        }

    }//GEN-LAST:event_btnAddMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        this.selectedTable = this.table.getSelectedRow();
        
        UserModel u = this.users.get(this.selectedTable);
        
        this.comboRole.setSelectedIndex(u.getRole());
        this.txtName.setText(u.getName());
        this.txtUser.setText(u.getUser());
        this.txtPassword.setText(u.getPassword());
    }//GEN-LAST:event_tableMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (this.selectedTable == -1) {
            return;
        }
        UserModel u = this.users.get(this.selectedTable);
        
        boolean result = u.delete();
        
        if (result) {
            this.populateTable();
            this.cleanForm();
            this.selectedTable = -1;
        }

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (this.selectedTable == -1) {
            return;
        }
        UserModel user = this.users.get(this.selectedTable);
        
        UserModel u = this.getFields();
        
        u.setId(user.getId());
        
        boolean result = u.save();
        
        if (result) {
            this.populateTable();
            this.cleanForm();
            this.selectedTable = -1;
        }
        

    }//GEN-LAST:event_btnUpdateMouseClicked
    
    private boolean validateForm() {
        UserModel u = this.getFields();
        if (u.getName().equals("") || u.getName() == null) {
            return false;
        }
        
        if (u.getUser().equals("") || u.getUser() == null) {
            return false;
        }
        
        if (u.getPassword().equals("") || u.getPassword() == null) {
            return false;
        }
        
        return true;
    }
    
    private UserModel getFields() {
        int role = this.comboRole.getSelectedIndex();
        String name = this.txtName.getText();
        String user = this.txtUser.getText();
        String password = String.valueOf(this.txtPassword.getPassword());
        UserModel u = new UserModel(role, name, user, password);
        return u;
    }
    
    private void populateTable() {
        UserModel u = new UserModel();
        this.users = u.fromDatabse();
        
        ArrayList<UserModel> temp = new ArrayList<UserModel>();
        
        for (UserModel us : this.users) {
            if (!us.getId().equals(this.user.getId())) {
                temp.add(us);
            }
        }
        
        this.users = temp;
        
        String columns[] = {"Role", "Nombre", "Usuario", "Contrasena"};
        String data[][] = new String[this.users.size()][columns.length];
        
        for (int i = 0; i < this.users.size(); i++) {
            int role = this.users.get(i).getRole();
            String roleName = "";
            if (role == 0) {
                roleName = "Administrador";
            }
            if (role == 1) {
                roleName = "Vendedor";
            }
            if (role == 2) {
                roleName = "Cliente";
            }
            
            data[i][0] = roleName;
            data[i][1] = this.users.get(i).getName();
            data[i][2] = this.users.get(i).getUser();
            data[i][3] = this.users.get(i).getPassword();
            
        }
        
        DefaultTableModel dataModel = new DefaultTableModel(data, columns);
        this.table.setModel(dataModel);
        this.table.setDefaultEditor(Object.class, null);
    }
    
    private void cleanForm() {
        this.txtName.setText("");
        this.txtUser.setText("");
        this.txtPassword.setText("");
        this.comboRole.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMessages;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
