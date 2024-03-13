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

    public void addTrader(Trader trader){
        //Task One
    }

    public String getName(){
        return assetType.name();
    }

    public AssetType getAssetType(){
        return assetType;
    }
    
}
