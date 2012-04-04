/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CarDialog.java
 *
 * Created on Apr 4, 2012, 11:30:34 AM
 */
package oscar.view.dialog;

/**
 *
 * @author schiodin
 */
public class CarDialog extends javax.swing.JDialog {

    /** Creates new form CarDialog */
    public CarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        classCB = new javax.swing.JComboBox();
        yearLbl = new javax.swing.JLabel();
        modelTxt = new javax.swing.JTextField();
        classLbl = new javax.swing.JLabel();
        colorTxt = new javax.swing.JTextField();
        yearSpn = new javax.swing.JSpinner();
        colorLbl = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox();
        statusLbl = new javax.swing.JLabel();
        plateLbl = new javax.swing.JLabel();
        plateTxt = new javax.swing.JTextField();
        brandLbl = new javax.swing.JLabel();
        modelLbl = new javax.swing.JLabel();
        brandTxt = new javax.swing.JTextField();
        rightPanel = new javax.swing.JPanel();
        serviceMonthSpn = new javax.swing.JSpinner();
        milieageTxt = new javax.swing.JTextField();
        mileageLbl = new javax.swing.JLabel();
        branchCB = new javax.swing.JComboBox();
        branchLbl = new javax.swing.JLabel();
        lastServiceMileageTxt = new javax.swing.JTextField();
        lastServiceMileageLbl = new javax.swing.JLabel();
        lastServiceLbl = new javax.swing.JLabel();
        serviceMilesLbl = new javax.swing.JLabel();
        serviceMilesTxt = new javax.swing.JTextField();
        serviceMonthLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(459, 246));
        setModal(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/view/resources/arrow.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setName("saveBtn"); // NOI18N

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/view/resources/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setName("deleteBtn"); // NOI18N

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/view/resources/return.png"))); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setName("cancelBtn"); // NOI18N

        leftPanel.setName("leftPanel"); // NOI18N

        classCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classCB.setName("classCB"); // NOI18N

        yearLbl.setText("Year");
        yearLbl.setName("yearLbl"); // NOI18N

        modelTxt.setName("modelTxt"); // NOI18N

        classLbl.setText("Class");
        classLbl.setName("classLbl"); // NOI18N

        colorTxt.setName("colorTxt"); // NOI18N

        yearSpn.setName("yearSpn"); // NOI18N

        colorLbl.setText("Color");
        colorLbl.setName("colorLbl"); // NOI18N

        statusCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusCB.setName("statusCB"); // NOI18N

        statusLbl.setText("Status");
        statusLbl.setName("statusLbl"); // NOI18N

        plateLbl.setText("Plate");
        plateLbl.setName("plateLbl"); // NOI18N

        plateTxt.setName("plateTxt"); // NOI18N

        brandLbl.setText("Brand");
        brandLbl.setName("brandLbl"); // NOI18N

        modelLbl.setText("Model");
        modelLbl.setName("modelLbl"); // NOI18N

        brandTxt.setName("brandTxt"); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plateLbl)
                    .addComponent(modelLbl)
                    .addComponent(yearLbl)
                    .addComponent(classLbl)
                    .addComponent(colorLbl)
                    .addComponent(statusLbl)
                    .addComponent(brandLbl))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 107, Short.MAX_VALUE)
                    .addComponent(modelTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(colorTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(yearSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(plateTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(statusCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 107, Short.MAX_VALUE)
                    .addComponent(brandTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(plateLbl))
                    .addComponent(plateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(modelLbl))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(classLbl))
                    .addComponent(classCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(yearLbl))
                    .addComponent(yearSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(colorLbl))
                    .addComponent(colorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(statusLbl))
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        rightPanel.setName("rightPanel"); // NOI18N

        serviceMonthSpn.setName("serviceMonthSpn"); // NOI18N

        milieageTxt.setName("milieageTxt"); // NOI18N

        mileageLbl.setText("Mileage");
        mileageLbl.setName("mileageLbl"); // NOI18N

        branchCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        branchCB.setName("branchCB"); // NOI18N

        branchLbl.setText("Branch");
        branchLbl.setName("branchLbl"); // NOI18N

        lastServiceMileageTxt.setName("lastServiceMileageTxt"); // NOI18N

        lastServiceMileageLbl.setText("Mileage of the last service");
        lastServiceMileageLbl.setName("lastServiceMileageLbl"); // NOI18N

        lastServiceLbl.setText("Date of the last service");
        lastServiceLbl.setName("lastServiceLbl"); // NOI18N

        serviceMilesLbl.setText("Miles betwen services");
        serviceMilesLbl.setName("serviceMilesLbl"); // NOI18N

        serviceMilesTxt.setName("serviceMilesTxt"); // NOI18N

        serviceMonthLbl.setText("Months between services");
        serviceMonthLbl.setName("serviceMonthLbl"); // NOI18N

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastServiceLbl)
                    .addComponent(branchLbl)
                    .addComponent(serviceMonthLbl)
                    .addComponent(serviceMilesLbl)
                    .addComponent(lastServiceMileageLbl)
                    .addComponent(mileageLbl))
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(branchCB, 0, 130, Short.MAX_VALUE)
                    .addComponent(serviceMilesTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastServiceMileageTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(milieageTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(serviceMonthSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mileageLbl))
                    .addComponent(milieageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lastServiceMileageLbl))
                    .addComponent(lastServiceMileageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastServiceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(branchLbl))
                    .addComponent(branchCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(serviceMonthLbl))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceMonthSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(serviceMilesLbl))
                    .addComponent(serviceMilesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn)
                    .addComponent(cancelBtn))
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CarDialog dialog = new CarDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox branchCB;
    private javax.swing.JLabel branchLbl;
    private javax.swing.JLabel brandLbl;
    private javax.swing.JTextField brandTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox classCB;
    private javax.swing.JLabel classLbl;
    private javax.swing.JLabel colorLbl;
    private javax.swing.JTextField colorTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel lastServiceLbl;
    private javax.swing.JLabel lastServiceMileageLbl;
    private javax.swing.JTextField lastServiceMileageTxt;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel mileageLbl;
    private javax.swing.JTextField milieageTxt;
    private javax.swing.JLabel modelLbl;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JLabel plateLbl;
    private javax.swing.JTextField plateTxt;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel serviceMilesLbl;
    private javax.swing.JTextField serviceMilesTxt;
    private javax.swing.JLabel serviceMonthLbl;
    private javax.swing.JSpinner serviceMonthSpn;
    private javax.swing.JComboBox statusCB;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel yearLbl;
    private javax.swing.JSpinner yearSpn;
    // End of variables declaration//GEN-END:variables
}
