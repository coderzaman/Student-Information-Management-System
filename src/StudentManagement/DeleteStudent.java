/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StudentManagement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;import javax.swing.JOptionPane;
;
/**
 *
 * @author Aktaruzzaman
 */
public class DeleteStudent extends javax.swing.JFrame {
    boolean checkReadyForDatabese = false;
    private Connection connection;
    MainPage mainPage;
    /**
     * Creates new form DeleteStudent
     */
    public DeleteStudent() {
        initComponents();
        setResizable(false);
        this.setSize(1200, 700);
        mainPage = new MainPage();
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
        jPanel5 = new javax.swing.JPanel();
        logOutBtn1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        backBtnFromDelete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deleteStudentText = new javax.swing.JLabel();
        searchStdId = new javax.swing.JTextField();
        searchStudentBtn = new javax.swing.JPanel();
        logOutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Student");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(115, 45));

        logOutBtn1.setBackground(new java.awt.Color(0, 153, 204));
        logOutBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOutBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logOutBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(logOutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 51, 51));
        jPanel11.setFocusCycleRoot(true);
        jPanel11.setPreferredSize(new java.awt.Dimension(115, 45));

        backBtnFromDelete.setBackground(new java.awt.Color(0, 153, 204));
        backBtnFromDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtnFromDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBtnFromDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtnFromDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnFromDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(backBtnFromDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtnFromDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteStudentPage.png"))); // NOI18N

        deleteStudentText.setBackground(new java.awt.Color(0, 204, 255));
        deleteStudentText.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        deleteStudentText.setForeground(new java.awt.Color(255, 51, 51));
        deleteStudentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteStudentText.setText("DElete student");

        searchStdId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchStdId.setForeground(new java.awt.Color(153, 153, 153));
        searchStdId.setText("  Enter Student Id");
        searchStdId.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 204, 255), null));
        searchStdId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchStdIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchStdIdFocusLost(evt);
            }
        });
        searchStdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStdIdActionPerformed(evt);
            }
        });

        searchStudentBtn.setBackground(new java.awt.Color(255, 51, 51));
        searchStudentBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        searchStudentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchStudentBtnMouseClicked(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(255, 51, 51));
        logOutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteStdBtn.png"))); // NOI18N
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout searchStudentBtnLayout = new javax.swing.GroupLayout(searchStudentBtn);
        searchStudentBtn.setLayout(searchStudentBtnLayout);
        searchStudentBtnLayout.setHorizontalGroup(
            searchStudentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchStudentBtnLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        searchStudentBtnLayout.setVerticalGroup(
            searchStudentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchStudentBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addComponent(searchStdId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStdId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(searchStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtn1MouseClicked
        if(!checkReadyForDatabese){
            mainPage.setVisible(true);
            this.dispose();
        }else{
            try {
                // TODO add your handling code here:
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            checkReadyForDatabese = false;
            mainPage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logOutBtn1MouseClicked

    private void backBtnFromDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnFromDeleteMouseClicked
        AdminOpearation adminOpearation = new AdminOpearation();
        if(!checkReadyForDatabese){
            adminOpearation.setVisible(true);
            this.dispose();
        }else{
            try {
                // TODO add your handling code here:
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            checkReadyForDatabese = false;
            adminOpearation.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backBtnFromDeleteMouseClicked

    private void searchStdIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchStdIdFocusGained
        if(searchStdId.getText().equals("  Enter Student Id")){
            searchStdId.setText(null);
            searchStdId.requestFocus();
            mainPage.removePlaaceholderStytle(searchStdId);
        }
    }//GEN-LAST:event_searchStdIdFocusGained

    private void searchStdIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchStdIdFocusLost
        // TODO add your handling code here:
        if(searchStdId.getText().length() == 0){
            MainPage.addPlaaceholderStytle(searchStdId);
            searchStdId.setText("  Enter Student Id");
        }
    }//GEN-LAST:event_searchStdIdFocusLost

    private void searchStdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStdIdActionPerformed

    }//GEN-LAST:event_searchStdIdActionPerformed

    private void searchStudentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchStudentBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchStudentBtnMouseClicked

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked

        try {
            // Connect to the database
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/studentmangementsystem?serverTimezone=UTC";
            connection = DriverManager.getConnection(url, user, password);

            
            
            
            
            // Retrieve the ID from the text field
            String studentId = searchStdId.getText();
            
            //Delete From Demand
            String deleteQueryFromDemand = "DELETE FROM demand WHERE stdId = ?";
            PreparedStatement deleteStatementFordemand = connection.prepareStatement(deleteQueryFromDemand);
            deleteStatementFordemand.setString(1, studentId);
            // Delete From Intake
            String deleteQueryFromIntake = "DELETE FROM intake WHERE stdId = ?";
            PreparedStatement deleteStatementForIntake = connection.prepareStatement(deleteQueryFromIntake);
            deleteStatementForIntake.setString(1, studentId);
            deleteStatementForIntake.executeUpdate();
            
            //Delete from result
            String deleteQueryFromResult = "DELETE FROM result WHERE stdId = ?";
            PreparedStatement deleteStatementForResult = connection.prepareStatement(deleteQueryFromResult);
            deleteStatementForResult.setString(1, studentId);
            deleteStatementForResult.executeUpdate();
            
            
            //Delete from student
            String checkIdQuery = "SELECT stdId FROM stdinfo WHERE stdId = ?";
            PreparedStatement checkIdStatement = connection.prepareStatement(checkIdQuery);
            checkIdStatement.setString(1, studentId);
   
            
            // Execute the SELECT statement
            ResultSet checkIdResultSet = checkIdStatement.executeQuery();

            // Process the result
            if (checkIdResultSet.next()) {
                // ID exists, delete the record
                String deleteQuery = "DELETE FROM stdinfo WHERE stdId = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                deleteStatement.setString(1, studentId);

                int deletedRows = deleteStatement.executeUpdate();
                if (deletedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Student ID " + studentId + " deleted successfully.", "Record Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete student ID " + studentId + ".", "Deletion Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // ID doesn't exist, show a dialog box message
                JOptionPane.showMessageDialog(null, "Student ID " + studentId + " does not exist.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_logOutBtnMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        requestFocusInWindow(true);
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtnFromDelete;
    private javax.swing.JLabel deleteStudentText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logOutBtn;
    private javax.swing.JLabel logOutBtn1;
    private javax.swing.JTextField searchStdId;
    private javax.swing.JPanel searchStudentBtn;
    // End of variables declaration//GEN-END:variables
}
