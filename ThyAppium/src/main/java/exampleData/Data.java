package exampleData;

import java.util.ArrayList;

public class Data {
    public ArrayList<Passenger> exData() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("123123", "emir", "ergenc", "5433454343", "emirergenc@gmail.com", "05/05/1998"));
        passengers.add(new Passenger("321321", "emre", "dogangun", "5435433434", "emredogangun@gmail.com", "05/05/1998"));
        return passengers;
    }
}
