package org.example.exception;

import java.util.ArrayList;

public class DeckOfCards {

    private ArrayList<String> cards = new ArrayList<>();

    public ArrayList<String> draw(int cardsNb) throws MyException{
        if(cardsNb > 4){
            throw new MyException("cheater !!!");
        }
        return new ArrayList<String>();
    }

    public String trade(int cardsNb){
        if (cardsNb > 2){
            throw new MySecondException("Not more than 2 cards !!");
        }
        return "Here's your cards" ;
    }
}
