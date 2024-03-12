/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package likedsongs;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author conor
 */
public class LikedSongsGUI extends javax.swing.JFrame {
    private ArrayList<LikedSongs> songs; //creates new arraylists
    /**
     * Creates new form LikedSongsGUI
     */
    public LikedSongsGUI() {
        initComponents();
        songs = new ArrayList<>();//declare new arraylists
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
        addBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        dltBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        entryTF = new javax.swing.JTextField();
        enterLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        likedSongsTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rapSongsTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        popSongsTA = new javax.swing.JTextArea();
        genreLBL = new javax.swing.JLabel();
        genreTF = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");

        dltBTN.setText("Delete");
        dltBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBTNActionPerformed(evt);
            }
        });

        moveBTN.setText("Move");

        enterLBL.setText("Enter a Song you like:");

        likedSongsTA.setColumns(20);
        likedSongsTA.setRows(5);
        jScrollPane1.setViewportView(likedSongsTA);

        rapSongsTA.setColumns(20);
        rapSongsTA.setRows(5);
        jScrollPane2.setViewportView(rapSongsTA);

        popSongsTA.setColumns(20);
        popSongsTA.setRows(5);
        jScrollPane3.setViewportView(popSongsTA);

        genreLBL.setText("Song genre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBTN)
                        .addGap(18, 18, 18)
                        .addComponent(searchBTN)
                        .addGap(18, 18, 18)
                        .addComponent(dltBTN)
                        .addGap(18, 18, 18)
                        .addComponent(moveBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genreLBL)
                                .addGap(18, 18, 18)
                                .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterLBL)
                    .addComponent(entryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreLBL)
                    .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(searchBTN)
                    .addComponent(dltBTN)
                    .addComponent(moveBTN))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here: fix delete
        LikedSongs ls = new LikedSongs();
        ls.name = entryTF.getText(); //add name of song to array
        ls.genre = genreTF.getText(); //add genre into array
        songs.add(ls); // ads
        likedSongsTA.append(entryTF.getText() + "\n");
    }//GEN-LAST:event_addBTNActionPerformed

    private void dltBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBTNActionPerformed
        // TODO add your handling code here:
        if(songs.isEmpty()){
           JOptionPane.showMessageDialog(null, "Sorry, There is currently no donations");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Please Select a song to delete");
            
            Iterator<LikedSongs> iterator = songs.iterator();
            while (iterator.hasNext()) {
                LikedSongs ls = iterator.next();
        }
            
                if (getName().equals(searchTerm)) {
                    iterator.remove();
                    JOptionPane.showMessageDialog(null, "Song deleted: " + getName());
                }
            
      }
    }//GEN-LAST:event_dltBTNActionPerformed

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
            java.util.logging.Logger.getLogger(LikedSongsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LikedSongsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LikedSongsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LikedSongsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LikedSongsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton dltBTN;
    private javax.swing.JLabel enterLBL;
    private javax.swing.JTextField entryTF;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JTextField genreTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea likedSongsTA;
    private javax.swing.JButton moveBTN;
    private javax.swing.JTextArea popSongsTA;
    private javax.swing.JTextArea rapSongsTA;
    private javax.swing.JButton searchBTN;
    // End of variables declaration//GEN-END:variables
}
