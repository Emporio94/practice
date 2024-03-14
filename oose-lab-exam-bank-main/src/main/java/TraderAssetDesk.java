public class TraderAssetDesk {

    protected int wib = -30000;
    protected int wia = 30000;

    protected TraderGroup traderGroup;    
    private AssetType assetType;
    private int groupCounter = 1;
   

    public TraderAssetDesk(AssetType assetType){
        this.assetType = assetType;
        traderGroup = new TraderGroup(assetType.name());
    }

    public void addTrader(Person trader){
        // Grouping for Each Role
        if (trader.getRole() == Role.TEAM_LEAD){
            // Creating Unique Groups for Each Team Lead
            TraderGroup traderGroup = new TraderGroup(trader.getName() + " Group");
            newGroup.addTrader(trader);
        } else {
            traderGroup.add(trader);
        }
    }

    public String getName(){
        return assetType.name();
    }

    public AssetType getAssetType(){
        return assetType;
    }
    
}
