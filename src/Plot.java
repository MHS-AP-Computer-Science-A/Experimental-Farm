public class Plot {
    private String cropType;
    private int cropYield;

    public Plot(String cropType, int cropYield) {
        this.cropType = cropType;
        this.cropYield = cropYield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }
}