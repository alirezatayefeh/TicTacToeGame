
import java.awt.*;
import javax.swing.*;


public class PlayWithFreind extends JFrame {

    private JButton[] buttons;
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    public PlayWithFreind() {
        initComponents();

        buttons = new JButton[9];

        buttons[0] = btn1;
        buttons[1] = btn2;
        buttons[2] = btn3;
        buttons[3] = btn4;
        buttons[4] = btn5;
        buttons[5] = btn6;
        buttons[6] = btn7;
        buttons[7] = btn8;
        buttons[8] = btn9;
        UpdateStatus();
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn6 = new JButton();
        btn5 = new JButton();
        btn4 = new JButton();
        btn9 = new JButton();
        btn8 = new JButton();
        btn7 = new JButton();
        btnResetGame = new JButton();
        btnBackMenu = new JButton();
        lblName1 = new JLabel();
        lblName2 = new JLabel();
        lblScorePlayer1 = new JLabel();
        lblScorePlayer2 = new JLabel();
        lblStatus = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn1.setBackground(new Color(255, 255, 255));
        btn1.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn2.setBackground(new Color(255, 255, 255));
        btn2.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn3.setBackground(new Color(255, 255, 255));
        btn3.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn6.setBackground(new Color(255, 255, 255));
        btn6.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn5.setBackground(new Color(255, 255, 255));
        btn5.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn4.setBackground(new Color(255, 255, 255));
        btn4.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn9.setBackground(new Color(255, 255, 255));
        btn9.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn8.setBackground(new Color(255, 255, 255));
        btn8.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn7.setBackground(new Color(255, 255, 255));
        btn7.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btnResetGame.setText("Reset_Game");
        btnResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetGameActionPerformed(evt);
            }
        });

        btnBackMenu.setText("Go To Menu");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        lblName1.setHorizontalAlignment(SwingConstants.CENTER);
        lblName1.setText("Player1");

        lblName2.setHorizontalAlignment(SwingConstants.CENTER);
        lblName2.setText("Player2");

        lblScorePlayer1.setHorizontalAlignment(SwingConstants.CENTER);
        lblScorePlayer1.setText("0");

        lblScorePlayer2.setHorizontalAlignment(SwingConstants.CENTER);
        lblScorePlayer2.setText("0");

        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblName1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblScorePlayer1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblScorePlayer2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblName2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(btnResetGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(160, 160, 160)
                                                                .addComponent(btnBackMenu)))
                                                .addGap(0, 73, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblScorePlayer1)
                                        .addComponent(lblScorePlayer2))
                                .addGap(18, 18, 18)
                                .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btnResetGame, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(btnBackMenu))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Second_Frame ss = new Second_Frame();


    private String player = "X";
    private String winner = "";


    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed

        this.setVisible(false);
        ss.setVisible(true);
    }//GEN-LAST:event_btnBackMenuActionPerformed

    private void CellAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellAction
        if (!winner.isEmpty()) return;
        JButton btn = (JButton) evt.getSource();

        if (!btn.getText().isEmpty()) return;
        btn.setText(player);

        if (player.equals("X")) {
            player = "O";
        } else {
            player = "X";
        }
        UpdateStatus();

    }//GEN-LAST:event_CellAction

    private void btnResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetGameActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetGameActionPerformed

    private void Reset() {
        player = "X";
        for (JButton btn : buttons) {
            btn.setText("");

        }

        for (JButton b : buttons) {

            b.setBackground(Color.WHITE);
        }
        UpdateStatus();
    }

    ///////////////////////////////////////////////
    private void UpdateStatus() {
        winner = getWinner();
        String status;

        switch (winner) {
            case "X":
                scorePlayer1 += 1;
                status = "X Win.";
                break;

            case "O":
                scorePlayer2 += 1;
                status = "O Win.";
                break;

            case "D":
                status = "Draw Game.";
                break;

            default:
                status = player + " Round";
        }
        lblStatus.setText(status);

        lblScorePlayer1.setText(String.valueOf(scorePlayer1));
        lblScorePlayer2.setText(String.valueOf(scorePlayer2));
    }

    //////////////////////////////////////
    private String getWinner() {
        int[] c = new int[9];
        int nEmptyCell = 0;

        for (int i = 0; i < 9; i++) {
            c[i] = 0;
            if (buttons[i].getText().equals("X")) c[i] = 1;
            if (buttons[i].getText().equals("O")) c[i] = 2;
            if (c[i] == 0) nEmptyCell++;
        }
        if (isWinner(c, 1)) return "X";
        if (isWinner(c, 2)) return "O";

        return (nEmptyCell > 0) ? "" : "D";
    }

    ////////////////////////////////////////
    private boolean isWinner(int[] c, int p) {
        if (c[0] == p && c[1] == p && c[2] == p) {
            btn1.setBackground(Color.red);
            btn2.setBackground(Color.red);
            btn3.setBackground(Color.red);
            return true;
        }
        if (c[3] == p && c[4] == p && c[5] == p) {
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);

            return true;
        }
        if (c[6] == p && c[7] == p && c[8] == p) {
            btn7.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            return true;
        }

        if (c[0] == p && c[3] == p && c[6] == p) {
            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            return true;
        }
        if (c[1] == p && c[4] == p && c[7] == p) {
            btn2.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            return true;
        }
        if (c[2] == p && c[5] == p && c[8] == p) {
            btn3.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
            return true;
        }

        if (c[0] == p && c[4] == p && c[8] == p) {
            btn1.setBackground(Color.BLUE);
            btn5.setBackground(Color.BLUE);
            btn9.setBackground(Color.BLUE);
            return true;
        }
        if (c[2] == p && c[4] == p && c[6] == p) {
            btn3.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn7.setBackground(Color.blue);
            return true;
        }

        return false;
    }


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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayWithFreind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnBackMenu;
    private JButton btnResetGame;
    public JLabel lblName1;
    public JLabel lblName2;
    private JLabel lblScorePlayer1;
    private JLabel lblScorePlayer2;
    private JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
