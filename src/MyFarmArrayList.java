
import java.util.ArrayList;
public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>; //array list
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList(){
        System.out.println("my farm using array list");
        arr[0] = new Plot();
        arr[0].printPlot();
        for(int p = 0; p < 10; p++)
        {
            row.add(new Plot());
        }
    }
}