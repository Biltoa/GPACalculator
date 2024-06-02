public class LetterGradeGPACalculator implements GPACalculator {
    @Override
    public double calculateGPA(int[] grades, int[] credits) {
        if (grades.length != credits.length) {
            throw new IllegalArgumentException("Grades and credits arrays must have the same length.");
        }

        int totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < grades.length; i++) {
            totalCredits += credits[i];
            totalPoints += convertLetterGradeToPoint(grades[i]) * credits[i];
        }

        return totalPoints / totalCredits;
    }

    private double convertLetterGradeToPoint(int grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;
            default: throw new IllegalArgumentException("Invalid grade: " + grade);
        }
    }
}
