import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    private List<Question> questions;
    private int cursor = 0;

    public QuestionService() {
        questions = new ArrayList<>();
    }

    public QuestionService(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(String question) {
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void removeQuestion(int number) {
        try {
             questions.remove(number - 1);
         } catch(IndexOutOfBoundsException exception) {
             System.out.println("This question is not in the list of questions.");
         }
    }

    public void listQuestions() {
        for(Question q : questions) {
            System.out.println(q);
        }
    }

    public Question nextQuestion() {
        Question question = questions.get(cursor);
        cursor = (cursor + 1) % questions.size();
        return question;
    }

    public int questionCount() {
        return questions.size();
    }

}
