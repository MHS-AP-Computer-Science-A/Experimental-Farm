public class FarmTester
{
    public static void main(String[] args)
    {
        // Create the farm data (4 rows x 3 columns)
        Plot[][] plots = {
            { new Plot("corn", 50),  new Plot("corn", 45),  new Plot("wheat", 30) },
            { new Plot("peas", 40),  new Plot("corn", 60),  new Plot("corn", 70) },
            { new Plot("wheat", 55), new Plot("corn", 65),  new Plot("peas", 40) },
            { new Plot("corn", 35),  new Plot("corn", 50),  new Plot("peas", 40) }
        };

        // Create the ExperimentalFarm object
        ExperimentalFarm farm = new ExperimentalFarm(plots);

        System.out.println("===== TESTING getHighestYield =====");

        // Test 1: crop exists multiple times
        Plot test1 = farm.getHighestYield("corn");
        if (test1 != null)
            System.out.println("Highest corn yield: " 
                + test1.getCropType() + " " + test1.getCropYield());
        else
            System.out.println("No corn plots found.");

        // Test 2: crop exists but tied values possible
        Plot test2 = farm.getHighestYield("peas");
        if (test2 != null)
            System.out.println("Highest peas yield: " 
                + test2.getCropType() + " " + test2.getCropYield());
        else
            System.out.println("No peas plots found.");

        // Test 3: crop does not exist
        Plot test3 = farm.getHighestYield("bananas");
        if (test3 != null)
            System.out.println("Highest bananas yield: " 
                + test3.getCropType() + " " + test3.getCropYield());
        else
            System.out.println("No bananas plots found.");

        System.out.println("\n===== TESTING sameCrop =====");

        // Column 0 -> should be false
        System.out.println("Column 0 same crop? " + farm.sameCrop(0));

        // Column 1 -> should be true (all corn)
        System.out.println("Column 1 same crop? " + farm.sameCrop(1));

        // Column 2 -> should be false
        System.out.println("Column 2 same crop? " + farm.sameCrop(2));
    }
}
