import java.util.List;
import java.util.ArrayList;

public class TraderGroup{

    protected List<Person> traders = new ArrayList<>();
    protected String name;


    public TraderGroup(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void checkBalances(TraderAssetDesk traderAssetDesk){
        //Task Two
    }

    public void add(Person trader){
        // Adds a trader to this groups list of traders
        this.traders.add(trader);
    }

}
