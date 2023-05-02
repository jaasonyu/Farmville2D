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
        totalCarrots();
        averageNumberOfPlants();
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
                System.out.println("row: " + j + " col: " + k + " " + grid[j][k].plantName);
            }
        }
    }

    public void totalCarrots() {
        int sumOfCarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantName.equals("carrot")) {
                sumOfCarrots += grid[h][k].numberOfPlant;
                }
            }
        }
        System.out.println("The total number of carrots is " + sumOfCarrots);
    }
    public void averageNumberOfPlants() {
        int average = 0;
        for (int q = 0; q < grid.length; q++){
            for (int o = 0; o < grid[q].length; o++){
                average += grid[q][o].numberOfPlant/(grid[q].length*grid.length);
            }
        }
        System.out.println("The average number of plants is " + average);
    }
}

