public class MyFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        // declare a 2D grid of plots

        // construct a 2D grid of plots
        // construct a 2D grid of plots
        grid = new Plot[3][4]; // 3 rows, 4 columns

        // fill a 2D grid of plots
        for(int a = 0; a < grid.length; a++) { // rows
            for (int b = 0; b < grid[a].length; b++) { // columns
                System.out.println("planting at row " + a +
                        ", column " + b);
                grid[a][b] = new Plot();
            }
        }

        // methods to write together during class

        totalCarrots();

        /***
         * for each additional method you code, call it here
         */
        totalPlants();

    }

    public void totalPlants() {
        // how many plants are there in total across all plots?
        int total = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                total = total + grid[x][y].numberOfPlants;
            }
        }
        System.out.println("The total number of plants across all plots is " + total);
    }

    public void totalCarrots() {
        // how many total carrots are there across all plots?

    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?

    }

    public void numberOfTomatoPlots() {
        // how many plots have carrots on them?

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?

    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row

    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?

    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?

    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array

    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array

    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true

    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

}