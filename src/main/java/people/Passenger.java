package people;

import luggage.Bag;

import java.util.ArrayList;

public class Passenger extends Person{
    private ArrayList<Bag> bags;

    public Passenger(String name, ArrayList<Bag> bags) {
        super(name);
        this.bags = bags;
    }

    public ArrayList<Bag> getBags() {
        return bags;
    }
    public double getBaggageWeight(){
        double totalWeight = 0.0;
        for (Bag bag : this.bags){
            totalWeight += bag.getWeight();
        }
        return totalWeight;
    }

}
