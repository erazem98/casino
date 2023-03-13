/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Erazem
 */
public class Deck {
    File[] listOfFiles;
    ArrayList<Card> deck;
    
    public Deck(){
        File folder = new File(System.getProperty("user.dir") + "\\src\\blackjack\\PNG-cards-1.3");
        listOfFiles = folder.listFiles();
        deck = new ArrayList<Card>();
        initDeck();
        
    }
    
    public Card getRandomCard(){
        Random r = new Random();
        int index = r.nextInt(deck.size());
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }
    
    private void initDeck(){
        int counter = 0;
        int value = 2;
        for (File file : listOfFiles) {
            String image_tmp = file.getPath();
            String image = "/";
            boolean foundB = false;
            boolean foundL = false;
            boolean preveri = true;
            for (int i = 0;i < image_tmp.length(); i++) {
                if (preveri){
                    
                    if (String.valueOf(image_tmp.charAt(i)).equals("b")) foundB = true;
                    if (foundB){
                        if (String.valueOf(image_tmp.charAt(i)).equals("b")){
                            foundL = true;
                            preveri = false;
                        }
                        else {
                            foundB = false;
                        }
                    }
                }
                if (foundL) image += String.valueOf(image_tmp.charAt(i));
                
            }
            if (counter == 4) {
                value = 3;
            }
            if(counter == 8) value = 4;
            if(counter == 12) value = 5;
            if(counter == 16) value = 6;
            if (counter == 20) value = 7;
            if(counter == 24) value = 8;
            if(counter == 28) value = 9;
            if (counter == 32) value = 10;
            if(counter == 48) value = 11;
            Card card = new Card(image, value);
            this.deck.add(card);
            counter++;
        }
    }
}
