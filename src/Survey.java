import java.util.Scanner;
import java.util.ArrayList;

public class Survey
{

    private SurveyQuestion currentQuestion;

    public void conductSurvey() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Survey!");

        while (currentQuestion != null) {
            System.out.println(currentQuestion.getQuestion());

            ArrayList<String> options = currentQuestion.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Your choice (1-" + options.size() + "): ");
            int userResponse = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (userResponse >= 1 && userResponse <= options.size()) {
                String selectedOption = options.get(userResponse - 1);

                // Check if there is a next question based on the selected option
                if (currentQuestion.getNextQuestions().containsKey(selectedOption)) {
                    // Set the next question based on the user's response
                    currentQuestion = currentQuestion.getNextQuestions().get(selectedOption);
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("End of the survey. Thank you!");
    }

    public void setInitialQuestion(SurveyQuestion initialQuestion) {
        this.currentQuestion = initialQuestion;
    }
}



