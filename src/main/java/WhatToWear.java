import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {
        System.out.println("whats the weather like?");

        Scanner reader = new Scanner(System.in);
        String weatherCondition = reader.nextLine();

        System.out.println("What temperature is it in degrees celsius?");
        String temperature = reader.nextLine();

        int temperatureNew = Integer.parseInt(temperature);

        if(weatherCondition.equals("sunny") && temperatureNew > 24){
            System.out.println("It is hot wear a vest or go shirtless");
        } else if (weatherCondition.equals("rainy") && temperatureNew < 12) {
            System.out.println("Its terrible today bring an umbrella and wear a thick jacket");

        } else if (weatherCondition.equals("snowy") || weatherCondition.equals("foggy")) {
            System.out.println("Its not even worth the effort stay at home");

        } else {
            System.out.print("The weather is not perfect but but its england so what do you expect wear what you want" );
        }
    }
}
