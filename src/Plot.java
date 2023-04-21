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
            plantName =="corn";
        }

    }
}
