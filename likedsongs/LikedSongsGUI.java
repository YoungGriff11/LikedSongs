/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package likedsongs;

import javax.swing.JOptionPane;

/**
 *
 * @author conor
 */
public class LikedSongsGUI extends javax.swing.JFrame {

    /**
     * Creates new form LikedSongsGUI
     */
    LikedSongsIF2 songs;
    private LikedSongsIF genreA, genreB;

    public LikedSongsGUI() {
        initComponents();
        songs = new LikedSongs();
        genreA = new Genre();
        genreB = new genreB();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryLBL = new javax.swing.JLabel();
        entryTF = new javax.swing.JTextField();
        genreLBL = new javax.swing.JLabel();
        genreTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lkdSgTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rapGnrTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        popGnrTA = new javax.swing.JTextArea();
        addBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        dltBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        dspBTN = new javax.swing.JButton();
        rpBTN = new javax.swing.JButton();
        xitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entryLBL.setText("Enter Song:");

        entryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryTFActionPerformed(evt);
            }
        });

        genreLBL.setText("Song Genre:");

        lkdSgTA.setColumns(20);
        lkdSgTA.setRows(5);
        jScrollPane1.setViewportView(lkdSgTA);

        rapGnrTA.setColumns(20);
        rapGnrTA.setRows(5);
        jScrollPane2.setViewportView(rapGnrTA);

        popGnrTA.setColumns(20);
        popGnrTA.setRows(5);
        jScrollPane3.setViewportView(popGnrTA);

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        dltBTN.setText("Delete");
        dltBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBTNActionPerformed(evt);
            }
        });

        moveBTN.setText("Move");
        moveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBTNActionPerformed(evt);
            }
        });

        dspBTN.setText("Display");
        dspBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspBTNActionPerformed(evt);
            }
        });

        rpBTN.setText("Repeat");
        rpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpBTNActionPerformed(evt);
            }
        });

        xitBTN.setText("Exit");
        xitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(entryLBL)
                            .addGap(18, 18, 18)
                            .addComponent(entryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(addBTN)
                    .addComponent(moveBTN))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(genreLBL)
                            .addGap(18, 18, 18)
                            .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(searchBTN)
                    .addComponent(dspBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dltBTN)
                    .addComponent(rpBTN))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(xitBTN)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryLBL)
                    .addComponent(entryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreLBL)
                    .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(searchBTN)
                    .addComponent(dltBTN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveBTN)
                    .addComponent(dspBTN)
                    .addComponent(rpBTN))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryTFActionPerformed

    private void dltBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBTNActionPerformed
        // TODO add your handling code here:

        /*if (songs == null) {
            songs = new LikedSongs();
        }*/
        if (songs.isEmpty()) {
            lkdSgTA.append("There are no songs to be removed!\n");
        } else {
            String songsRemoved = (String) songs.pop();
            lkdSgTA.append("The song " + songsRemoved + " was removed!\n");
        }

        if (genreA.isEmpty()) {
            rapGnrTA.append("There are no songs to be removed!\n");
        } else {
            String songsRemoved = (String) genreA.dequeue();
            rapGnrTA.append("The song " + songsRemoved + " was removed!\n");
        }

        if (genreB.isEmpty()) {
            popGnrTA.append("There are no songs to be removed!\n");
        } else {
            String songsRemoved = (String) genreB.dequeue();
            popGnrTA.append("The song " + songsRemoved + " was removed!\n");
        }
    }//GEN-LAST:event_dltBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        //This adds to liked Songs playlist not genreA/B
        String name;
        // Adding the song to the new instance of LikedSongs
        name = entryTF.getText();
        songs.push(name);
        lkdSgTA.append("The song " + name + " was added to the liked song playlist!\n");
    }//GEN-LAST:event_addBTNActionPerformed

    private void moveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBTNActionPerformed
        // TODO add your handling code here:
        //This will move songs from liked Songs to either genreA/B
        // This will only move 1 song at a time, so if you add two songs 1 rap, 1 pop it will move both to one playlist, add 1 than move than add again
        if (songs.isEmpty()) {
            lkdSgTA.append("There are no songs to move!\n");
        } else {
            // Get the song to move
            String songToMove = (String) songs.pop();

            // Get the genre from the genreTF text field
            String genre = genreTF.getText().trim().toLowerCase(); // Convert to lowercase for case-insensitive

            // Check if the selected genre is rap or pop
            if ("rap".equals(genre)) {
                genreA.enqueue(songToMove);
                rapGnrTA.append("The song '" + songToMove + "' was moved to rap playlist!\n");
            } else if ("pop".equals(genre)) {
                genreB.enqueue(songToMove);
                popGnrTA.append("The song '" + songToMove + "' was moved to pop playlist!\n");
            } else {
                lkdSgTA.append("Invalid genre! Please enter 'rap' or 'pop'.\n");
            }
        }


    }//GEN-LAST:event_moveBTNActionPerformed

    private void dspBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspBTNActionPerformed
        // TODO add your handling code here:
        //This will display the playlist in its TA
        rapGnrTA.append("There are " + genreA.size() + " songs in playlist\n");
        popGnrTA.append("There are " + genreB.size() + " songs in playlist\n");

        String songsInfo = songs.displayStack();

// Append the string to the text area
        lkdSgTA.append(songsInfo + "\n");

    }//GEN-LAST:event_dspBTNActionPerformed

    private void xitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xitBTNActionPerformed
        // TODO add your handling code here:
        //Closes system
        System.exit(0);
    }//GEN-LAST:event_xitBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:     
        songs.searchSong();

    }//GEN-LAST:event_searchBTNActionPerformed

    private void rpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpBTNActionPerformed
        // TODO add your handling code here: FIX!!!!

        lkdSgTA.append("Repeat the playlist\n");
        int originalSize = songs.size();
        int totalCount = originalSize * 2;
        int count = 0;

        var tempSongs = new java.util.ArrayList<String>();

        while (count < totalCount) {
            String song = (String) songs.pop();

            lkdSgTA.append((count + 1) + ". " + song + "\n");


            tempSongs.add(song);

            if (count == originalSize - 1 || count == totalCount - 1) {
                for (String tempSong : tempSongs) {
                    songs.push(tempSong);
                }
                tempSongs.clear();
            }
            count++;
        }


    }//GEN-LAST:event_rpBTNActionPerformed

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
    private javax.swing.JButton dspBTN;
    private javax.swing.JLabel entryLBL;
    private javax.swing.JTextField entryTF;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JTextField genreTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea lkdSgTA;
    private javax.swing.JButton moveBTN;
    private javax.swing.JTextArea popGnrTA;
    private javax.swing.JTextArea rapGnrTA;
    private javax.swing.JButton rpBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton xitBTN;
    // End of variables declaration//GEN-END:variables
//This is to create the temp song for the repeat function
    private static class ArrayList<T> {

        public ArrayList() {
        }
//create by the lightbulb for the add function for tempSongs

        private void add(String song) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
//create by the lightbulb for the clear function for tempSongs

        private void clear() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
