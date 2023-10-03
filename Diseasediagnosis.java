/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aman
 */
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class Diseasediagnosis extends javax.swing.JFrame {
    Connection con;//=new Connection();
    Statement stmt;
    ResultSet rs;
     
    
    /**
     * Creates new form diseasediagnosis
     */
    public Diseasediagnosis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 55)); // NOI18N
        jLabel1.setText("Diseases Diagnosis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 600, 100));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel2.setText("Enter Symptom 1 :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 50));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel3.setText("Enter Symptom 2 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 200, 31));

        jButton1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jButton1.setText("Diagnose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 230, 60));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "High BP", "Obesity ", "Unusual thirst", "Belly fat", "Pain in Eyes", "Seizures", "Fever", "Cough", "Forgetting things", "Poor judgement", "Blood in cough", "Weight loss without any reason", "Loose stool", "Nausea and bloating", "Small itchy blisters", "Tiredness", "Muscle and joint pain ", "Headache", "Sneezing and runny nose", "Breathlessness", "Muscle Aches", "Vomiting" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 230, 40));

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "High BP", "Obesity ", "Unusual thirst", "Belly fat", "Pain in Eyes", "Seizures", "Fever", "Cough", "Forgetting things", "Poor judgement", "Blood in cough", "Weight loss without any reason", "Loose stool", "Nausea and bloating", "Small itchy blisters", "Tiredness", "Muscle and joint pain ", "Headache", "Sneezing and runny nose", "Breathlessness", "Muscle Aches", "Vomiting" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 230, 40));

        jButton2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 160, 70));

        jButton3.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 250, 60));

        jTable1.setBackground(new java.awt.Color(255, 102, 153));
        jTable1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Disease", "Symptom 1", "Symptom 2", "Symptom 3", "Symptom 4", "Symptom 5"
            }
        ));
        jTable1.setRowHeight(55);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1000, 90));

        jButton5.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jButton5.setText("Medication");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 300, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diagnosis (1).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1250, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      // jComboBox2.getSelectedItem()
               String symptom2 =jComboBox2.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try
    {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DiseaseAnalytics","root","");
    System.out.println("Determining your Disease...");
    System.out.println("Connection to database sucessful...");
    stmt=con.createStatement();
      String symptom1 =jComboBox1.getSelectedItem().toString();    
    String symptom2 =jComboBox2.getSelectedItem().toString();
   /* String query="insert into disease values('"+symptom1+"','"+symptom2+"');";
    stmt.executeUpdate(query);*/
    rs=stmt.executeQuery("select * from disease where (Symptom1='"+ symptom1 + "' and Symptom2= '"+ symptom2 +"') or (Symptom2= '"+ symptom1 + "' and Symptom1= '"+ symptom2 +"');" );
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    /*String disease;
     if(rs.next())
     {
    disease=rs.getString(1);
    System.out.println("You are suffering from disease: "+disease);
     }
     
    JOptionPane.showMessageDialog(this,"Disease is shown at the console..");**/
    }
    catch(Exception e)
    {
    System.out.println("Problem="+ e);
    } 
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
          String symptom1 =jComboBox1.getSelectedItem().toString();// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you want to medication as well?","Select",JOptionPane.YES_NO_OPTION);
     if(a==0)
     {
         new Medicine().setVisible(true);
     }
     else
     {
     setVisible(false);
     new Home().setVisible(true);
     }
                 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Medicine().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Diseasediagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseasediagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseasediagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseasediagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseasediagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
