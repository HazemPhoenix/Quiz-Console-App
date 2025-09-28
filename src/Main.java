import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> o1 = new HashMap<>();
        o1.put('A', "Egypt");
        o1.put('B', "France");
        o1.put('C', "India");
        o1.put('D', "Japan");
        Question q1 = new Question("Where do the pyramids exist?", o1, 'A');

        Map<Character, String> o2 = new HashMap<>();
        o2.put('A', "H2O");
        o2.put('B', "O2");
        o2.put('C', "CO2");
        o2.put('D', "NaCl");
        Question q2 = new Question("What is the chemical symbol for water?", o2, 'A');

        Map<Character, String> o3 = new HashMap<>();
        o3.put('A', "const");
        o3.put('B', "static");
        o3.put('C', "final");
        o3.put('D', "var");
        Question q3 = new Question("Which keyword is used to define a constant in Java?", o3, 'C');

        Map<Character, String> o4 = new HashMap<>();
        o4.put('A', "Toronto");
        o4.put('B', "Vancouver");
        o4.put('C', "Montreal");
        o4.put('D', "Ottawa");
        Question q4 = new Question("What is the capital of Canada?", o4, 'D');

        Map<Character, String> o5 = new HashMap<>();
        o5.put('A', "Vincent van Gogh");
        o5.put('B', "Leonardo da Vinci");
        o5.put('C', "Pablo Picasso");
        o5.put('D', "Claude Monet");
        Question q5 = new Question("Who painted the Mona Lisa?", o5, 'B');

        QuestionService questionService = new QuestionService();
        questionService.addQuestion(q1);
        questionService.addQuestion(q2);
        questionService.addQuestion(q3);
        questionService.addQuestion(q4);
        questionService.addQuestion(q5);

        questionService.play();
    }
}