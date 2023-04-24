public class Plot {
    public String plantName;
    //lets other classes use planting
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
        //plantName = "sunflower";
        needsWater = true;
        numberOfPlant = (int)(Math.random() * 100)+10;
        int num = (int)(Math.random()*5);
        if(num==0){
            plantName = "sunflower";
        }
        else if (num == 1){
            plantName ="corn";
        }
        else if (num == 2){
            plantName ="carrot";
        }
        else if (num == 3){
            plantName ="tomato";
        }
        else if (num == 4){
            plantName ="empty randomly";
        }
    }
    public void printPlot(){
        System.out.println("the plot has " +numberOfPlant + " plants planted");
        System.out.println("the plant needs water? " +needsWater);
        System.out.println("the plot has " +plantName);
    }


}
