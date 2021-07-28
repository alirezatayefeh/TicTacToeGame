import java.awt.Color;
import javax.swing.*;

public class PlayWithRobot extends JFrame {

    JButton[] button;
    int scorePlayer = 0;
    int scoreRobot = 0;

    public PlayWithRobot() {
        initComponents();
        button = new JButton[9];
        button[0] = btn1;
        button[1] = btn2;
        button[2] = btn3;
        button[3] = btn4;
        button[4] = btn5;
        button[5] = btn6;
        button[6] = btn7;
        button[7] = btn8;
        button[8] = btn9;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        lblHumanName = new JLabel();
        lblScoreHuman = new JLabel();
        lblScoreRobot = new JLabel();
        jPanel2 = new JPanel();
        btn1 = new JButton();
        btn3 = new JButton();
        btn2 = new JButton();
        btn5 = new JButton();
        btn4 = new JButton();
        btn6 = new JButton();
        btn8 = new JButton();
        btn7 = new JButton();
        btn9 = new JButton();
        lblStatus = new JLabel();
        btnResetGane = new JButton();
        btnBack = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Robot");

        lblHumanName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHumanName.setHorizontalAlignment(SwingConstants.CENTER);
        lblHumanName.setText("Player");

        lblScoreHuman.setBackground(new Color(255, 51, 0));
        lblScoreHuman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblScoreHuman.setHorizontalAlignment(SwingConstants.CENTER);
        lblScoreHuman.setText("0");

        lblScoreRobot.setBackground(new Color(0, 0, 204));
        lblScoreRobot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblScoreRobot.setHorizontalAlignment(SwingConstants.CENTER);
        lblScoreRobot.setText("0");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(lblScoreHuman, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblScoreRobot, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblHumanName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(352, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                .addComponent(lblScoreRobot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblScoreHuman, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblHumanName, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jPanel2.setBackground(new Color(102, 204, 0));

        btn1.setBackground(new Color(255, 255, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn3.setBackground(new Color(255, 255, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn2.setBackground(new Color(255, 255, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn5.setBackground(new Color(255, 255, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn4.setBackground(new Color(255, 255, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn6.setBackground(new Color(255, 255, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn8.setBackground(new Color(255, 255, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn7.setBackground(new Color(255, 255, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        btn9.setBackground(new Color(255, 255, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellAction(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);

        btnResetGane.setBackground(new Color(255, 102, 153));
        btnResetGane.setText("Reset_Game");
        btnResetGane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetGaneActionPerformed(evt);
            }
        });

        btnBack.setBackground(new Color(102, 102, 255));
        btnBack.setText("Go To Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnResetGane, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnResetGane, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnBack))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String player = "X";
    private String robot = "O";

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Second_Frame aa = new Second_Frame();
        this.setVisible(false);
        aa.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void CellAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellAction
        JButton btn = (JButton) evt.getSource();

        if (!(lblStatus.getText().isEmpty())) {
            return;
        }


        int[] cell = new int[9];
        if (!btn.getText().isEmpty()) {
            return;
        }
        btn.setText(player);
        cell = vaziat();

        if (isWinner(cell, 1)) {
            lblStatus.setText("Player(X) Win.");
            scorePlayer++;
            lblScoreHuman.setText(String.valueOf(scorePlayer));
            lblScoreHuman.setBackground(Color.RED);
        } else if (isBoardFull(cell)) {
            lblStatus.setText("Draw Game.");
        } else {
            //Move Robot
            int move = moveRobot(cell);
            if (move != -1) {
                button[move].setText(robot);
            }

            cell = vaziat();

            if (isWinner(cell, 2)) {
                lblStatus.setText("Robot(O) Win.");
                scoreRobot++;
                lblScoreRobot.setText(String.valueOf(scoreRobot));
                lblScoreRobot.setBackground(Color.BLUE);
            } else {
                if (isBoardFull(cell)) {
                    lblStatus.setText("Draw Game.");
                }
            }

        }

    }//GEN-LAST:event_CellAction

    private void btnResetGaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetGaneActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetGaneActionPerformed

    ///////////////////////////////////////////////////////////////
    public int[] vaziat() {
        int[] c = new int[9];

        for (int i = 0; i < 9; i++) {
            c[i] = 0;
            if (button[i].getText().equals("X")) {
                c[i] = 1;
            }
            if (button[i].getText().equals("O")) {
                c[i] = 2;
            }
            if (button[i].getText().equals("")) {
                c[i] = 0;
            }
        }

        return c;
    }

    //////////////////////////////////////////////////////////////////////
    public boolean isWinner(int[] c, int p) {
        if (c[0] == p && c[1] == p && c[2] == p) {

            return true;
        } else if (c[3] == p && c[4] == p && c[5] == p) {

            return true;
        } else if (c[6] == p && c[7] == p && c[8] == p) {

            return true;
        } else if (c[0] == p && c[3] == p && c[6] == p) {

            return true;
        } else if (c[1] == p && c[4] == p && c[7] == p) {

            return true;
        } else if (c[2] == p && c[5] == p && c[8] == p) {

            return true;
        } else if (c[0] == p && c[4] == p && c[8] == p) {

            return true;
        } else if (c[2] == p && c[4] == p && c[6] == p) {

            return true;
        } else {

            return false;
        }
    }

    //////////////////////////////////////////////////////////
    public boolean isBoardFull(int[] c) {
        for (int i = 0; i < 9; i++) {
            if (c[i] == 0) {
                return false;
            }
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////
    public int[] getBoardCopy(int[] c) {
        int[] doupeBoard = new int[c.length];

        for (int k = 0; k < c.length; k++) {
            doupeBoard[k] = c[k];
        }
        return doupeBoard;
    }

    //////////////////////////////////////////////////////////////////////////
    public int moveRobot(int[] c) {
        int[] corners = {0, 2, 6, 8};
        int[] sides = {1, 3, 5, 7};

        for (int i = 0; i < 9; i++) {
            int[] copy = getBoardCopy(c);
            if (copy[i] == 0) {
                copy[i] = 2;
                if (isWinner(copy, 2)) {
                    return i;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int[] copy = getBoardCopy(c);
            if (copy[i] == 0) {
                copy[i] = 1;
                if (isWinner(copy, 1)) {
                    return i;
                }
            }
        }
        if (c[4] == 0) {
            return 4;
        }

        for (int k = 0; k < sides.length; k++) {
            int xx = 0;
            xx = sides[k];
            if (c[xx] == 0) {
                return xx;
            }
        }


        for (int k = 0; k < corners.length; k++) {
            int xx = 0;
            xx = corners[k];
            if (c[xx] == 0) {
                return xx;
            }
        }


        return -1;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public void Reset() {
        lblStatus.setText("");
        for (JButton btn : button) {
            btn.setText("");
            btn.setBackground(Color.yellow);
        }

    }

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
            java.util.logging.Logger.getLogger(PlayWithRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayWithRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayWithRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayWithRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayWithRobot().setVisible(true);
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
    private JButton btnBack;
    private JButton btnResetGane;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    public JLabel lblHumanName;
    public JLabel lblScoreHuman;
    public JLabel lblScoreRobot;
    private JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
