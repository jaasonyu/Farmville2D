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
        numberOfTomatoPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plotWithMaxNumber();
        plantWithMaxNumber();
        plantWithMinNumber();
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
        for (int q = 0; q < grid.length; q++) {
            for (int o = 0; o < grid[q].length; o++) {
                average += grid[q][o].numberOfPlant / (grid[q].length * grid.length);
            }
        }
        System.out.println("The average number of plants is " + average);
    }

    public void numberOfTomatoPlots() {
        int numberOfTomato = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int w = 0; w < grid[y].length; w++) {
                if (grid[y][w].plantName.equals("tomato")) {
                    numberOfTomato += 1;
                }
            }
        }
        System.out.println("The total number of plot of tomatos are  " + numberOfTomato);
    }

    public void numberOfEmptyPlots() {
        int numberOfEmpty = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int f = 0; f < grid[e].length; f++) {
                if (grid[e][f].plantName.equals("empty")) {
                    numberOfEmpty += 1;
                }
            }
        }
        System.out.println("The total number of plot that are empty are " + numberOfEmpty);
    }

    public void everyOtherNeedsWater() {
        for (int b = 0; b < grid.length; b++) {
            for (int v = 0; v < grid[b].length; v++) {
                if (v % 2 == 1) {
                    grid[b][v].printPlot();
                    grid[b][v].needsWater = true;
                    grid[b][v].printPlot();
                }
            }
        }
    }

    public void plotWithMaxNumber() {
        int maxNumber = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for (int b = 0; b < grid.length; b++) {
            for (int v = 0; v < grid[b].length; v++) {
                // which plant type has the most total plants?
                if(grid[b][v].numberOfPlant > maxNumber) {
                    maxNumber = grid[b][v].numberOfPlant;
                    name = grid[b][v].plantName;

                }
            }
        }
        System.out.println(name + " has the most plants with a total of " + maxNumber + " plants.");
    }
    public void plantWithMaxNumber() {
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                switch (grid[b][g].plantName){
                    case "corn":
                        numCorn += grid[b][g].numberOfPlant;
                        break;
                    case"sunflower":
                        numSunflower += grid[b][g].numberOfPlant;
                        break;
                    case "tomato":
                        numTomato += grid[b][g].numberOfPlant;
                        break;
                    default:
                        numCarrot += grid[b][g].numberOfPlant;
                        break;

                }
            }
        }
        if(numCorn > numCarrot && numCorn > numSunflower && numCarrot > numTomato){
            System.out.println("Corn has the most plants with " + numCorn + " plants");
        }
        if(numTomato > numCarrot && numTomato > numSunflower && numTomato > numCorn){
            System.out.println("Tomato has the most plants with " + numTomato + " plants");
        }
        if(numCarrot > numTomato && numCarrot > numSunflower && numCarrot > numCorn){
            System.out.println("Carrot has the most plants with " + numCarrot + " plants");
        }
        if(numSunflower > numCarrot && numSunflower > numTomato && numSunflower > numCorn){
            System.out.println("Sunflower has the most plants with " + numSunflower + " plants");
        }
    }
    public void plantWithMinNumber() {
        int minNumber = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                // which plant type has the most total plants?
                if(grid[b][g].numberOfPlant < minNumber) {
                    minNumber = grid[b][g].numberOfPlant;
                    name = grid[b][g].plantName;

                }
            }
        }
        System.out.println(name + " has the most plants with a total of " + minNumber + " plants.");
    }
}

