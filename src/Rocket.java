public class Rocket implements SpaceShip{    
    int cost;
    int weight;
    int maxWeight;
    double launchExplosionChances;
    double landingExplosionChances;
    int currentWeight;

    public boolean launch() {
        return true;
    }
    
    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        if(currentWeight + item.weight > maxWeight) {
            return false;
        }
        else {
            return true;
        }
    }

    public int carry(Item item) {
        currentWeight+=item.weight;
        return currentWeight;
    }

}