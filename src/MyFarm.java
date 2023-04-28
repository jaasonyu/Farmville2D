public class MyFarm {
    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
    }

    public Plot[][] grid;

    public MyFarm() {
        System.out.println("Hello from my Farm!");
        Plot ryan = new Plot();
        ryan.printPlot();
        //1 dimensional array
        grid = new Plot[4][3];
        for (int p = 0; p < grid.length; p++) {
            //rows
            for (int h = 0; h < grid[p].length; h++) {
                //coloums
                grid[p][h] = new Plot();
                grid[p][h].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
    }

    public void totalPlants() {
        int sumOfPlants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                System.out.println(grid[e][c].numberOfPlant);
                sumOfPlants += grid[e][c].numberOfPlant;
            }
        }
        System.out.println(sumOfPlants);
    }
    public void printPlantNames() {
        for (int j = 0; j < grid.length; j++) {
            for (int k = 0; k < grid[j].length; k++) {
                System.out.println("row: " + j + " col: " + k + " " +grid[j][k].plantName);
            }
        }
    }
}

