import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport aircraft = Airport.getInstance();
        System.out.println(aircraft.getAllAircrafts());
        var aircraftAmount = aircraft.getAllAircrafts().size();
        var airportTerminal = aircraft.getTerminals();
        System.out.println("Amount aircraft at the airport: " + aircraftAmount);
        System.out.println("List and amount terminal at the airport: " + airportTerminal + " " + airportTerminal.size());

    }
}
