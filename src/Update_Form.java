import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Update_Form.java
 *
 * Created on Nov 11, 2016, 3:22:20 PM
 */

/**
 *
 * @author user
 */
public class Update_Form extends javax.swing.JFrame {

    /** Creates new form Update_Form */
    public Update_Form() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCl = new javax.swing.JTextField();
        txtSec = new javax.swing.JTextField();
        txtRno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        txtTM = new javax.swing.JTextField();
        txtsst = new javax.swing.JTextField();
        txtscience = new javax.swing.JTextField();
        txtMM = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPS = new javax.swing.JTextField();
        btnCal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txteng = new javax.swing.JTextField();
        txthin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("ADD ROLL NO");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(10, 63, 105, 23);

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 104, 99, 250);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(62, 493, 77, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ROLL NO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(154, 131, 50, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("SECTION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(154, 239, 47, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("CLASS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(156, 201, 35, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(154, 166, 31, 14);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(295, 166, 99, 20);
        getContentPane().add(txtCl);
        txtCl.setBounds(295, 198, 99, 20);
        getContentPane().add(txtSec);
        txtSec.setBounds(295, 236, 99, 20);

        txtRno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtRno);
        txtRno.setBounds(295, 128, 99, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PERCENTAGE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(154, 281, 70, 14);

        txtPer.setEditable(false);
        txtPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerActionPerformed(evt);
            }
        });
        getContentPane().add(txtPer);
        txtPer.setBounds(295, 278, 99, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("SST MARKS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 160, 64, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("SCIENCE MARKS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 128, 88, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("TOTAL MARKS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 303, 79, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("MATHS MARKS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 195, 83, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("GRADE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 341, 38, 14);

        txtGrade.setEditable(false);
        txtGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradeActionPerformed(evt);
            }
        });
        getContentPane().add(txtGrade);
        txtGrade.setBounds(618, 338, 70, 20);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(458, 493, 67, 23);

        txtTM.setEditable(false);
        getContentPane().add(txtTM);
        txtTM.setBounds(618, 300, 70, 20);

        txtsst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsstActionPerformed(evt);
            }
        });
        getContentPane().add(txtsst);
        txtsst.setBounds(618, 159, 70, 20);
        getContentPane().add(txtscience);
        txtscience.setBounds(618, 128, 70, 20);
        getContentPane().add(txtMM);
        txtMM.setBounds(618, 192, 70, 20);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(629, 488, 61, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PREFFERED STREAM");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(154, 349, 110, 14);
        getContentPane().add(txtPS);
        txtPS.setBounds(295, 346, 99, 20);

        btnCal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCal.setText("CALCULATE");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCal);
        btnCal.setBounds(261, 493, 95, 23);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel12.setText("UPDATE FORM");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(271, 20, 178, 34);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("ENGLISH MARKS ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(490, 233, 93, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("HINDI MARKS");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(490, 265, 76, 14);

        txteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtengActionPerformed(evt);
            }
        });
        getContentPane().add(txteng);
        txteng.setBounds(618, 230, 70, 20);
        getContentPane().add(txthin);
        txthin.setBounds(618, 262, 70, 20);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 750, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNameActionPerformed

    private void txtGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtGradeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtRno.setText("");
        txtName.setText("");
        txtCl.setText("");
        txtSec.setText("");
        txtscience.setText("");
        txtsst.setText("");
         txteng.setText("");
          txthin.setText("");
        txtMM.setText("");
        txtTM.setText("");
        txtPer.setText("");
        txtGrade.setText("");
        txtPS.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
        int sm = Integer.parseInt(txtscience.getText());
        int sstm = Integer.parseInt(txtsst.getText());
        int MM = Integer.parseInt(txtMM.getText());
         int eng = Integer.parseInt(txteng.getText());
          int hin = Integer.parseInt(txthin.getText());
        int TotalMarks =  MM+sm+sstm+hin+eng;
        txtTM.setText("" + TotalMarks);
        int Percentage = TotalMarks/5;
        txtPer.setText("" + Percentage);
        if (Percentage>=90)
            txtGrade.setText("A");
        else if(Percentage>=80)
            txtGrade.setText("B");
        else if (Percentage>=70)
            txtGrade.setText("C");
        else
            txtGrade.setText("D");

    }//GEN-LAST:event_btnCalActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultListModel dm = (DefaultListModel)jList1.getModel();
        String str = "Select Roll_No From Student";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Stream","root","damon");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next())
            {
             String rn = rs.getString("Roll_No");
             dm.addElement(rn);

            }
            con.close();


        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
}//GEN-LAST:event_btnAddActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        String rn = (String)jList1.getSelectedValue();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Stream","root","damon");
            Statement stmt = con.createStatement();
            String str = "Select* From Student Where Roll_No = '"+rn+"'";
            ResultSet rs = stmt.executeQuery(str);
            if(rs.next())
            {
                String rno = rs.getString("Roll_No");
                String nm = rs.getString("Name");
                int cl = rs.getInt("Class");
                String sec = rs.getString("Section");
                int sm = rs.getInt("Science");
                int sstm = rs.getInt("SST");
                int mm = rs.getInt("Maths");
                int eng = rs.getInt("English");
                int hin = rs.getInt("Hindi");
                int tm = rs.getInt("Total");
                int per = rs.getInt("Percentage");
                String gr = rs.getString("Grade");
                String pf = rs.getString("PrefStream");
                txtRno.setText(""+ rno);
                txtName.setText(""+ nm);
                txtCl.setText(""+ cl);
                txtSec.setText(""+ sec);
                txtscience.setText(""+ sm);
                txtsst.setText(""+ sstm);
                txtMM.setText(""+ mm);
                txteng.setText(""+ eng);
                txthin.setText(""+ hin);
                txtTM.setText(""+ tm);
                txtPer.setText(""+ per);
                txtGrade.setText(""+ gr);
                txtPS.setText(""+ pf);





            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String rno = txtRno.getText();
        String nm = txtName.getText();
        int cl = Integer.parseInt(txtCl.getText());
        String sec = txtSec.getText();
        int sm = Integer.parseInt(txtscience.getText());
        int sstm = Integer.parseInt(txtsst.getText());
        int mm = Integer.parseInt(txtMM.getText());
        int em = Integer.parseInt(txteng.getText());
        int hm = Integer.parseInt(txthin.getText());
        int tm = Integer.parseInt(txtTM.getText());
        int per = Integer.parseInt(txtPer.getText());
        String gr = txtGrade.getText();
        String ps = txtPS.getText();
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/Stream","root","damon");
             Statement stmt = con.createStatement();
             String str = "Update Student Set Name='"+(nm)+"',Class="+(cl)+",Section='"+(sec)+"',Science="+(sm)+",SST="+(sstm)+",Maths="+(mm)+",English="+(em)+",Hindi="+(hm)+",Total="+(tm)+",Percentage="+(per)+",Grade='"+(gr)+"',PrefStream='"+(ps)+"' Where Roll_No = '"+(rno)+"'";
            int r = stmt.executeUpdate(str);
            JOptionPane.showMessageDialog(this,"RECORD UPDATED");
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.getMessage());
         }

}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRnoActionPerformed

    private void txtsstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsstActionPerformed

    private void txtengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtengActionPerformed

    private void txtPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerActionPerformed



    


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCl;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtMM;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPS;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtRno;
    private javax.swing.JTextField txtSec;
    private javax.swing.JTextField txtTM;
    private javax.swing.JTextField txteng;
    private javax.swing.JTextField txthin;
    private javax.swing.JTextField txtscience;
    private javax.swing.JTextField txtsst;
    // End of variables declaration//GEN-END:variables

}
