import java.util.Arrays;

public class BirthdayParadox {

    // Number of days in a (non-leap) year
    private static final int DAYS_IN_YEAR = 365;

    // How many experiments to run for each group size
    private static final int TRIALS = 10_000;

    public static void main(String[] args) {

        int[] groupSizes = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                            55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        System.out.println("Birthday Paradox Simulation");
        System.out.println("Trials per group size: " + TRIALS);
        System.out.println();
        System.out.println(" n\tEstimated P(duplicate birthday)");
        System.out.println("------------------------------------");

        for (int n : groupSizes) {
            double probability = estimateDuplicateProbability(n, TRIALS);
            System.out.printf("%3d\t%.4f%n", n, probability);
        }
    }

    /**
     * Runs 'trials' experiments for a group of size n,
     * and returns the fraction of experiments that had
     * at least one shared birthday.
     */
    private static double estimateDuplicateProbability(int n, int trials) {
        int countWithDuplicate = 0;

        for (int t = 0; t < trials; t++) {
            if (hasDuplicateBirthday(n)) {
                countWithDuplicate++;
            }
        }

        return (double) countWithDuplicate / trials;
    }

    /**
     * Returns true if, in a group of size n, at least two people
     * share a birthday. Birthdays are modeled as uniformly random
     * integers from 0 to 364.
     */
    private static boolean hasDuplicateBirthday(int n) {
        boolean[] seen = new boolean[DAYS_IN_YEAR];

        for (int i = 0; i < n; i++) {
            int birthday = (int) (Math.random() * DAYS_IN_YEAR); // 0–364

            if (seen[birthday]) {
                // We have already seen this birthday → duplicate
                return true;
            }
            seen[birthday] = true;
        }

        // No duplicates found
        return false;
    }
}
