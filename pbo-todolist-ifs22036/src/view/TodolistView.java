/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.TodolistService;

/**
 *
 * @author ASUS
 */
public class TodolistView extends javax.swing.JFrame {
    
    private TodolistService todolistService;
    private int todoActive = -1;
    private int searchActive = -1;
    /**
     * Creates new form TodolistView
     */
    public TodolistView() {
        initComponents();
    }
    
    
    public void setTodolistService(TodolistService todolistService) {
        this.todolistService = todolistService;
        todolistService.showTodoList(tblTodolist);
    }
    
    public void resetActiveTodo(){
        todoActive = -1;
        lblTodoActive.setText("Todo Aktif : -");
        txtTodo.setText("");
    }
    
    public void resetSerachTodo() {
        searchActive = -1;
        jLabel5.setText("Hasil Pencarian: ");
        txtSearch.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTittle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodolist = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblManageTodo = new javax.swing.JLabel();
        lblTodoActive = new javax.swing.JLabel();
        lblTxtTodo = new javax.swing.JLabel();
        txtTodo = new javax.swing.JTextField();
        btnAddTodo = new javax.swing.JButton();
        btnEditTodo = new javax.swing.JButton();
        btnDeleeteTodo = new javax.swing.JButton();
        btnAscending = new javax.swing.JButton();
        btnDescending = new javax.swing.JButton();
        btnResetData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Todolist 11S22036");

        lblTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(0, 153, 153));
        lblTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittle.setText("Aplikasi Todolist 11S22036");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(0, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(242, 242, 242));
        btnSearch.setText("Cari");
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblTodolist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "No", "Todo"
            }
        ));
        tblTodolist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTodolistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTodolist);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblManageTodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManageTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageTodo.setText(" Kelola data Todolist");

        lblTodoActive.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTodoActive.setText("Todo Aktif : -");

        lblTxtTodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTxtTodo.setText("Todo ");

        txtTodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTodoActionPerformed(evt);
            }
        });

        btnAddTodo.setBackground(new java.awt.Color(0, 153, 153));
        btnAddTodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTodo.setText("Tambah Data");
        btnAddTodo.setBorderPainted(false);
        btnAddTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTodoActionPerformed(evt);
            }
        });

        btnEditTodo.setBackground(new java.awt.Color(153, 153, 0));
        btnEditTodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnEditTodo.setText("Ubah Data");
        btnEditTodo.setBorderPainted(false);
        btnEditTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTodoActionPerformed(evt);
            }
        });

        btnDeleeteTodo.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleeteTodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleeteTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleeteTodo.setText("Hapus Data");
        btnDeleeteTodo.setBorderPainted(false);
        btnDeleeteTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleeteTodoActionPerformed(evt);
            }
        });

        btnAscending.setBackground(new java.awt.Color(204, 204, 255));
        btnAscending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAscending.setText("Urutkan Data Asc");
        btnAscending.setBorderPainted(false);
        btnAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscendingActionPerformed(evt);
            }
        });

        btnDescending.setBackground(new java.awt.Color(204, 204, 255));
        btnDescending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDescending.setText("Urutkan Data Desc");
        btnDescending.setBorderPainted(false);
        btnDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescendingActionPerformed(evt);
            }
        });

        btnResetData.setBackground(new java.awt.Color(204, 204, 255));
        btnResetData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetData.setText("Reset Data Tabel");
        btnResetData.setToolTipText("");
        btnResetData.setBorderPainted(false);
        btnResetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManageTodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAddTodo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleeteTodo))
                                    .addComponent(txtTodo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTxtTodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTodoActive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAscending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDescending)
                        .addGap(12, 12, 12)))
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnResetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblManageTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTodoActive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTxtTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTodo)
                    .addComponent(btnEditTodo)
                    .addComponent(btnDeleeteTodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAscending)
                    .addComponent(btnDescending))
                .addGap(18, 18, 18)
                .addComponent(btnResetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Hasil Pencarian :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch)))
                                .addGap(24, 24, 24)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String todo = txtSearch.getText();
        ArrayList<String> data = new ArrayList<>();
        DefaultTableModel tableModelSearch = (DefaultTableModel)tblTodolist.getModel();
        
         for (int row = 0; row < tableModelSearch.getRowCount(); row++) {
            String baruString = (String) tableModelSearch.getValueAt(row, 1);
            data.add(baruString);
        }
         
        tableModelSearch.setRowCount(0);
        
        for (int row = 0; row < data.size(); row++) {
            if (data.get(row).contains(todo)) {
                Object[] rowData = {row + 1, data.get(row)};
                tableModelSearch.addRow(rowData);
            }
        }
        
        jLabel5.setText("Hasil Pencarian: " + todo);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTodoActionPerformed

    private void btnAddTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTodoActionPerformed
         
        String todo = txtTodo.getText();
        if (todo.isBlank()) {
            JOptionPane.showMessageDialog(this, "Data todo tidak boleh kosong","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (todo.length() < 6) {
            JOptionPane.showMessageDialog(this, "Panjang karakter todo minimal 6","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (int i = 0; i < tblTodolist.getRowCount(); i++) {
            if (todo.equals(tblTodolist.getValueAt(i, 1))) {
                 JOptionPane.showMessageDialog(this, "Todo telah tersedia","Error" , JOptionPane.ERROR_MESSAGE);
            return;
            }
        }
        
        todolistService.addTodoList(todo);
        todolistService.showTodoList(tblTodolist);
        
        resetActiveTodo();
        
    }//GEN-LAST:event_btnAddTodoActionPerformed

    private void tblTodolistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTodolistMouseClicked
        
        DefaultTableModel tableModel = (DefaultTableModel)tblTodolist.getModel();
        Object data1 = tableModel.getValueAt(tblTodolist.getSelectedRow(),0);
        Object data2 = tableModel.getValueAt(tblTodolist.getSelectedRow(),1);
        
        todoActive = Integer.parseInt(data1.toString());
        lblTodoActive.setText("Todo Aktif : " + data2.toString());
        
        txtTodo.setText(data2.toString());
    }//GEN-LAST:event_tblTodolistMouseClicked

    private void btnEditTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTodoActionPerformed
        
        String todo = txtTodo.getText();
        
        if (todoActive < 0) {
            JOptionPane.showMessageDialog(this, "Belum ada data todo yang dipilih","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (todo.isBlank()) {
            JOptionPane.showMessageDialog(this, "Data todo tidak boleh kosong","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (todo.length() < 6) {
            JOptionPane.showMessageDialog(this, "Panjang karakter todo minimal 6","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (int i = 0; i < tblTodolist.getRowCount(); i++) {
            if (todo.equals(tblTodolist.getValueAt(i, 1))) {
                 JOptionPane.showMessageDialog(this, "Todo telah tersedia","Error" , JOptionPane.ERROR_MESSAGE);
            return;
            }
        }
        
        todolistService.changeTodoList(todoActive,todo);
        todolistService.showTodoList(tblTodolist);
        
        resetActiveTodo();
    }//GEN-LAST:event_btnEditTodoActionPerformed

    private void btnDeleeteTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleeteTodoActionPerformed
        
        if (todoActive < 0) {
            JOptionPane.showMessageDialog(this, "Belum ada data todo yang dipilih","Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        todolistService.removeTodoList(todoActive);
        todolistService.showTodoList(tblTodolist);
        
        resetActiveTodo();
    }//GEN-LAST:event_btnDeleeteTodoActionPerformed

    private void btnAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscendingActionPerformed
        
        DefaultTableModel tableModel = (DefaultTableModel) tblTodolist.getModel();
        ArrayList<String> data = new ArrayList<>();
        
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            String todo = (String) tableModel.getValueAt(row, 1);
            data.add(todo);
        }
        
          Collections.sort(data);
          tableModel.setRowCount(0);
          for (String todo : data) {
            Object[] rowData = {tableModel.getRowCount() + 1, todo};
            tableModel.addRow(rowData);
        }
//        Comparator<Todolist> comparator = Comparator.comparing(Todolist::getTodo);
        
    }//GEN-LAST:event_btnAscendingActionPerformed

    private void btnDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescendingActionPerformed
        
        DefaultTableModel tableModel = (DefaultTableModel) tblTodolist.getModel();
        ArrayList<String> data = new ArrayList<>();
        
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            String todo = (String) tableModel.getValueAt(row, 1);
            data.add(todo);
        }
        
        Collections.sort(data, Collections.reverseOrder() );
        tableModel.setRowCount(0);
          
        for (String todo : data) {
            Object[] rowData = {tableModel.getRowCount() + 1, todo};
            tableModel.addRow(rowData);
        }
     
    }//GEN-LAST:event_btnDescendingActionPerformed

    private void btnResetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDataActionPerformed
         todolistService.showTodoList(tblTodolist);
         resetSerachTodo();
    }//GEN-LAST:event_btnResetDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TodolistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodolistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodolistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodolistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodolistView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTodo;
    private javax.swing.JButton btnAscending;
    private javax.swing.JButton btnDeleeteTodo;
    private javax.swing.JButton btnDescending;
    private javax.swing.JButton btnEditTodo;
    private javax.swing.JButton btnResetData;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageTodo;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblTodoActive;
    private javax.swing.JLabel lblTxtTodo;
    private javax.swing.JTable tblTodolist;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTodo;
    // End of variables declaration//GEN-END:variables
}
