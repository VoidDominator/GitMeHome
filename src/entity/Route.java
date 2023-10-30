package entity;

import java.util.ArrayList;

public interface Route {
    String getName();
    String getid();
    String getType();
    Station[] getRoute();
    Station getDestination();
    ArrayList<Integer> getDepartureTimes();
    void setDepartureTimes(ArrayList<Integer> departureTimes);
    ArrayList<Delay> getDelays();
    void setDelays(ArrayList<Delay> delays);
}
