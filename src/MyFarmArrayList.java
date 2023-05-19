
import java.util.ArrayList;
public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>(); //array list
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList(){
        //for(Plot a : row){
        //System.out.println(row.size());
        //row.add(new Plot());
        //a.printPlot();
        //}


        System.out.println("my farm using array list");
        arr[0] = new Plot();
        arr[0].printPlot();
        for(int p = 0; p < 10; p++)
        {
            row.add(new Plot());
            row.get(p).printPlot();
        }
        totalPlants();
        printPlantNames();
        addSunflower();
        printPlantNames();
        addCorn();
        printPlantNames();
    }
    public void totalPlants(){
        int total = 0;
        for(Plot a:row){
            total += a.numberOfPlant;
        }
        System.out.println("total plant in my farm is " + total);
    }
    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for(int k = 0; k<row.size(); k++){
            System.out.print(k + ": " + row.get(k).plantName+ " \t");
        }
        System.out.println();
    }
    public void addSunflower() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot sunflower = new Plot();
        sunflower.plantName = "sunflower";
        sunflower.numberOfPlant = 42;
        sunflower.needsWater = true;
        sunflower.printPlot();
        row.add(sunflower);
    }
    public void addCorn() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot corn = new Plot();
        corn.plantName = "corn";
        corn.numberOfPlant = 70;
        corn.needsWater = true;
        corn.printPlot();
        row.add(3,corn);
    }
}



