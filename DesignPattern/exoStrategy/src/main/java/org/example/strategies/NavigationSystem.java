package org.example.strategies;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {
    private String destination;


    public void goWith(NavigationStrategy navigationStrategy){
        if(navigationStrategy.navigate(destination)) {
            System.out.println("Navigation Strategy activated");
        } else {
            System.out.println("Oops ! Error, please choose again.");
        }
    }
}
