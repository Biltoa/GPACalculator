public class Main {
    public static void main(String[] args) {
        GPACalculator calculatorPercentage = new PercentageGPACalculator();
        GPACalculator calculatorLetter = new LetterGradeGPACalculator();

        int[] gradesPercentage = {90, 80, 70, 85};
        int[] creditsPercentage = {3, 3, 4, 2};

        int[] gradesLetter = {'A', 'C', 'A', 'B'};
        int[] creditsLetter = {3, 3, 4, 2};

        double gpaPercentage = calculatorPercentage.calculateGPA(gradesPercentage, creditsPercentage);
        double gpaLetter = calculatorLetter.calculateGPA(gradesLetter, creditsLetter);
        System.out.println("Calculated GPA (Percentage): " + gpaPercentage);
        System.out.println("Calculated GPA (Letters): " + gpaLetter);

    }
}
