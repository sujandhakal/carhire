/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StaffView.java
 *
 * Created on Mar 21, 2012, 2:29:56 PM
 */
package oscar.view;

import oscar.persistance.AbstractView;

/**
 *
 * @author schiodin
 */
public class StaffView extends AbstractView {

    /** Creates new form StaffView */
    public StaffView() {
        initComponents();
        //this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extensionDlg = new javax.swing.JDialog();
        oldDateLbl = new javax.swing.JLabel();
        oldDateDP = new org.jdesktop.swingx.JXDatePicker();
        newDateLbl = new javax.swing.JLabel();
        newDateDP = new org.jdesktop.swingx.JXDatePicker();
        Extendsbtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        tabPanel = new javax.swing.JTabbedPane();
        returnPanel = new javax.swing.JPanel();
        carSearchPanel1 = new javax.swing.JPanel();
        refCodeLbl2 = new javax.swing.JLabel();
        surnameLbl2 = new javax.swing.JLabel();
        plateLbl3 = new javax.swing.JLabel();
        refCodeTxt2 = new javax.swing.JTextField();
        surnameTxt2 = new javax.swing.JTextField();
        plateTxt3 = new javax.swing.JTextField();
        clearBtn5 = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        extendsBtn = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        hirePanel = new javax.swing.JPanel();
        hireBtn = new javax.swing.JButton();
        personPanel = new javax.swing.JPanel();
        hirePersonLoadBtn = new javax.swing.JButton();
        hireNameLbl = new javax.swing.JLabel();
        hireNameTxt = new javax.swing.JTextField();
        hireSurnameLbl = new javax.swing.JLabel();
        hireSurnameTxt = new javax.swing.JTextField();
        hireDateOfBirthLbl = new javax.swing.JLabel();
        hireDateOfBirthDP = new org.jdesktop.swingx.JXDatePicker();
        hireEmailLbl = new javax.swing.JLabel();
        hireEmailTxt = new javax.swing.JTextField();
        hirePhoneLbl = new javax.swing.JLabel();
        hirePhoneTxt = new javax.swing.JTextField();
        hireAddressLbl = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        hireAddressTxt = new javax.swing.JTextArea();
        carPanel1 = new javax.swing.JPanel();
        hireFromLbl = new javax.swing.JLabel();
        hireFromDP = new org.jdesktop.swingx.JXDatePicker();
        hireToLbl = new javax.swing.JLabel();
        hireToDP = new org.jdesktop.swingx.JXDatePicker();
        hireClassLbl = new javax.swing.JLabel();
        hireClassCB = new javax.swing.JComboBox();
        hireChauffeuredCB = new javax.swing.JCheckBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        hireTbl = new org.jdesktop.swingx.JXTable();
        hireRefCodeLbl = new javax.swing.JLabel();
        hireRefCodeTxt = new javax.swing.JTextField();
        hireRefCodeSearchBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        hireInsuranceCB = new javax.swing.JCheckBox();
        hireClearBtn = new javax.swing.JButton();
        usernameLbl = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(StaffView.class);
        extensionDlg.setTitle(resourceMap.getString("extensionDlg.title")); // NOI18N
        extensionDlg.setAlwaysOnTop(true);
        extensionDlg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        extensionDlg.setIconImage(null);
        extensionDlg.setMinimumSize(new java.awt.Dimension(281, 200));
        extensionDlg.setModal(true);
        extensionDlg.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        extensionDlg.setName("extensionDlg"); // NOI18N
        extensionDlg.setResizable(false);

        oldDateLbl.setText(resourceMap.getString("oldDateLbl.text")); // NOI18N
        oldDateLbl.setName("oldDateLbl"); // NOI18N

        oldDateDP.setEditable(false);
        oldDateDP.setName("oldDateDP"); // NOI18N

        newDateLbl.setText(resourceMap.getString("newDateLbl.text")); // NOI18N
        newDateLbl.setName("newDateLbl"); // NOI18N

        newDateDP.setName("newDateDP"); // NOI18N

        Extendsbtn.setIcon(resourceMap.getIcon("Extendsbtn.icon")); // NOI18N
        Extendsbtn.setText(resourceMap.getString("Extendsbtn.text")); // NOI18N
        Extendsbtn.setName("Extendsbtn"); // NOI18N

        javax.swing.GroupLayout extensionDlgLayout = new javax.swing.GroupLayout(extensionDlg.getContentPane());
        extensionDlg.getContentPane().setLayout(extensionDlgLayout);
        extensionDlgLayout.setHorizontalGroup(
            extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extensionDlgLayout.createSequentialGroup()
                .addGroup(extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extensionDlgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldDateLbl)
                            .addComponent(newDateLbl))
                        .addGap(23, 23, 23)
                        .addGroup(extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldDateDP, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                    .addGroup(extensionDlgLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Extendsbtn)))
                .addContainerGap())
        );
        extensionDlgLayout.setVerticalGroup(
            extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extensionDlgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldDateLbl)
                    .addComponent(oldDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(extensionDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newDateLbl)
                    .addComponent(newDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Extendsbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(resourceMap.getString("Staff.title")); // NOI18N
        setName("Staff"); // NOI18N

        logoutBtn.setIcon(resourceMap.getIcon("logoutBtn.icon")); // NOI18N
        logoutBtn.setText(resourceMap.getString("logoutBtn.text")); // NOI18N
        logoutBtn.setName("logoutBtn"); // NOI18N

        tabPanel.setName("tabPanel"); // NOI18N

        returnPanel.setName("returnPanel"); // NOI18N

        carSearchPanel1.setName("carSearchPanel1"); // NOI18N

        refCodeLbl2.setText(resourceMap.getString("refCodeLbl2.text")); // NOI18N
        refCodeLbl2.setName("refCodeLbl2"); // NOI18N

        surnameLbl2.setText(resourceMap.getString("surnameLbl2.text")); // NOI18N
        surnameLbl2.setName("surnameLbl2"); // NOI18N

        plateLbl3.setText(resourceMap.getString("plateLbl3.text")); // NOI18N
        plateLbl3.setName("plateLbl3"); // NOI18N

        refCodeTxt2.setName("refCodeTxt2"); // NOI18N

        surnameTxt2.setName("surnameTxt2"); // NOI18N

        plateTxt3.setName("plateTxt3"); // NOI18N

        clearBtn5.setIcon(resourceMap.getIcon("clearBtn5.icon")); // NOI18N
        clearBtn5.setText(resourceMap.getString("clearBtn5.text")); // NOI18N
        clearBtn5.setName("clearBtn5"); // NOI18N

        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/view/resources/return.png"))); // NOI18N
        returnBtn.setText(resourceMap.getString("returnBtn.text")); // NOI18N
        returnBtn.setName("returnBtn"); // NOI18N

        extendsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/view/resources/add.png"))); // NOI18N
        extendsBtn.setText(resourceMap.getString("extendsBtn.text")); // NOI18N
        extendsBtn.setName("extendsBtn"); // NOI18N

        javax.swing.GroupLayout carSearchPanel1Layout = new javax.swing.GroupLayout(carSearchPanel1);
        carSearchPanel1.setLayout(carSearchPanel1Layout);
        carSearchPanel1Layout.setHorizontalGroup(
            carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carSearchPanel1Layout.createSequentialGroup()
                .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carSearchPanel1Layout.createSequentialGroup()
                        .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surnameLbl2)
                            .addComponent(refCodeLbl2)
                            .addComponent(plateLbl3))
                        .addGap(18, 18, 18)
                        .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plateTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(surnameTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(refCodeTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                    .addComponent(clearBtn5)
                    .addComponent(returnBtn)
                    .addComponent(extendsBtn))
                .addContainerGap())
        );
        carSearchPanel1Layout.setVerticalGroup(
            carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carSearchPanel1Layout.createSequentialGroup()
                .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refCodeLbl2)
                    .addComponent(refCodeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLbl2)
                    .addComponent(surnameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carSearchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plateLbl3)
                    .addComponent(plateTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(clearBtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extendsBtn))
        );

        jScrollPane9.setName("jScrollPane9"); // NOI18N

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jXTable1.setColumnSelectionAllowed(true);
        jXTable1.setName("jXTable1"); // NOI18N
        jXTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jXTable1);

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carSearchPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addComponent(carSearchPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabPanel.addTab("Return and extend", returnPanel);

        hirePanel.setName("hirePanel"); // NOI18N

        hireBtn.setIcon(resourceMap.getIcon("hireBtn.icon")); // NOI18N
        hireBtn.setText(resourceMap.getString("hireBtn.text")); // NOI18N
        hireBtn.setName("hireBtn"); // NOI18N

        personPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        personPanel.setName("personPanel"); // NOI18N

        hirePersonLoadBtn.setIcon(resourceMap.getIcon("hirePersonLoadBtn.icon")); // NOI18N
        hirePersonLoadBtn.setText(resourceMap.getString("hirePersonLoadBtn.text")); // NOI18N
        hirePersonLoadBtn.setEnabled(false);
        hirePersonLoadBtn.setName("hirePersonLoadBtn"); // NOI18N

        hireNameLbl.setText(resourceMap.getString("hireNameLbl.text")); // NOI18N
        hireNameLbl.setName("hireNameLbl"); // NOI18N

        hireNameTxt.setName("hireNameTxt"); // NOI18N

        hireSurnameLbl.setText(resourceMap.getString("hireSurnameLbl.text")); // NOI18N
        hireSurnameLbl.setName("hireSurnameLbl"); // NOI18N

        hireSurnameTxt.setName("hireSurnameTxt"); // NOI18N

        hireDateOfBirthLbl.setText(resourceMap.getString("hireDateOfBirthLbl.text")); // NOI18N
        hireDateOfBirthLbl.setName("hireDateOfBirthLbl"); // NOI18N

        hireDateOfBirthDP.setName("hireDateOfBirthDP"); // NOI18N

        hireEmailLbl.setText(resourceMap.getString("hireEmailLbl.text")); // NOI18N
        hireEmailLbl.setName("hireEmailLbl"); // NOI18N

        hireEmailTxt.setName("hireEmailTxt"); // NOI18N

        hirePhoneLbl.setText(resourceMap.getString("hirePhoneLbl.text")); // NOI18N
        hirePhoneLbl.setName("hirePhoneLbl"); // NOI18N

        hirePhoneTxt.setName("hirePhoneTxt"); // NOI18N

        hireAddressLbl.setText(resourceMap.getString("hireAddressLbl.text")); // NOI18N
        hireAddressLbl.setName("hireAddressLbl"); // NOI18N

        jScrollPane7.setName("jScrollPane7"); // NOI18N

        hireAddressTxt.setColumns(20);
        hireAddressTxt.setRows(5);
        hireAddressTxt.setName("hireAddressTxt"); // NOI18N
        jScrollPane7.setViewportView(hireAddressTxt);

        javax.swing.GroupLayout personPanelLayout = new javax.swing.GroupLayout(personPanel);
        personPanel.setLayout(personPanelLayout);
        personPanelLayout.setHorizontalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hirePersonLoadBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hireNameLbl)
                            .addComponent(hireSurnameLbl)
                            .addComponent(hireEmailLbl)
                            .addComponent(hirePhoneLbl)
                            .addComponent(hireAddressLbl)
                            .addComponent(hireDateOfBirthLbl))
                        .addGap(35, 35, 35)
                        .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(hireNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(hireSurnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(hireDateOfBirthDP, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(hirePhoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(hireEmailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))))
                .addContainerGap())
        );
        personPanelLayout.setVerticalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hirePersonLoadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireNameLbl)
                    .addComponent(hireNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireSurnameLbl)
                    .addComponent(hireSurnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireDateOfBirthLbl)
                    .addComponent(hireDateOfBirthDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireEmailLbl)
                    .addComponent(hireEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hirePhoneLbl)
                    .addComponent(hirePhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hireAddressLbl)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap())
        );

        carPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carPanel1.setName("carPanel1"); // NOI18N

        hireFromLbl.setText(resourceMap.getString("hireFromLbl.text")); // NOI18N
        hireFromLbl.setName("hireFromLbl"); // NOI18N

        hireFromDP.setName("hireFromDP"); // NOI18N

        hireToLbl.setText(resourceMap.getString("hireToLbl.text")); // NOI18N
        hireToLbl.setName("hireToLbl"); // NOI18N

        hireToDP.setName("hireToDP"); // NOI18N

        hireClassLbl.setText(resourceMap.getString("hireClassLbl.text")); // NOI18N
        hireClassLbl.setName("hireClassLbl"); // NOI18N

        hireClassCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hireClassCB.setName("hireClassCB"); // NOI18N

        hireChauffeuredCB.setText(resourceMap.getString("hireChauffeuredCB.text")); // NOI18N
        hireChauffeuredCB.setName("hireChauffeuredCB"); // NOI18N

        jScrollPane8.setName("jScrollPane8"); // NOI18N

        hireTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        hireTbl.setName("hireTbl"); // NOI18N
        jScrollPane8.setViewportView(hireTbl);

        hireRefCodeLbl.setText(resourceMap.getString("hireRefCodeLbl.text")); // NOI18N
        hireRefCodeLbl.setName("hireRefCodeLbl"); // NOI18N

        hireRefCodeTxt.setName("hireRefCodeTxt"); // NOI18N

        hireRefCodeSearchBtn.setIcon(resourceMap.getIcon("hireRefCodeSearchBtn.icon")); // NOI18N
        hireRefCodeSearchBtn.setText(resourceMap.getString("hireRefCodeSearchBtn.text")); // NOI18N
        hireRefCodeSearchBtn.setName("hireRefCodeSearchBtn"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        hireInsuranceCB.setText(resourceMap.getString("hireInsuranceCB.text")); // NOI18N
        hireInsuranceCB.setName("hireInsuranceCB"); // NOI18N

        javax.swing.GroupLayout carPanel1Layout = new javax.swing.GroupLayout(carPanel1);
        carPanel1.setLayout(carPanel1Layout);
        carPanel1Layout.setHorizontalGroup(
            carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hireRefCodeLbl)
                .addGap(18, 18, 18)
                .addComponent(hireRefCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(hireRefCodeSearchBtn)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(carPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                    .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, carPanel1Layout.createSequentialGroup()
                            .addComponent(hireToLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hireToDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, carPanel1Layout.createSequentialGroup()
                            .addComponent(hireFromLbl)
                            .addGap(18, 18, 18)
                            .addComponent(hireFromDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(carPanel1Layout.createSequentialGroup()
                        .addComponent(hireClassLbl)
                        .addGap(18, 18, 18)
                        .addComponent(hireClassCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hireChauffeuredCB)
                        .addGap(18, 18, 18)
                        .addComponent(hireInsuranceCB)))
                .addContainerGap())
        );
        carPanel1Layout.setVerticalGroup(
            carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireRefCodeSearchBtn)
                    .addComponent(hireRefCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireRefCodeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireFromLbl)
                    .addComponent(hireFromDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireToLbl)
                    .addComponent(hireToDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(carPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireClassLbl)
                    .addComponent(hireClassCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireChauffeuredCB)
                    .addComponent(hireInsuranceCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        hireClearBtn.setIcon(resourceMap.getIcon("hireClearBtn.icon")); // NOI18N
        hireClearBtn.setText(resourceMap.getString("hireClearBtn.text")); // NOI18N
        hireClearBtn.setName("hireClearBtn"); // NOI18N

        javax.swing.GroupLayout hirePanelLayout = new javax.swing.GroupLayout(hirePanel);
        hirePanel.setLayout(hirePanelLayout);
        hirePanelLayout.setHorizontalGroup(
            hirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hirePanelLayout.createSequentialGroup()
                .addGroup(hirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hirePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hirePanelLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(hireClearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(hireBtn)))
                .addContainerGap())
        );
        hirePanelLayout.setVerticalGroup(
            hirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hirePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(hirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireBtn)
                    .addComponent(hireClearBtn))
                .addContainerGap())
        );

        tabPanel.addTab("Hire", hirePanel);

        usernameLbl.setIcon(resourceMap.getIcon("usernameLbl.icon")); // NOI18N
        usernameLbl.setText(resourceMap.getString("usernameLbl.text")); // NOI18N
        usernameLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usernameLbl.setName("usernameLbl"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(usernameLbl)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn))
            .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(usernameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new StaffView().setVisible(true);
            }
        });
    }

    public javax.swing.JButton getLogoutBtn() {
        return logoutBtn;
    }

    /**
     * @return the hireAddressTxt
     */
    public javax.swing.JTextArea getHireAddressTxt() {
        return hireAddressTxt;
    }

    /**
     * @return the hireBtn
     */
    public javax.swing.JButton getHireBtn() {
        return hireBtn;
    }

    /**
     * @return the hireChauffeuredCB
     */
    public javax.swing.JCheckBox getHireChauffeuredCB() {
        return hireChauffeuredCB;
    }

    /**
     * @return the hireClassCB
     */
    public javax.swing.JComboBox getHireClassCB() {
        return hireClassCB;
    }

    /**
     * @return the hireClearBtn
     */
    public javax.swing.JButton getHireClearBtn() {
        return hireClearBtn;
    }

    /**
     * @return the hireDateOfBirthDP
     */
    public org.jdesktop.swingx.JXDatePicker getHireDateOfBirthDP() {
        return hireDateOfBirthDP;
    }

    /**
     * @return the hireEmailTxt
     */
    public javax.swing.JTextField getHireEmailTxt() {
        return hireEmailTxt;
    }

    /**
     * @return the hireFromDP
     */
    public org.jdesktop.swingx.JXDatePicker getHireFromDP() {
        return hireFromDP;
    }

    /**
     * @return the hireInsuranceCB
     */
    public javax.swing.JCheckBox getHireInsuranceCB() {
        return hireInsuranceCB;
    }

    /**
     * @return the hireNameTxt
     */
    public javax.swing.JTextField getHireNameTxt() {
        return hireNameTxt;
    }

    /**
     * @return the hirePersonLoadBtn
     */
    public javax.swing.JButton getHirePersonLoadBtn() {
        return hirePersonLoadBtn;
    }

    /**
     * @return the hirePhoneTxt
     */
    public javax.swing.JTextField getHirePhoneTxt() {
        return hirePhoneTxt;
    }

    /**
     * @return the hireRefCodeSearchBtn
     */
    public javax.swing.JButton getHireRefCodeSearchBtn() {
        return hireRefCodeSearchBtn;
    }

    /**
     * @return the hireRefCodeTxt
     */
    public javax.swing.JTextField getHireRefCodeTxt() {
        return hireRefCodeTxt;
    }

    /**
     * @return the hireSurnameTxt
     */
    public javax.swing.JTextField getHireSurnameTxt() {
        return hireSurnameTxt;
    }

    /**
     * @return the hireTbl
     */
    public org.jdesktop.swingx.JXTable getHireTbl() {
        return hireTbl;
    }

    /**
     * @return the hireToDP
     */
    public org.jdesktop.swingx.JXDatePicker getHireToDP() {
        return hireToDP;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Extendsbtn;
    private javax.swing.JPanel carPanel1;
    private javax.swing.JPanel carSearchPanel1;
    private javax.swing.JButton clearBtn5;
    private javax.swing.JButton extendsBtn;
    private javax.swing.JDialog extensionDlg;
    private javax.swing.JLabel hireAddressLbl;
    private javax.swing.JTextArea hireAddressTxt;
    private javax.swing.JButton hireBtn;
    private javax.swing.JCheckBox hireChauffeuredCB;
    private javax.swing.JComboBox hireClassCB;
    private javax.swing.JLabel hireClassLbl;
    private javax.swing.JButton hireClearBtn;
    private org.jdesktop.swingx.JXDatePicker hireDateOfBirthDP;
    private javax.swing.JLabel hireDateOfBirthLbl;
    private javax.swing.JLabel hireEmailLbl;
    private javax.swing.JTextField hireEmailTxt;
    private org.jdesktop.swingx.JXDatePicker hireFromDP;
    private javax.swing.JLabel hireFromLbl;
    private javax.swing.JCheckBox hireInsuranceCB;
    private javax.swing.JLabel hireNameLbl;
    private javax.swing.JTextField hireNameTxt;
    private javax.swing.JPanel hirePanel;
    private javax.swing.JButton hirePersonLoadBtn;
    private javax.swing.JLabel hirePhoneLbl;
    private javax.swing.JTextField hirePhoneTxt;
    private javax.swing.JLabel hireRefCodeLbl;
    private javax.swing.JButton hireRefCodeSearchBtn;
    private javax.swing.JTextField hireRefCodeTxt;
    private javax.swing.JLabel hireSurnameLbl;
    private javax.swing.JTextField hireSurnameTxt;
    private org.jdesktop.swingx.JXTable hireTbl;
    private org.jdesktop.swingx.JXDatePicker hireToDP;
    private javax.swing.JLabel hireToLbl;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JButton logoutBtn;
    private org.jdesktop.swingx.JXDatePicker newDateDP;
    private javax.swing.JLabel newDateLbl;
    private org.jdesktop.swingx.JXDatePicker oldDateDP;
    private javax.swing.JLabel oldDateLbl;
    private javax.swing.JPanel personPanel;
    private javax.swing.JLabel plateLbl3;
    private javax.swing.JTextField plateTxt3;
    private javax.swing.JLabel refCodeLbl2;
    private javax.swing.JTextField refCodeTxt2;
    private javax.swing.JButton returnBtn;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel surnameLbl2;
    private javax.swing.JTextField surnameTxt2;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
