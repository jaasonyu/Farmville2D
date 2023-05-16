
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
    }
    public void totalPlants(){
        int total = 0;
        for(Plot a:row){
            total += a.numberOfPlant;
        }
        System.out.println("total plant in my farm is " + total);
    }
}



