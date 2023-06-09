/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import blackjack.Blackjack;
import cashier.Cashier;
import data.Reader;
import data.Writter;
import editProfile.EditProfile;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Erazem
 */
public class Main extends javax.swing.JFrame {

    Dimension dim;
    String username;
    double balance;
    String password;
    int points;
    JLabel[] starLabels;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(0, 0);
        
    }
    
    public Main(String username){
        initComponents();
        this.dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(0, 0);
        this.username = username;
        cashierBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierBtnActionPerformed(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        blackjackBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackjackBtnActionPerformed(evt);
            }
        });
        getPassword();
                
        setup();
    }
    
    private void setup(){
        editProfileBtn.setContentAreaFilled(false);
        cashierBtn.setContentAreaFilled(false);
        refreshBtn.setContentAreaFilled(false);
        starLabels = new JLabel[5];
        starLabels[0] = star1;
        starLabels[1] = star2;
        starLabels[2] = star3;
        starLabels[3] = star4;
        starLabels[4] = star5;
        username_label.setText(username);
        Reader r = new Reader(username);
        r.read();
        HashSet<String[]> data = r.getData();
        /**Reader re = new Reader("players");
        re.read();
        HashSet<String[]> data1 = re.getData();
        for (String[] strings : data1) {
            if (strings[1].equals(password)) {
                this.username = strings[0];
                break;
            }
        }*/
        double balanceTmp = 0;
        this.points = 0; 
        for (String[] transaction : data) {
            double bet = Double.parseDouble(transaction[0]);
            double win = Double.parseDouble(transaction[1]);
            double netWin = win - bet;
            balanceTmp += netWin;
            if(win != 0) points += bet;
        }
        balance = balanceTmp;
        balanceLabel.setText(Double.toString(balance) + " €");
        pointsLabel.setText(Integer.toString(this.points));
        drawStars();
        
        
    }
    
    private void getPassword(){
        Reader r = new Reader("players");
        r.read();
        HashSet<String[]> data = r.getData();
        for (String[] strings : data) {
            if (strings[0].equals(username)) {
                this.password = strings[1];
                
                break;
            }
        }
    }

    
    private void drawStars(){
        int numOfStars = 0;
        int del = 20;
        for (int i = 0; i < points; i++) {
            if (i%del == 0) {
                numOfStars++;
                del *= 2;
            }
            if (numOfStars > 5) {
                break;
            }
        }
        for (int i = 0; i < numOfStars; i++) {
            starLabels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star_yel.png"))); // NOI18N
        }
    }
    
    private int get_width(){
        return this.dim.width;
    }
    
    private int get_height(){
        return this.dim.height;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pointsLabel = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        cashierBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ruletaBtn = new javax.swing.JButton();
        slotsBtn = new javax.swing.JButton();
        blackjackBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        blackjackRBtn = new javax.swing.JButton();
        slotsRBtn = new javax.swing.JButton();
        ruletaRBrtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setMinimumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jLabel1.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/59704496_2141439642630185_11312402691784704_n.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Username:");

        username_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username_label.setForeground(new java.awt.Color(240, 240, 240));
        username_label.setText("user1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Points:");

        pointsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pointsLabel.setForeground(new java.awt.Color(240, 240, 240));

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star.png"))); // NOI18N
        star1.setPreferredSize(new java.awt.Dimension(41, 41));

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star.png"))); // NOI18N
        star3.setPreferredSize(new java.awt.Dimension(41, 41));

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star.png"))); // NOI18N
        star2.setPreferredSize(new java.awt.Dimension(41, 41));

        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star.png"))); // NOI18N
        star4.setPreferredSize(new java.awt.Dimension(41, 41));

        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/star.png"))); // NOI18N
        star5.setPreferredSize(new java.awt.Dimension(41, 41));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Balance:");

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(240, 240, 240));

        editProfileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/edit.png"))); // NOI18N
        editProfileBtn.setBorder(null);
        editProfileBtn.setBorderPainted(false);
        editProfileBtn.setDisabledSelectedIcon(null);
        editProfileBtn.setFocusPainted(false);
        editProfileBtn.setPreferredSize(new java.awt.Dimension(310, 60));
        editProfileBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/edit_white.png"))); // NOI18N
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        cashierBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/cashier.png"))); // NOI18N
        cashierBtn.setBorderPainted(false);
        cashierBtn.setFocusPainted(false);
        cashierBtn.setPreferredSize(new java.awt.Dimension(296, 103));
        cashierBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/cashier_white.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 4));

        ruletaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/ruleta.png"))); // NOI18N
        ruletaBtn.setFocusPainted(false);
        ruletaBtn.setFocusTraversalPolicyProvider(true);
        ruletaBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/ruletaOver.png"))); // NOI18N
        ruletaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruletaBtnActionPerformed(evt);
            }
        });

        slotsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/slots.png"))); // NOI18N
        slotsBtn.setFocusPainted(false);
        slotsBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/slotsOver.png"))); // NOI18N

        blackjackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/blackjack.png"))); // NOI18N
        blackjackBtn.setFocusPainted(false);
        blackjackBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/blackjackOver.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 66)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5.setText("Games");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 66)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(150, 150, 150));
        jLabel7.setText("Rules");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blackjackRBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/blackjackR.png"))); // NOI18N
        blackjackRBtn.setFocusPainted(false);
        blackjackRBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/blackjackROver.png"))); // NOI18N
        blackjackRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackjackRBtnActionPerformed(evt);
            }
        });

        slotsRBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/slotsR.png"))); // NOI18N
        slotsRBtn.setFocusPainted(false);
        slotsRBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/slotsROver.png"))); // NOI18N
        slotsRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotsRBtnActionPerformed(evt);
            }
        });

        ruletaRBrtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/ruletaR.png"))); // NOI18N
        ruletaRBrtn.setFocusPainted(false);
        ruletaRBrtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/ruletaROver.png"))); // NOI18N
        ruletaRBrtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruletaRBrtnActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/refresh.png"))); // NOI18N
        refreshBtn.setFocusPainted(false);
        refreshBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/refreshW.png"))); // NOI18N
        refreshBtn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/refreshW.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(editProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(pointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(star4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(cashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruletaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruletaRBrtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blackjackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blackjackRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slotsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slotsRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(editProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(username_label))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(pointsLabel))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(star4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(balanceLabel))
                                .addGap(50, 50, 50)
                                .addComponent(cashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ruletaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(ruletaRBrtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(blackjackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(237, 237, 237)
                                        .addComponent(blackjackRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(slotsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(237, 237, 237)
                                        .addComponent(slotsRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1924, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        // TODO add your handling code here:
        EditProfile ed = new EditProfile(username);
        ed.show();
    }//GEN-LAST:event_editProfileBtnActionPerformed
   
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        setup();
    }  
    
    private void cashierBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        Cashier cashier = new Cashier(username);
        cashier.show();
    }  
    
    private void ruletaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruletaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruletaBtnActionPerformed

    private void blackjackRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackjackRBtnActionPerformed
        // TODO add your handling code here:
        openURI("https://bicyclecards.com/how-to-play/blackjack/?fbclid=IwAR0OiT9U5x9PUdYC2tZG9_pSkMcZ9hl4H55q9t4oJo3n3OP0ckAddScuE-4");
    }//GEN-LAST:event_blackjackRBtnActionPerformed

    private void blackjackBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Blackjack bj = new Blackjack(username);
        bj.show();
    }      
    
    private void slotsRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotsRBtnActionPerformed
        // TODO add your handling code here:
        openURI("https://en.wikipedia.org/wiki/Slot_machine?fbclid=IwAR0OiT9U5x9PUdYC2tZG9_pSkMcZ9hl4H55q9t4oJo3n3OP0ckAddScuE-4");
    }//GEN-LAST:event_slotsRBtnActionPerformed

    private void ruletaRBrtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruletaRBrtnActionPerformed
        openURI("https://www.roulettesites.org/rules/?fbclid=IwAR3Ce9Gw5MlgWgEAAhwlUGNk8J4p-9VwDRsorviEL0TNd98cfbaihhX_sXE");
    }//GEN-LAST:event_ruletaRBrtnActionPerformed

    private void openURI(String a){
        try {
            // TODO add your handling code here:
            URL url = new URL(a);
            openURL(url.toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void openURL(URI uri){
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
            //return true;
        } catch (Exception e) { 
            e.printStackTrace();
        }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void show(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton blackjackBtn;
    private javax.swing.JButton blackjackRBtn;
    private javax.swing.JButton cashierBtn;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton ruletaBtn;
    private javax.swing.JButton ruletaRBrtn;
    private javax.swing.JButton slotsBtn;
    private javax.swing.JButton slotsRBtn;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
