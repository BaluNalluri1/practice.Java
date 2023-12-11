import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SurveyQuestion{
        private String question;
        private ArrayList<String> options;
        private Map<String, SurveyQuestion> nextQuestions;

        public SurveyQuestion(String question, ArrayList<String> options) {
            this.question = question;
            this.options = options;
            this.nextQuestions = new HashMap<>();
        }

        public String getQuestion() {
            return question;
        }

        public ArrayList<String> getOptions() {
            return options;
        }

        public Map<String, SurveyQuestion> getNextQuestions() {
            return nextQuestions;
        }

        public void addOption(String option, SurveyQuestion nextQuestion) {
            options.add(option);
            nextQuestions.put(option, nextQuestion);
        }
}





