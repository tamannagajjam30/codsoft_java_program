import java.util.Scanner;

public class GradeCalculator 
{
	

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int nosubjects = scanner.nextInt();

        
        double totalScore = 0;
        double maxScore = 100; 

        
        for (int i = 1; i <= nosubjects; i++) {
            System.out.print("Enter the marks of each subject " + i + ": ");
            double score = scanner.nextDouble();

            
            totalScore += score;
        }

         double totalMarks = totalScore;
        
         double averageScore = totalScore / nosubjects;

        
        double percentage = (averageScore / maxScore) * 100;

        
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

       
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        
        scanner.close();
    }
}
