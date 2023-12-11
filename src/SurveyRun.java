import java.util.ArrayList;


public class SurveyRun
{
    public static void main(String[] args) {
        Survey survey = new Survey();

        // Construct the survey dynamically based on user responses
        SurveyQuestion rootQuestion = new SurveyQuestion("What is your favorite color?", new ArrayList<>());
        SurveyQuestion likeRedQuestion = new SurveyQuestion("Do you like the color red?", new ArrayList<>());
        SurveyQuestion likeBlueQuestion = new SurveyQuestion("Do you like the color blue?", new ArrayList<>());
        SurveyQuestion favoriteFoodQuestion = new SurveyQuestion("What is your favorite food?", new ArrayList<>());

        rootQuestion.addOption("Red", likeRedQuestion);
        rootQuestion.addOption("Blue", likeBlueQuestion);

        likeRedQuestion.addOption("Yes", favoriteFoodQuestion);
        likeRedQuestion.addOption("No", likeBlueQuestion); // Skip to the next color question

        likeBlueQuestion.addOption("Yes", favoriteFoodQuestion);
        likeBlueQuestion.addOption("No", favoriteFoodQuestion); // Skip to the food question directly

        // Set initial question and start the survey
        survey.setInitialQuestion(rootQuestion);
        survey.conductSurvey();
    }
}
