package extraexercise3;

import Enums.Gym;
import Service.CampingService;
import Service.Hotel4StarsService;
import Service.Hotel5StarsService;
import Service.HotelService;
import Service.LodgingService;
import Service.ResidenceService;
import java.util.ArrayList;
import java.util.Collections;
import Comparators.PriceComparator;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class ExtraExercise3 {
    
    

    public static void main(String[] args) {
        
        ArrayList<LodgingService> lodgings = new ArrayList();
        Scanner read = new Scanner(System.in);
        Comparator<HotelService> priceComparator = new PriceComparator();
        
        
        //LODGINGS INSTANTIATION.
        
        Hotel4StarsService hotel4 = new Hotel4StarsService();
        
        hotel4.createLodgin(Gym.B, "Happy Clamp", 15, 10, 5, 5, 10, "Monaco", "Fake St 123", "Moreno Valley", "Germán Tomphson");
        
        lodgings.add(hotel4);
        
        Hotel5StarsService hotel5 = new Hotel5StarsService();
        
        hotel5.createLodgin(1, 3, 4, Gym.A, "Il Rissotto", 15, 10, 5, 5, 10, "Stroussen Hotel", "Fake St 178", "Moreno Valley", "Chis Anderson");
        
        lodgings.add(hotel5);
        
        CampingService camping = new CampingService();
        
        camping.createLodging(15, 3, true, true, 145, "Fiss n' Fish", "Clover St 14", "Alabama", "Peter Comission");
        
        lodgings.add(camping);
        
        ResidenceService residence = new ResidenceService();
        
        residence.createLodging(0, true, false, false, 365, "Buck o' Rod", "Evergreen 201", "Texas", "Frank Zaper");
        
        lodgings.add(residence);

        
        //MAIN PROGRAM.
        boolean runs = true;
        
        while (runs) {
            
            System.out.println("-----------------------------------------------");
            System.out.println("Booking Service.");
            System.out.println("Show: ");
            System.out.println("1. Display all Lodgings.");
            System.out.println("2. Hotels (price descending).");
            System.out.println("3. Campsites with Restaurants.");
            System.out.println("4. Residences with Membership Discounts.");
            System.out.println("5. Exit.");
            
            int option = read.nextInt();
            
            switch (option) {
                case 1:
                    for (LodgingService lodging : lodgings) {
                        lodging.showLodging();
                     }              
                    break;
                    
                case 2:       
                    int found = 0;
                    ArrayList<HotelService> hotels = new ArrayList();
                    for (LodgingService lodging : lodgings) {     
                        if (lodging instanceof HotelService) {
                            hotels.add((HotelService) lodging);
                        } else {
                            found++;
                        }
                     }
                    if (!(found == 0)) {
                        System.out.println("None available.");
                    }
                    Collections.sort(hotels, priceComparator);
                    for (HotelService hotel : hotels) {
                        hotel.showLodging();
                    }
                    break;
                    
                case 3:
                    for (LodgingService lodging : lodgings) {
                        if (lodging instanceof CampingService) {
                            CampingService auxCamping = (CampingService) lodging;
                            if (auxCamping.hasRestaurant()) {
                                lodging.showLodging();
                            } else {
                                System.out.println("None available.");
                            }
                        }
                     }         
                    break;
                    
                case 4:
                    for (LodgingService lodging : lodgings) {
                        if (lodging instanceof ResidenceService) {
                            ResidenceService auxResidence = (ResidenceService) lodging;
                            if (auxResidence.hasDiscount()) {
                                lodging.showLodging();
                            } else {
                                System.out.println("None available.");
                            }
                        }
                     }         
                    break;
                    
                case 5:
                    System.out.println("Thanks for using our service.");
                    runs = false;
                    break;
            }
            
        }
           
    }

}
