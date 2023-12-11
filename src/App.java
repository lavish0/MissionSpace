import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        simulation sim = new simulation();
        ArrayList<Item> phase1= sim.loaditems("phase-1.txt");
        ArrayList<Item> phase2= sim.loaditems("phase-2.txt");

        // Simulation for U1 fleet
        ArrayList<Rocket> u1fleetPhase1 = sim.loadU1(phase1);
        ArrayList<Rocket> u1fleetPhase2= sim.loadU1(phase2);
        int budgetU1phase1 = sim.runSimulation(u1fleetPhase1);
        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase1 + " (millions)");
        int budgetU1phase2 = sim.runSimulation(u1fleetPhase2);
        System.out.println("Budget of U1 fleet for phase 2 = " + budgetU1phase2 + " (millions)");

        System.out.println("Total Budget of u1 Fleet = " + (budgetU1phase1 + budgetU1phase2) + " (millions)");

        // Simulation for U1 fleet

        ArrayList<Rocket> u2fleetPhase1 = sim.loadU1(phase1);
        ArrayList<Rocket> u2fleetPhase2= sim.loadU1(phase2);
        int budgetU2phase1 = sim.runSimulation(u2fleetPhase1);
        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase1 + " (millions)");
        int budgetU2phase2 = sim.runSimulation(u2fleetPhase2);
        System.out.println("Budget of U2 fleet for phase 2 = " + budgetU2phase2 + " (millions)");

        System.out.println("Total Budget of u2 Fleet = " + (budgetU2phase1 + budgetU2phase2) + " (millions)");        
    }
}
