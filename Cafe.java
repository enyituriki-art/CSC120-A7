/* This is a stub for the Cafe class */

/**
 * The Cafe class represents a cafe building that sells coffee.
 * It tracks inventory of coffee ounces, sugar packets, cream splashes and cups. 
 * A Cafe extends Building and implements CafeRequirements.
*/
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 
    
    /**
     * Constructs a new Cafe with the given name, address, number of floors and initial inventory levels.
     *
     * @param name the name of the cafe
     * @param address the street address of the cafe
     * @param nFloors the number of floors in the cafe
     * @param nCoffeeOunces starting coffee inventory in ounces
     * @param nSugarPackets starting sugar packet inventory
     * @param nCreams starting cream inventory
     * @param nCups starting cup inventory
    */

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
}


    /**
     * Sells a coffee of the given size and ingredient amounts.
     * If inventory is not enough, the cafe restocks before selling.
     *
     * @param size the size of the coffee in ounces
     * @param nSugarPackets the number of sugar packets requested
     * @param nCreams the number of cream splashes requested
    */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces < size || this.nSugarPackets <nSugarPackets || this.nCreams < nCreams || this.nCups < 1){
            this.restock(50,20,20,10);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        
    }

    /**
     * Restocks the cafe's inventory by adding the specified amounts.
     * This method is private because only the cafe should control restocking.
     *
     * @param nCoffeeOunces ounces of coffee to add
     * @param nSugarPackets sugar packets to add
     * @param nCreams cream splashes to add
     * @param nCups cups to add
    */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;

    }

    /**
     * A simple test method for the Cafe class.
    */
    
    public static void main(String[] args) {
        Cafe cc = new Cafe("Campus Center Cafe", "100 Elm St", 1, 100, 50, 50, 20);
        cc.sellCoffee(12, 1, 1);
        cc.sellCoffee(16, 1, 2);
        
    }
    
}
