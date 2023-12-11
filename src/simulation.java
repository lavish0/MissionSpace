import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class simulation{
    // LoadItems from text file to a list
     ArrayList<Item> loaditems(String fileName) throws FileNotFoundException{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            ArrayList<Item> items = new ArrayList<>();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] oneItem = line.split("=");
                items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));
            }
            System.out.println(fileName + "contains" + items.size() + "items");
            return items;
    }

    //Loading U1 Type Rockets
    ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> fleet = new ArrayList<>();
        Rocket R1 = new U1();
        for(Item item : items){
            while(!R1.canCarry(item)){
                fleet.add(R1);
                R1 = new U1();
            }
            R1.carry(item);
        }
        return fleet;
    }

    //Loading U2 Type Rockets
    ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> fleet = new ArrayList<>();
        Rocket R2 = new U2();
        for(Item item : items){
            while(!R2.canCarry(item)){
                fleet.add(R2);
                R2 = new U2();
            }
            R2.carry(item);
        }
        return fleet;
    }

    //Running Simulation to check the cost for each rocket type
    int runSimulation(ArrayList<Rocket> list){
        int failCounter = 0;
        for(Rocket r: list){
            while(!r.launch()){
                r.launch();
                failCounter++;
            }
            while(!r.land()){
                r.land();
                failCounter++;
            }
        }
        int budget = list.get(0).cost * (list.size() + failCounter);
        return budget;
    }
}
