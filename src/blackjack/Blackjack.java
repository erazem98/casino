/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import data.Reader;
import data.Writter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Time;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erazem
 */
public class Blackjack extends javax.swing.JFrame {

    String username;
    int dealerScore;
    int playerScore;
    Deck deck;
    double bet;
    int numOfAces;
    int numOfAcesUser;
    int numOfCards;
    
    
    /**
     * Creates new form Blackjack
     */
    public Blackjack(String username) {
        this.username = username;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        deck = new Deck();
        standBtn.setVisible(false);
        HitBtn.setVisible(false);
        chooseLabel.setVisible(false);
        numOfAces = 0;
        numOfAcesUser = 0;
        numOfCards = 0;
        dealBtn.setContentAreaFilled(false);
        HitBtn.setContentAreaFilled(false);
        standBtn.setContentAreaFilled(false);
        oneBtn.setContentAreaFilled(false);
        twoBtn.setContentAreaFilled(false);
        fiveBtn.setContentAreaFilled(false);
        tenBtn.setContentAreaFilled(false);
        twentyFiveBtn.setContentAreaFilled(false);
        fiftyBtn.setContentAreaFilled(false);
    }
    
    public Blackjack(){
        initComponents();
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
        card5Label = new javax.swing.JLabel();
        card4Label = new javax.swing.JLabel();
        card3Label = new javax.swing.JLabel();
        card2Label = new javax.swing.JLabel();
        card1Label = new javax.swing.JLabel();
        cardDelaerLabel4 = new javax.swing.JLabel();
        cardDelaerLabel3 = new javax.swing.JLabel();
        cardDelaerLabel2 = new javax.swing.JLabel();
        cardDelaerLabel1 = new javax.swing.JLabel();
        cardDelaerLabel = new javax.swing.JLabel();
        playerScoreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dealerScoreLabel = new javax.swing.JLabel();
        dealBtn = new javax.swing.JButton();
        fiftyBtn = new javax.swing.JButton();
        betTextField = new javax.swing.JTextField();
        oneBtn = new javax.swing.JButton();
        tenBtn = new javax.swing.JButton();
        twentyFiveBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        HitBtn = new javax.swing.JButton();
        insufficentFundsLabel = new javax.swing.JLabel();
        standBtn = new javax.swing.JButton();
        winLoseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chooseLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1136, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(card5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 80, 116));
        jPanel1.add(card4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 80, 116));
        jPanel1.add(card3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 80, 116));
        jPanel1.add(card2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 80, 116));
        jPanel1.add(card1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 80, 116));
        jPanel1.add(cardDelaerLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 116));
        jPanel1.add(cardDelaerLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 80, 116));
        jPanel1.add(cardDelaerLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 80, 116));
        jPanel1.add(cardDelaerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 80, 116));
        jPanel1.add(cardDelaerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 80, 116));

        playerScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playerScoreLabel.setText("0");
        jPanel1.add(playerScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 60, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("DEALER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("YOU");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 60, 40));

        dealerScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dealerScoreLabel.setText("0");
        jPanel1.add(dealerScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 60, 40));

        dealBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/deal.png"))); // NOI18N
        dealBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/dealW.png"))); // NOI18N
        dealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dealBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 180, 60));

        fiftyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/fifty.png"))); // NOI18N
        fiftyBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/fiftyW.png"))); // NOI18N
        fiftyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fiftyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 50, 50));

        betTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        betTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        betTextField.setText("0");
        jPanel1.add(betTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 230, 40));

        oneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/one.png"))); // NOI18N
        oneBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/oneW.png"))); // NOI18N
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        jPanel1.add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 50, 50));

        tenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/ten.png"))); // NOI18N
        tenBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/tenW.png"))); // NOI18N
        tenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(tenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 50, 50));

        twentyFiveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/twenty.png"))); // NOI18N
        twentyFiveBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/twentyW.png"))); // NOI18N
        twentyFiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyFiveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(twentyFiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 50, 50));

        twoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/two.png"))); // NOI18N
        twoBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/twoW.png"))); // NOI18N
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 50, 50));

        fiveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/five.png"))); // NOI18N
        fiveBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/fiveW.png"))); // NOI18N
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 50, 50));

        HitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/hit.png"))); // NOI18N
        HitBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/hitW.png"))); // NOI18N
        HitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 110, 60));

        insufficentFundsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insufficentFundsLabel.setForeground(new java.awt.Color(255, 0, 0));
        insufficentFundsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(insufficentFundsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 190, 30));

        standBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/stand.png"))); // NOI18N
        standBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/standW.png"))); // NOI18N
        standBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standBtnActionPerformed(evt);
            }
        });
        jPanel1.add(standBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 110, 60));

        winLoseLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        winLoseLabel.setForeground(new java.awt.Color(51, 153, 255));
        winLoseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(winLoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 290, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR BET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 220, 90));

        chooseLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chooseLabel.setForeground(new java.awt.Color(0, 0, 255));
        chooseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLabel.setText(" Choose your action");
        jPanel1.add(chooseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 270, 70));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/slike/Nova mapa/blackjackBackground.png"))); // NOI18N
        jPanel1.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1136, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealBtnActionPerformed
        // TODO add your handling code here:
        winLoseLabel.setText("");
        numOfAces = 0;
        numOfAcesUser = 0;
        numOfCards = 0;
        
        if (enoughFunds()){
            cardDelaerLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            cardDelaerLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            cardDelaerLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            cardDelaerLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            card3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            card4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            card5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            insufficentFundsLabel.setText("");
            deck = new Deck();
            Card c11 = deck.getRandomCard();
            Card c12 = deck.getRandomCard();
            Card c01 = deck.getRandomCard();
            dealerScore = addValue(c01.getValue(), dealerScore);
            playerScore = c11.getValue();
            playerScore += addValueUser(c12.getValue(), playerScore);
            bet = Double.parseDouble(betTextField.getText());
            card1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c11.getImage())));
            card2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c12.getImage())));
            cardDelaerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(c01.getImage())));
            
            dealerScoreLabel.setText(String.valueOf(dealerScore));
            playerScoreLabel.setText(String.valueOf(playerScore));
            if (playerScore == 21) {
                winLoseLabel.setText("YOU WIN " + String.valueOf(bet*2) + "€");
                Writter w = new Writter(username);
                w.addTransaction(bet, bet*2);
                return;
            }
            chooseLabel.setVisible(true);
            dealBtn.setVisible(false);
            HitBtn.setVisible(true);
            standBtn.setVisible(true);
            
        }
       
        
        
    }//GEN-LAST:event_dealBtnActionPerformed
    
    private boolean enoughFunds(){
        double balance = 0;
        Reader r = new Reader(username);
        r.read();
        HashSet<String[]> data = r.getData();
        for (String[] transaction : data) {
            double bet = Double.parseDouble(transaction[0]);
            double win = Double.parseDouble(transaction[1]);
            double netWin = win - bet;
            balance += netWin;
        }
        if (Double.parseDouble(betTextField.getText()) < 0.01) {
            insufficentFundsLabel.setText("Bet to small!");
            return false;
        }
        if (Double.parseDouble(betTextField.getText()) > balance){
            insufficentFundsLabel.setText("Insufficient funds!");
        }
        return Double.parseDouble(betTextField.getText()) < balance;
    }
    
    private void fiftyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftyBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("50");
    }//GEN-LAST:event_fiftyBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("1");
    }//GEN-LAST:event_oneBtnActionPerformed

    private void tenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("10");
    }//GEN-LAST:event_tenBtnActionPerformed

    private void twentyFiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyFiveBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("25");
    }//GEN-LAST:event_twentyFiveBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("2");
    }//GEN-LAST:event_twoBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        // TODO add your handling code here:
        betTextField.setText("5");
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void standBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standBtnActionPerformed
        // TODO add your handling code here:
        Card c02 = deck.getRandomCard();
        dealerScore += addValue(c02.getValue(), dealerScore);
        cardDelaerLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c02.getImage())));
        dealerScoreLabel.setText(String.valueOf(dealerScore));
        
        if (dealerScore > 21) {
            win(bet*2);
            return;
        }
        if (dealerScore > 17){
            if (dealerScore < playerScore) {
                win(bet*2);
                return;
            }
            else if (dealerScore == playerScore){
                draw(bet);
                return;
            }
            else{
                lose(bet);
                return;
            }
        }
        Card c03 = deck.getRandomCard();
        cardDelaerLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c03.getImage())));
        dealerScore += addValue(c03.getValue(), dealerScore);
        dealerScoreLabel.setText(String.valueOf(dealerScore));
        if (dealerScore > 21) {
            win(bet*2);
            return;
        }
        if (dealerScore > 17){
            if (dealerScore < playerScore) {
                win(bet*2);
                return;
            }
            else if (dealerScore == playerScore){
                draw(bet);
                return;
            }
            else{
                lose(bet);
                return;
            }
        }
        
        Card c04 = deck.getRandomCard();
        cardDelaerLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c04.getImage())));
        dealerScore += addValue(c04.getValue(), dealerScore);
        dealerScoreLabel.setText(String.valueOf(dealerScore));
        if (dealerScore > 21) {
            win(bet*2);
            return;
        }
        if (dealerScore > 17){
            if (dealerScore < playerScore) {
                win(bet*2);
                return;
            }
            else if (dealerScore == playerScore){
                draw(bet);
                return;
            }
            else{
                lose(bet);
                return;
            }
        }
        
        Card c05 = deck.getRandomCard();
        cardDelaerLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c05.getImage())));
        dealerScore += addValue(c05.getValue(), dealerScore);
        dealerScoreLabel.setText(String.valueOf(dealerScore));
        if (dealerScore > 21) {
            win(bet*2);
            return;
        }
        if (dealerScore > 17){
            if (dealerScore < playerScore) {
                win(bet*2);
                return;
            }
            else if (dealerScore == playerScore){
                draw(bet);
                return;
            }
            else{
                lose(bet);
                return;
            }
        }

    }//GEN-LAST:event_standBtnActionPerformed

    

    
    private void HitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitBtnActionPerformed
        // TODO add your handling code here:
        if (numOfCards == 0){
            Card c13 = deck.getRandomCard();
            numOfCards++;
            playerScore += addValueUser(c13.getValue(), playerScore);
            playerScoreLabel.setText(String.valueOf(playerScore));
            card3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c13.getImage())));
            if (playerScore > 21){
                lose(bet);
                
            }
            return;
        }
        
        if (numOfCards == 1){
            Card c13 = deck.getRandomCard();
            numOfCards++;
            playerScore += addValueUser(c13.getValue(), playerScore);
            playerScoreLabel.setText(String.valueOf(playerScore));
            card4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c13.getImage())));
            if (playerScore > 21){
                lose(bet);
                return;
            }
            return;
        }
        
        if (numOfCards == 2){
            Card c13 = deck.getRandomCard();
            numOfCards++;
            playerScore += addValueUser(c13.getValue(), playerScore);
            playerScoreLabel.setText(String.valueOf(playerScore));
            card5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(c13.getImage())));
            if (playerScore > 21){
                lose(bet);
                return;
            }
            return;
        }
    }//GEN-LAST:event_HitBtnActionPerformed

    
    
    private int addValue(int value, int currScore){
        if (value == 11){
            numOfAces ++;
            if (11 + currScore > 21){
                numOfAces --;
                return 1;
            }
            return 11;
        }
        if (value + currScore > 21){
            if (numOfAces != 0) {
                numOfAces --;
                return value - 10;
            }
        }
        return value;
    }
    
    private int addValueUser(int value, int currScore){
        if (value == 11){
            numOfAcesUser ++;
            if (11 + currScore > 21){
                numOfAcesUser --;
                return 1;
            }
            return 11;
        }
        if (value + currScore > 21){
            if (numOfAcesUser != 0) {
                numOfAcesUser --;
                return value - 10;
            }
        }
        return value;
    }
    
        private void lose(double ammount){
        winLoseLabel.setForeground(new java.awt.Color(0, 0, 255));
        winLoseLabel.setText("YOU LOST");
        Writter w = new Writter(username);
        w.addTransaction(ammount, 0);
        HitBtn.setVisible(false);
        standBtn.setVisible(false);
        chooseLabel.setVisible(false);
        dealBtn.setVisible(true);
        bet = 0;
        deck = new Deck();
    }
    
    private void draw(double ammount){
        winLoseLabel.setForeground(new java.awt.Color(0, 0, 255));
        winLoseLabel.setText("PUSH");
        Writter w = new Writter(username);
        w.addTransaction(ammount, ammount);
        HitBtn.setVisible(false);
        standBtn.setVisible(false);
        chooseLabel.setVisible(false);
        dealBtn.setVisible(true);
        bet = 0;
        deck = new Deck();
    }
    
    private void win(double ammount){
        winLoseLabel.setForeground(new java.awt.Color(0, 0, 255));
        winLoseLabel.setText("YOU  WIN " + String.valueOf(bet*2) + "€");
        Writter w = new Writter(username);
        w.addTransaction(ammount / 2, ammount);
        HitBtn.setVisible(false);
        standBtn.setVisible(false);
        chooseLabel.setVisible(false);
        dealBtn.setVisible(true);
        bet = 0;
        deck = new Deck();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Blackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blackjack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HitBtn;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField betTextField;
    private javax.swing.JLabel card1Label;
    private javax.swing.JLabel card2Label;
    private javax.swing.JLabel card3Label;
    private javax.swing.JLabel card4Label;
    private javax.swing.JLabel card5Label;
    private javax.swing.JLabel cardDelaerLabel;
    private javax.swing.JLabel cardDelaerLabel1;
    private javax.swing.JLabel cardDelaerLabel2;
    private javax.swing.JLabel cardDelaerLabel3;
    private javax.swing.JLabel cardDelaerLabel4;
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JButton dealBtn;
    private javax.swing.JLabel dealerScoreLabel;
    private javax.swing.JButton fiftyBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JLabel insufficentFundsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton oneBtn;
    private javax.swing.JLabel playerScoreLabel;
    private javax.swing.JButton standBtn;
    private javax.swing.JButton tenBtn;
    private javax.swing.JButton twentyFiveBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JLabel winLoseLabel;
    // End of variables declaration//GEN-END:variables
}
