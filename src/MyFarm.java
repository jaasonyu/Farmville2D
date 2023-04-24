public class MyFarm {
    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
    }

    public MyFarm() {
        System.out.println("Hello from my Farm!");
        Plot ryan = new Plot();
        ryan.printPlot();
        //1 dimensional array
        Plot[][] grid = new Plot[10][10];
        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid.length; h++) {
            grid[p][h] =new Plot();
            grid[p][h].printPlot();
        }
    }
    }
}

