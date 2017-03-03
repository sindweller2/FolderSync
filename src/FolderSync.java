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

public class FolderSync extends javax.swing.JFrame
{

    public Class Class = new Class();

    /**
     * Creates new form FolderSync
     */
    public FolderSync()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jSourceDirectoryTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDestinationDirectoryTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSourceDirectoryButton = new javax.swing.JButton();
        jDestinationDirectoryButton = new javax.swing.JButton();
        jSyncButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Folder Sync");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 110));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSourceDirectoryTextField.setEditable(false);

        jLabel1.setText("Source Directory:");

        jDestinationDirectoryTextField.setEditable(false);

        jLabel2.setText("Destination Directory:");

        jSourceDirectoryButton.setText("...");
        jSourceDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSourceDirectoryButtonActionPerformed(evt);
            }
        });

        jDestinationDirectoryButton.setText("...");
        jDestinationDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDestinationDirectoryButtonActionPerformed(evt);
            }
        });

        jSyncButton.setText("Sync");
        jSyncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSyncButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDestinationDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDestinationDirectoryButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSourceDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSourceDirectoryButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(680, Short.MAX_VALUE)
                        .addComponent(jSyncButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSourceDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSourceDirectoryButton))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDestinationDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDestinationDirectoryButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jSyncButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            Class.ReadConfig(jSourceDirectoryTextField, jDestinationDirectoryTextField);
            this.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2);
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
            Class.SetFolderLocation(jFileChooser, jDestinationDirectoryTextField);
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
            Class.Sync(jSourceDirectoryTextField, jDestinationDirectoryTextField);
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
            Class.WriteConfig(jSourceDirectoryTextField, jDestinationDirectoryTextField);
        }
        catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton jDestinationDirectoryButton;
    private javax.swing.JTextField jDestinationDirectoryTextField;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSourceDirectoryButton;
    private javax.swing.JTextField jSourceDirectoryTextField;
    private javax.swing.JButton jSyncButton;
    // End of variables declaration//GEN-END:variables
}
