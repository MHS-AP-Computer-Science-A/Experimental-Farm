public class ExperimentalFarm {

    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p) {
        this.farmPlots = p;
    }

    /**
     * Returns the plot with the highest yield for a given crop type, as described
     * in part (a).
     */
    public Plot getHighestYield(String c) {
        /* to be implemented in part (a) */
        Plot result = null;
        int max = 0;
        for(Plot[] row : farmPlots){
            for(Plot p : row){
                if(p.getCropType().equals(c) && p.getCropYield() > max){
                    max = p.getCropYield();
                    result = p;
                }
            }
        }

        return result;
    }

    /**
     * Returns true if all plots in a given column in the two-dimensional array
     * farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */
    public boolean sameCrop(int col) {
        /* to be implemented in part (b) */

        String crop = farmPlots[0][col].getCropType();
        for(int row = 1; row < farmPlots.length; row++){
            if(!crop.equals(farmPlots[row][col].getCropType())){
                return false;
            }
        }

        return true;
    }

}