import java.util.ArrayList;

public class Airport
{
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights)
    {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights()
    {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue()
    {
        double totalRevenue = 0;
        for (Flight flight : allFlights) {
            if (flight.getNumPassengers() > flight.getCapacity()) {
                totalRevenue += flight.getPrice() * flight.getCapacity();
            }
            else {
                totalRevenue += flight.getPrice() * flight.getNumPassengers();
            }
        }
        return totalRevenue;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights()
    {
        int numPassengers = 0;
        for (int i = allFlights.size() - 1; i >= 0; i--) {
            Flight current = allFlights.get(i);
            int minCap = (int) (current.getCapacity() * 0.2);
            int passengers = current.getNumPassengers();
            if (passengers < minCap) {
                numPassengers += passengers;
                allFlights.remove(i);
            }
        }
        return numPassengers;
    }
}