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
        return Character.toLowerCase(option) == Character.toLowerCase(correctOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(question).append("\n");

        options.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    sb.append(entry.getKey())
                            .append(") ")
                            .append(entry.getValue())
                            .append("\n");
                });

        return sb.toString();
    }
}