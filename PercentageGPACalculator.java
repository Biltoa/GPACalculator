public class PercentageGPACalculator implements GPACalculator {
    @Override
    public double calculateGPA(int[] grades, int[] credits) {
        if (grades.length != credits.length) {
            throw new IllegalArgumentException("Grades and credits arrays must have the same length.");
        }

        int totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < grades.length; i++) {
            totalCredits += credits[i];
            totalPoints += grades[i] * credits[i];
        }

        return totalPoints / totalCredits;
    }
}
