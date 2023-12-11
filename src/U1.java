public class U1 extends Rocket{
        public U1(){
                cost = 100;
                weight = 10000; 
                maxWeight=18000; 
                launchExplosionChances = 0.0;
                landingExplosionChances = 0.0;
                currentWeight=weight;
        }
        
        public boolean launch() {
                int random = (int) (Math.random()*100 +1);
                this.landingExplosionChances = 5*(this.currentWeight-this.weight)/(this.maxWeight-this.weight);
                return (random >=this.launchExplosionChances);
        }
        public boolean land() {
                int random = (int) (Math.random()*100 +1);
                this.launchExplosionChances = 1*(this.currentWeight-this.weight)/(this.maxWeight-this.weight);
                return (random >=this.landingExplosionChances);
        }
}