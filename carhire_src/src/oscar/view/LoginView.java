package oscar.view;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oscar.controller.AdminController;
import oscar.controller.StaffController;
import oscar.model.Staff;
import oscar.persistance.AbstractView;

/**
 *
 * @author sujan
 *
 * LoginView.java
 *
 * Created on 28-Mar-2012, 15:18:24
 */
public class LoginView extends AbstractView {

    /** Creates new form LoginView */
    public LoginView() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Staff"); // NOI18N
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel3.setText("Login");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel1.setText("Username:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtUserName.setText("Draga");
        txtUserName.setName("txtUserName"); // NOI18N

        btnLogin.setText("Login");
        btnLogin.setName("btnLogin"); // NOI18N

        jLabel2.setText("Password:");
        jLabel2.setName("jLabel2"); // NOI18N

        txtPassword.setText("password");
        txtPassword.setName("txtPassword"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addGap(116, 116, 116)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnLogin
     */
    public javax.swing.JButton getBtnLogin() {
        return btnLogin;
    }

    /**
     * @return the txtPassword
     */
    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    /**
     * @return the txtUserName
     */
    public String getUsername() {
        return txtUserName.getText().toString();
    }

    /**
     * @param txtPassword the txtPassword to set
     */
    public void setPassword(String password) {
        this.txtPassword.setText(password);
    }
}
