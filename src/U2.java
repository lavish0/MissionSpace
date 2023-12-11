public class U2 extends Rocket{
    public U2(){
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosionChances = 0.00;
        landingExplosionChances = 0.00;
        currentWeight = weight;
    }
    public boolean launch(){
        int random = (int) (Math.random()*100 +1);
        this.landingExplosionChances = 8*(this.currentWeight-this.weight)/(this.maxWeight-this.weight);
        return (random >=this.launchExplosionChances);
    }
    public boolean land(){
        int random = (int) (Math.random()*100 +1);
        this.launchExplosionChances = 4*(this.currentWeight-this.weight)/(this.maxWeight-this.weight);
        return (random >=this.landingExplosionChances);
    }
}