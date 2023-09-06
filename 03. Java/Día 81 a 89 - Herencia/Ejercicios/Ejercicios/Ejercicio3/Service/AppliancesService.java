package Service;

import Entity.Appliances;
import Enums.colors;
import Enums.powerConsumption;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo
 */

public abstract class AppliancesService {

    Scanner read = new Scanner(System.in);

    protected Appliances appliance;

    public void powerConsumptionChecker(String character) {

        powerConsumption[] efficiency = Enums.powerConsumption.values();

        for (powerConsumption consumption : efficiency) {

            if (consumption.toString().equalsIgnoreCase(character)) {

                appliance.setPowerConsumption(character.toUpperCase());

            } 
            
        }

    }

    public void colorChecker(String color) {

        colors[] colors = Enums.colors.values();

        for (colors colour : colors) {

            if (colour.toString().equalsIgnoreCase(color)) {

                appliance.setColor(color.toUpperCase());
                
                break;

            } 

        }

    }

    public void createAppliance() {

        this.appliance = new Appliances();

        appliance.setPrice(1000);

        System.out.println("Appliance's weight: (example: 1,2)");

        double weight = read.nextDouble();

        appliance.setWeight(weight);

        read.nextLine();

        System.out.println("Appliance's colour: (white, black, red, blue, gray)");

        String color = read.nextLine();

        colorChecker(color);

        System.out.println("Appliance's power consumption: (A to F)");

        String power = read.nextLine();

        powerConsumptionChecker(power);

    }

    public abstract void finalPrice();

}
