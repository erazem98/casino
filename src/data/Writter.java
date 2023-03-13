/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erazem
 */
public class Writter {
    
    protected String players = "C:\\Users\\Erazem\\Documents\\NetBeansProjects\\Casino\\src\\data\\players.txt";
    private String doc;
    private String username; 
    
    public Writter(String type) {
        if (type.equals("players")) {
            this.doc = this.players;
        }
        else{
            this.doc ="C:\\Users\\Erazem\\Documents\\NetBeansProjects\\Casino\\src\\data\\" + type + ".txt";
            this.username = type;
        }
    }
    
    public void createNewFile(String username){
        File file = new File("C:\\Users\\Erazem\\Documents\\NetBeansProjects\\Casino\\src\\data\\" + username + ".txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Writter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addTransaction(double bet, double win){
        Reader r = new Reader(username);
        r.read();
        HashSet<String[]> transactions = r.getData();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(doc));
            for (String[] transaction : transactions) {
                bw.append(transaction[0] + "," + transaction[1] + "\n");
            }
            bw.append(Double.toString(bet) + "," + Double.toString(win));
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Writter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addStream(HashSet<String[]> stream){
        createNewFile(username);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(doc));
            for (String[] transaction : stream) {
                bw.append(transaction[0] + "," + transaction[1] + "\n");
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Writter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePlayers(String old, String nov){
        try {
            Reader r = new Reader("players");
            r.read();
            HashSet<String[]> players = r.getData();
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.players));
            for (String[] player : players) {
                if (player[0].equals(old)) {
                    bw.append(nov + "," + player[1] + "," + player[2] + "," + player[3]);
                }
                else bw.append(player[0] + "," + player[1] + "," + player[2] + "," + player[3]);
                bw.append("\n");
            }
            bw.close();
            
        } catch (IOException ex) {
            return;
        }
    }
    public void updatePlayersPassword(String name, String pass){
        try {
            Reader r = new Reader("players");
            r.read();
            HashSet<String[]> players = r.getData();
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.players));
            for (String[] player : players) {
                if (player[0].equals(name)) {
                    bw.append(player[0] + "," + pass + "," + player[2] + "," + player[3]);
                }
                else bw.append(player[0] + "," + player[1] + "," + player[2] + "," + player[3]);
                bw.append("\n");
            }
            bw.close();
            
        } catch (IOException ex) {
            return;
        }
    }
    
    
    
    //adds text to the end of textfile
    public boolean addPlayer(String username, String password) {
        try {
            Reader r = new Reader("players");
            r.read();
            HashSet<String[]> players = r.getData();
            BufferedWriter bw = new BufferedWriter(new FileWriter(doc));
            for (String[] player : players) {
                bw.append(player[0] + "," + player[1] + "," + player[2] + "," + player[3]);
                bw.append("\n");
            }
            bw.append(username + "," + password + ",0,0");
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
