package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public class Rent {
    
    private String name;
    private int clientID;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private int berthPosition;
    private Boat boat;

    public Rent() {
    }

    public Rent(String name, int clientID, LocalDate rentDate, LocalDate returnDate, int berthPosition, Boat boat) {
        this.name = name;
        this.clientID = clientID;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.berthPosition = berthPosition;
        this.boat = boat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getBerthPosition() {
        return berthPosition;
    }

    public void setBerthPosition(int berthPosition) {
        this.berthPosition = berthPosition;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Rent{" + "name=" + name + ", clientID=" + clientID + ", rentDate=" + rentDate + ", returnDate=" + returnDate + ", berthPosition=" + berthPosition + ", boat=" + boat + '}';
    }
    
}
