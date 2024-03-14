import java.util.List;
import java.util.HashMap;

public class Bank {
    
    LoadCSV loadCSV = new LoadCSV();

    HashMap<AssetType,TraderAssetDesk> desks = new HashMap<AssetType, TraderAssetDesk>();
    int roomCounter = 0;


    protected void trade(){
        for (TraderAssetDesk traderAssetDesk : desks.values()){
            traderAssetDesk.traderGroup.checkBalances(traderAssetDesk);;
        }
    }

    public void allTrades(){
        for (int counter = 0; counter < 1; counter++){
            trade();
        }
    }

    public void setUpTraderAssetDesk(){
        for (AssetType assetType : AssetType.values()){
            addTraderAssetDeck(new TraderAssetDesk(assetType));
        }
    }

    public void addTraderAssetDeck(TraderAssetDesk traderAssetDesk){
        desks.put(traderAssetDesk.getAssetType(), traderAssetDesk);
    }



    public TraderAssetDesk getTraderAssetDesk(AssetType assetType){
        return desks.get(assetType);
    }


    protected void setUpPeople(){
        List<String[]> csvPeople = loadCSV.getCSVRows("src/main/resource/people.csv");
        for (String[] row : csvPeople){
            String role = row[0];
            AssetType assetType = AssetType.valueOf(row[3]);
            Person person = PersonFactory.createPerson(row);

            TraderAssetDesk desk = getTraderAssetDesk(assetType);
            if (desk != null) {
                desk.addTrader(person);
            }
        }
    }

    public void setUp(){
        setUpTraderAssetDesk();
        setUpPeople();
    }
    
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.setUp();
        bank.allTrades();
    }
}
