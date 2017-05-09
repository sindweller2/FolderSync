/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * FolderSync.java
 *
 * Created on Oct 31, 2011, 3:55:53 PM
 */
package FolderSync;

import java.awt.Desktop;

public class FolderSync extends javax.swing.JFrame
{

    public Class Class = new Class();

    public String SyncType;

    /**
     * Creates new form FolderSync
     */
    public FolderSync()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jFileChooser = new javax.swing.JFileChooser();
        jSourceDirectoryTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDestinationDirectoryTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSourceDirectoryButton = new javax.swing.JButton();
        jDestinationDirectoryButton = new javax.swing.JButton();
        jSyncButton = new javax.swing.JButton();
        jButtonOpenLog = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSyncType = new javax.swing.JComboBox<>();
        jCheckBoxDateModified = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Folder Sync");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 110));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jSourceDirectoryTextField.setEditable(false);

        jLabel1.setText("Source Directory :");

        jDestinationDirectoryTextField.setEditable(false);

        jLabel2.setText("Destination Directory :");

        jSourceDirectoryButton.setText("...");
        jSourceDirectoryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jSourceDirectoryButtonActionPerformed(evt);
            }
        });

        jDestinationDirectoryButton.setText("...");
        jDestinationDirectoryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jDestinationDirectoryButtonActionPerformed(evt);
            }
        });

        jSyncButton.setText("Sync");
        jSyncButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jSyncButtonActionPerformed(evt);
            }
        });

        jButtonOpenLog.setText("Open Log");
        jButtonOpenLog.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOpenLogActionPerformed(evt);
            }
        });

        jLabel3.setText("Sync Type :");
        jLabel3.setToolTipText("");

        jComboBoxSyncType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One Way", "Two Way" }));

        jCheckBoxDateModified.setLabel("Date Modified");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDestinationDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDestinationDirectoryButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSourceDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSourceDirectoryButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxSyncType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxDateModified)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOpenLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSyncButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSourceDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSourceDirectoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDestinationDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jDestinationDirectoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSyncType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxDateModified)
                    .addComponent(jLabel3)
                    .addComponent(jSyncButton)
                    .addComponent(jButtonOpenLog))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            Class.ReadConfig(jSourceDirectoryTextField, jDestinationDirectoryTextField);
//            this.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2);
        }
        catch (Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jSourceDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jSourceDirectoryButtonActionPerformed
    {//GEN-HEADEREND:event_jSourceDirectoryButtonActionPerformed
        try
        {
            Class.SetFolderLocation(jFileChooser, jSourceDirectoryTextField);
        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jSourceDirectoryButtonActionPerformed

    private void jDestinationDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jDestinationDirectoryButtonActionPerformed
    {//GEN-HEADEREND:event_jDestinationDirectoryButtonActionPerformed
        try
        {
            this.Class.SetFolderLocation(jFileChooser, jDestinationDirectoryTextField);
        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jDestinationDirectoryButtonActionPerformed

    private void jSyncButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jSyncButtonActionPerformed
    {//GEN-HEADEREND:event_jSyncButtonActionPerformed
        try
        {
            this.SyncType = "";

            this.setEnabled(false);

            if (this.jComboBoxSyncType.getSelectedIndex() == 0)
            {
                this.SyncType = "1";
                this.Class.Sync(this.jSourceDirectoryTextField, this.jDestinationDirectoryTextField, this.SyncType, this.jCheckBoxDateModified.isSelected());
            }
            else if (this.jComboBoxSyncType.getSelectedIndex() == 1)
            {
                this.SyncType = "2";
                this.Class.Sync(this.jSourceDirectoryTextField, this.jDestinationDirectoryTextField, this.SyncType, this.jCheckBoxDateModified.isSelected());
                this.Class.Sync(this.jDestinationDirectoryTextField, this.jSourceDirectoryTextField, this.SyncType, this.jCheckBoxDateModified.isSelected());
            } 

            javax.swing.JOptionPane.showMessageDialog(null, "Folder Synchronized!");
            
            this.setEnabled(true);

        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jSyncButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        try
        {
            this.Class.WriteConfig(jSourceDirectoryTextField, jDestinationDirectoryTextField);
        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonOpenLogActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOpenLogActionPerformed
    {//GEN-HEADEREND:event_jButtonOpenLogActionPerformed
        try
        {
            java.io.File File = new java.io.File("report.log");
            Desktop.getDesktop().open(File);
        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonOpenLogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FolderSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FolderSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FolderSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FolderSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FolderSync().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpenLog;
    private javax.swing.JCheckBox jCheckBoxDateModified;
    private javax.swing.JComboBox<String> jComboBoxSyncType;
    private javax.swing.JButton jDestinationDirectoryButton;
    private javax.swing.JTextField jDestinationDirectoryTextField;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jSourceDirectoryButton;
    private javax.swing.JTextField jSourceDirectoryTextField;
    private javax.swing.JButton jSyncButton;
    // End of variables declaration//GEN-END:variables
}