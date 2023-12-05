package org.example.classes;

import org.example.enums.Cheese;
import org.example.enums.PastryType;
import org.example.enums.Size;

import java.util.List;


public class Pizza {
    private Size size;
    private PastryType pastryType;
    private Cheese cheese;
    private List<String> ingredients;
    private String sauce;

    private Pizza(Builder builder){
        this.size = builder.size;
        this.pastryType = builder.pastryType;
        this.cheese = builder.cheese;
        this.ingredients = builder.ingredients;
        this.sauce = builder.sauce;
    }

    public static class Builder{
        private Size size;
        private PastryType pastryType;
        private Cheese cheese;
        private List<String> ingredients;
        private String sauce;

        public Builder size(Size size){
            this.size = size;
            return this;
        }

        public Builder pastryType(PastryType pastryType){
            this.pastryType= pastryType;
            return this;
        }

        public Builder cheese(Cheese cheese){
            this.cheese= cheese;
            return this;
        }

        public Builder ingredients(List<String> ingredients){
            this.ingredients= ingredients;
            return this;
        }

        public Builder sauce(String sauce){
            this.sauce= sauce;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }



    @Override
    public String toString() {
        return "Pizza: " +
                "size=" + size +
                ", pastryType=" + pastryType +
                ", cheese='" + cheese + '\'' +
                ", ingredients=" + ingredients +
                ", sauce='" + sauce ;
    }
}
