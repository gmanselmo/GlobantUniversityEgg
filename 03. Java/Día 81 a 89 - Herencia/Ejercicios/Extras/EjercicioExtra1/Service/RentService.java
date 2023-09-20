package Service;

import Entity.Rent;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo
 */

public class RentService {
    
    Rent rent;

    BoatService boatService;
    
    Scanner read = new Scanner(System.in);
    
    public void createRent() {
        
        System.out.println("Customer's name: ");
        
        String name = read.nextLine();
        
        System.out.println("Customer's ID: ");
        
        int id = read.nextInt();
        
        read.nextLine();
        
        System.out.println("Rent Start Date (YYYY-MM-DD): ");
        
        LocalDate startDate = LocalDate.parse(read.nextLine());
        
        System.out.println("Rent Return Date (YYYY-MM-DD): ");
        
        LocalDate returnDate = LocalDate.parse(read.nextLine());
        
        System.out.println("Boat's berth position: ");
        
        int position = read.nextInt();
        
        read.nextLine();
        
        System.out.println("Boat type (sailboat, motorboat, yacht): ");
        
        String type = read.nextLine();
        
        switch (type) {
            case "sailboat":
                boatService = new SailboatService();
                break;
            case "motorboat":
                boatService = new MotorboatService();
                break;
            case "yacht":
                boatService = new YachtService();
                break;
        }
        
        
        boatService.createBoat();
        
        rent = new Rent(name, id, startDate, returnDate, position, boatService.getBoat());

    }
    
    public void showRentInfo(){
        
        System.out.println(rent.toString());
        
    }
    
    public void rentalPrice() {     
        
        int totalDays = rent.getRentDate().until(rent.getReturnDate()).getDays();
        
        double price = totalDays * boatService.returnModule();
        
        System.out.println("Rental Days: " + totalDays + ".");
        
        System.out.println("Final Price: $" + price + ".");

    }

}

