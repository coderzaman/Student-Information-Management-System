/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StudentManagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Aktaruzzaman
 */
public class StudentCompleteCourse extends javax.swing.JFrame {

    Connection connection;
    MainPage mainPage;

    /**
     * Creates new form StudentCompleteCourse
     */
    public StudentCompleteCourse() {
        initComponents();
        setSize(1200, 700);
        setResizable(false);
        
    
        table_head_color(courseTable);
        getStudentInfo(MainPage.passStudentId);
        
        mainPage =  new MainPage();
    }

    private void table_head_color(JTable table_name) {
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setBackground(new Color(0,90,91));
        head_render.setForeground(new Color(255,255,255));
        head_render.setOpaque(true);
        head_render.setFont(new Font("Consolas", Font.BOLD, 18));
        head_render.setPreferredSize(new Dimension(head_render.getPreferredSize().width, 40));
        table_name.getTableHeader().setDefaultRenderer(head_render);
        
      
    }

    
    public static String getGrade(int marks) {
        if (marks < 40) {
            return "Fail";
        } else if (marks >= 40 && marks <= 44) {
            return "D";
        } else if (marks >= 45 && marks <= 49) {
            return "C";
        } else if (marks >= 50 && marks <= 54) {
            return "C+";
        } else if (marks >= 55 && marks <= 60) {
            return "B-";
        } else if (marks >= 61 && marks <= 64) {
            return "B";
        } else if (marks >= 65 && marks <= 70) {
            return "B+";
        } else if (marks >= 71 && marks <= 74) {
            return "A-";
        } else if (marks >= 75 && marks <= 79) {
            return "A";
        } else if (marks >= 80 && marks <= 100) {
            return "A+";
        } else {
            return "";
        }
    }
    
    private void getStudentInfo(String receiveStdId) {
        studenetProfileNameCourse.setText(StudentHome.studentNamsPass);
        studenetProfileIdCourse.setText(receiveStdId);
        try {
            // Connect to the database
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/studentmangementsystem?serverTimezone=UTC";
            connection = DriverManager.getConnection(url, user, password);

            //Select Name
            String allCompletedCourse = "SELECT result.courseTitle, courses.courseCode, result.courseCredit, result.score " +
                         "FROM result " +
                         "INNER JOIN courses ON result.courseTitle = courses.courseTitle " +
                         "WHERE stdId = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(allCompletedCourse);
            preparedStatement.setString(1, receiveStdId);

            ResultSet resultSet = preparedStatement.executeQuery();

           
            
            while (resultSet.next()) {
                String courseTitle = resultSet.getString("courseTitle");
                String courseCode = resultSet.getString("courseCode");
                String courseCredit = resultSet.getString("courseCredit");
                String score = resultSet.getString("score");
                int scoreInt = Integer.parseInt(score);
                String grade = getGrade(scoreInt);
                
                String tableData[] = {courseTitle, courseCode, courseCredit, score, grade}; 
                DefaultTableModel tableModel = (DefaultTableModel) courseTable.getModel();
                
                tableModel.addRow(tableData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        studenetProfileNameCourse = new javax.swing.JLabel();
        studenetProfileIdCourse = new javax.swing.JLabel();
        backBtnStudent2 = new javax.swing.JLabel();
        logOutStudent2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/std_profile_iamge.png"))); // NOI18N

        studenetProfileNameCourse.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        studenetProfileNameCourse.setForeground(new java.awt.Color(2, 166, 118));
        studenetProfileNameCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studenetProfileNameCourse.setText("Student Name");

        studenetProfileIdCourse.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        studenetProfileIdCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studenetProfileIdCourse.setText("stuent Id");

        backBtnStudent2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        backBtnStudent2.setForeground(new java.awt.Color(255, 255, 255));
        backBtnStudent2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtnStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_black.png"))); // NOI18N
        backBtnStudent2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 166, 118), 1, true));
        backBtnStudent2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtnStudent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnStudent2MouseClicked(evt);
            }
        });

        logOutStudent2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        logOutStudent2.setForeground(new java.awt.Color(2, 166, 118));
        logOutStudent2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOutStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutGreen.png"))); // NOI18N
        logOutStudent2.setText("Logout");
        logOutStudent2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 166, 118), 1, true));
        logOutStudent2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutStudent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutStudent2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(studenetProfileIdCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(studenetProfileNameCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logOutStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtnStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studenetProfileNameCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studenetProfileIdCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 700));

        courseTable.setBackground(new java.awt.Color(0, 56, 64));
        courseTable.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        courseTable.setForeground(new java.awt.Color(255, 255, 255));
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Course Code", "Credit", "Score", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        courseTable.setFocusable(false);
        courseTable.setGridColor(new java.awt.Color(204, 204, 204));
        courseTable.setRowHeight(30);
        jScrollPane1.setViewportView(courseTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 680, 370));

        jPanel3.setBackground(new java.awt.Color(0, 56, 64));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPLETED COURSES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnStudent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnStudent2MouseClicked
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnStudent2MouseClicked

    private void logOutStudent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutStudent2MouseClicked
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutStudent2MouseClicked

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
            java.util.logging.Logger.getLogger(StudentCompleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCompleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCompleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCompleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCompleteCourse().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtnStudent2;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOutStudent2;
    public static javax.swing.JLabel studenetProfileIdCourse;
    private javax.swing.JLabel studenetProfileNameCourse;
    // End of variables declaration//GEN-END:variables
}
