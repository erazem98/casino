/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Erazem
 */
public class Card {
    
    private String image;
    private int value;
    
    
    public Card(String image, int value){
        this.image = image;
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public int getValue() {
        return value;
    }
}
