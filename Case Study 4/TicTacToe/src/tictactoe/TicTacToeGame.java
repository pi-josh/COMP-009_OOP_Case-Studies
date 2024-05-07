/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldas, Dominic Syd
 * @author Fernandez, Cassidy
 * @author Lafuente, Rafael
 * @author Macatunao, Joshua
 * 
 * @version May 7, 2024
 */
public class TicTacToeGame extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private boolean hasWinner = false;
    
    /**
     * Creates new form TicTacToeGame
     */
    public TicTacToeGame() {
        initComponents();
    }
    
    // This method tallies the score of both players
    private void gameScore(){
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }  
   
    // This method initialize what should be played first
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    
    // This method will prompt the players who won and count their score
    private void winner(char player) {
        if(player == 'X') {
            JOptionPane.showMessageDialog(this, "Player X Won!", "CONGRATULATIONS!", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        } else {
            JOptionPane.showMessageDialog(this, "Player O Won!", "CONGRATULATIONS!", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        
        hasWinner = true;
    }
    
    // This method compiles the winning combination that a player have to achieve
    private void WinningGame(){
        if(!hasWinner) {
            String b1 = txtbtn1.getText();
            String b2 = txtbtn2.getText();
            String b3 = txtbtn3.getText();

            String b4 = txtbtn4.getText();
            String b5 = txtbtn5.getText();
            String b6 = txtbtn6.getText();

            String b7 = txtbtn7.getText();
            String b8 = txtbtn8.getText();
            String b9 = txtbtn9.getText();

            //PLAYER X

            if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
                txtbtn1.setBackground(Color.PINK);
                txtbtn2.setBackground(Color.PINK);
                txtbtn3.setBackground(Color.PINK);
                winner('X');
            } else if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
                txtbtn4.setBackground(Color.PINK);
                txtbtn5.setBackground(Color.PINK);
                txtbtn6.setBackground(Color.PINK);
                winner('X');
            } else if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
                txtbtn7.setBackground(Color.PINK);
                txtbtn8.setBackground(Color.PINK);
                txtbtn9.setBackground(Color.PINK);
                winner('X');
            } else if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
                txtbtn1.setBackground(Color.PINK);
                txtbtn4.setBackground(Color.PINK);
                txtbtn7.setBackground(Color.PINK);
                winner('X');
            } else if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
                txtbtn2.setBackground(Color.PINK);
                txtbtn5.setBackground(Color.PINK);
                txtbtn8.setBackground(Color.PINK);
                winner('X');
            } else if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
                txtbtn3.setBackground(Color.PINK);
                txtbtn6.setBackground(Color.PINK);
                txtbtn9.setBackground(Color.PINK);
                winner('X');
            } else if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
                txtbtn1.setBackground(Color.PINK);
                txtbtn5.setBackground(Color.PINK);
                txtbtn9.setBackground(Color.PINK);
                winner('X');
            } else if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
                txtbtn3.setBackground(Color.PINK);
                txtbtn5.setBackground(Color.PINK);
                txtbtn7.setBackground(Color.PINK);
                winner('X');
            }

            //PLAYER O

            if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
                txtbtn1.setBackground(Color.YELLOW);
                txtbtn2.setBackground(Color.YELLOW);
                txtbtn3.setBackground(Color.YELLOW);
                winner('O');
            } else if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
                txtbtn4.setBackground(Color.YELLOW);
                txtbtn5.setBackground(Color.YELLOW);
                txtbtn6.setBackground(Color.YELLOW);
                winner('O');
            } else if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
                txtbtn4.setBackground(Color.YELLOW);
                txtbtn5.setBackground(Color.YELLOW);
                txtbtn6.setBackground(Color.YELLOW);
                winner('O');
            } else if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
                txtbtn7.setBackground(Color.YELLOW);
                txtbtn8.setBackground(Color.YELLOW);
                txtbtn9.setBackground(Color.YELLOW);
                winner('O');
            } else if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
                txtbtn1.setBackground(Color.YELLOW);
                txtbtn4.setBackground(Color.YELLOW);
                txtbtn7.setBackground(Color.YELLOW);
                winner('O');
            } else if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
                txtbtn2.setBackground(Color.YELLOW);
                txtbtn5.setBackground(Color.YELLOW);
                txtbtn8.setBackground(Color.YELLOW);
                winner('O');
            } else if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
                txtbtn3.setBackground(Color.YELLOW);
                txtbtn6.setBackground(Color.YELLOW);
                txtbtn9.setBackground(Color.YELLOW);
                winner('O');
            } else if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
                txtbtn1.setBackground(Color.YELLOW);
                txtbtn5.setBackground(Color.YELLOW);
                txtbtn9.setBackground(Color.YELLOW);
                winner('O');
            } else if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
                txtbtn3.setBackground(Color.YELLOW);
                txtbtn5.setBackground(Color.YELLOW);
                txtbtn7.setBackground(Color.YELLOW);
                winner('O');
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtnreset = new javax.swing.JButton();
        txtbtnexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        playerxxx = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        playerooo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));

        jLabel1.setBackground(new java.awt.Color(213, 213, 163));
        jLabel1.setFont(new java.awt.Font("Impact", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("TIC-TAC-TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        txtbtnreset.setBackground(new java.awt.Color(204, 204, 255));
        txtbtnreset.setFont(new java.awt.Font("Tahoma", 1, 89)); // NOI18N
        txtbtnreset.setForeground(new java.awt.Color(0, 0, 102));
        txtbtnreset.setText("Reset");
        txtbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtnresetActionPerformed(evt);
            }
        });

        txtbtnexit.setBackground(new java.awt.Color(255, 204, 204));
        txtbtnexit.setFont(new java.awt.Font("Tahoma", 1, 89)); // NOI18N
        txtbtnexit.setForeground(new java.awt.Color(102, 0, 0));
        txtbtnexit.setText("Exit");
        txtbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtnexitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        playero.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 60)); // NOI18N
        playero.setForeground(new java.awt.Color(255, 255, 255));
        playero.setText("PLAYER 2:");

        playerx.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 60)); // NOI18N
        playerx.setForeground(new java.awt.Color(255, 255, 255));
        playerx.setText("PLAYER 1:");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        playerxxx.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 60)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(0, 255, 0));
        playerxxx.setText("x");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerxxx)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerxxx)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        playerooo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 60)); // NOI18N
        playerooo.setForeground(new java.awt.Color(0, 255, 0));
        playerooo.setText("x");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerooo)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerooo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerx)
                    .addComponent(playero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(playerx)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(playero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtbtn2.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn2.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn2.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn3.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn1.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn1.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn7.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn7.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn8.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn8.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn4.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn4.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn6.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn6.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn9.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn9.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(0, 0, 0));
        txtbtn5.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        txtbtn5.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtnresetActionPerformed
        // TODO add your handling code here:
        hasWinner = false;
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.BLACK);
        txtbtn2.setBackground(Color.BLACK);
        txtbtn3.setBackground(Color.BLACK);
        
        txtbtn4.setBackground(Color.BLACK);
        txtbtn5.setBackground(Color.BLACK);
        txtbtn6.setBackground(Color.BLACK);
        
        txtbtn7.setBackground(Color.BLACK);
        txtbtn8.setBackground(Color.BLACK);
        txtbtn9.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtbtnresetActionPerformed

    private void txtbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtnexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Do you really want to quit the game?",
                "DONT LEAVE ME YET ;--;", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);    
        }
    }//GEN-LAST:event_txtbtnexitActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn2.setText(startGame);
        
            if(startGame.equalsIgnoreCase("X")){
                txtbtn2.setForeground(Color.RED);
            } else {
                txtbtn2.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
        txtbtn3.setText(startGame);
        
            if(startGame.equalsIgnoreCase("X")){
                txtbtn3.setForeground(Color.RED);
            } else {
                txtbtn3.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn1.setText(startGame);
        
            if(startGame.equalsIgnoreCase("X")){
                txtbtn1.setForeground(Color.RED);
            } else {
                txtbtn1.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn7.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn7.setForeground(Color.RED);
            } else {
                txtbtn7.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn8.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn8.setForeground(Color.RED);
            } else {
                txtbtn8.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn4.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn4.setForeground(Color.RED);
            } else {
                txtbtn4.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn6.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn6.setForeground(Color.RED);
            } else {
                txtbtn6.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn9.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn9.setForeground(Color.RED);
            } else {
                txtbtn9.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        if(!hasWinner) {
            txtbtn5.setText(startGame);

            if(startGame.equalsIgnoreCase("X")){
                txtbtn5.setForeground(Color.RED);
            } else {
                txtbtn5.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinningGame();
        }
    }//GEN-LAST:event_txtbtn5ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtbtnexit;
    private javax.swing.JButton txtbtnreset;
    // End of variables declaration//GEN-END:variables
}
