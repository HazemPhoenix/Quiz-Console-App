import java.util.HashMap;
import java.util.Map;

public class Question {
    private int id;
    private String question;
    private Map<Character, String> options;
    private char correctOption;

    public Question(String question) {
        this.question = question;
        options = new HashMap<>();
    }

    public Question(String question, Map<Character, String> options, char correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public Question(int id, String question, Map<Character, String> options, char correctOption) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Map<Character, String> getOptions() {
        return options;
    }

    public void setOptions(Map<Character, String> options) {
        this.options = options;
    }

    public void addOption(char character, String question) {
        options.put(character, question);
    }

    public void removeOption(char character) {
        options.remove(character);
    }

    public char getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(char correctOption) {
        this.correctOption = correctOption;
    }

    public boolean isCorrect(char option) {
        return option == this.correctOption;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", question='" + question + '\'' + ", options=" + options + ", correctOption=" + correctOption + '}';
    }
}