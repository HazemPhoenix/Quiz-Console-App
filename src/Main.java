public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("Where do the pyramids exist?");
        q1.addOption('A', "Egypt");
        q1.addOption('B', "France");
        q1.addOption('C', "India");
        q1.addOption('D', "Japan");
        q1.setCorrectOption('A');
        System.out.println(q1);
        System.out.println("-----------------------");
        System.out.println(q1.isCorrect('A'));
        System.out.println(q1.isCorrect('B'));
        System.out.println(q1.isCorrect('C'));
        System.out.println(q1.isCorrect('D'));
        System.out.println("-----------------------");
        q1.setCorrectOption('B');
        System.out.println(q1.isCorrect('A'));
        System.out.println(q1.isCorrect('B'));
    }
}