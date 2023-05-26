
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
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();
        numberOfCarrotPlots();
        everyOtherNeedsWater();
        printRowInfo();
        numberOfEmptyPlots();
        plantWithMaxNumber();
    }
    public void totalPlants(){
        int total = 0;
        for(Plot a:row){
            total += a.numberOfPlant;
        }
        System.out.println("total plant in my farm is " + total);
    }
    public void printRowInfo(){
        for(Plot a:row){
            a.printPlot();
        }
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
    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        for (int m = 0; m < row.size(); m++) {
            if (row.get(m).plantName.equals("tomato")) {
                System.out.println(m);
            }
        }
    }
    public void totalCarrots() {
        // how many total carrot plants are there?
        int numberOfCarrots = 0;
        for(Plot b:row) {
            if (b.plantName.equals("carrot")) {
                numberOfCarrots += b.numberOfPlant;
            }
        }
        System.out.println("total number of carrots is " + numberOfCarrots);
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int totalNumberOfPlants = 0;
        double average = 0.0;
        for (Plot b : row) {
            totalNumberOfPlants += b.numberOfPlant;
        }
        average = totalNumberOfPlants/row.size();
        System.out.println("average number of plants per plot is " + average);
    }
    public void numberOfCarrotPlots() {
//         how many plots have carrots on them
//       call printPlantNames() method to check
        int numberOfCarrotPlots = 0;
        for (Plot n : row) {
            if (n.plantName.equals("carrot")) {
                numberOfCarrotPlots += 1;
            }
        }
        System.out.println("total number of carrot plots is " + numberOfCarrotPlots);
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check
        int numberOfEmptyPlots = 0;
        for (Plot n : row) {
            if (n.plantName.equals("empty")) {
                numberOfEmptyPlots += 1;
            }
        }
        System.out.println("total number of carrot plots is " + numberOfEmptyPlots);
    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        for(int n = 0; n<row.size();n++){
            if(n%2==1){
                row.get(n).needsWater = false;
            }
            else {
                row.get(n).needsWater = true;
            }
        }
    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }
}




