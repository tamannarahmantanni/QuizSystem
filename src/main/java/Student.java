import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {

    public void takeQuiz(Scanner scanner) {
        List<Quiz> quizList = FileUtil.readQuizzesFromFile();
        Random random = new Random();
        int score = 0;

        System.out.println("System:> Welcome to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
        String start = scanner.nextLine();

        if (start.equals("s")) {
            for (int i = 0; i < 10; i++) {
                Quiz quiz = quizList.get(random.nextInt(quizList.size()));
                System.out.println("[Question " + (i + 1) + "] " + quiz.getQuestion());
                System.out.println("1. " + quiz.getOption1());
                System.out.println("2. " + quiz.getOption2());
                System.out.println("3. " + quiz.getOption3());
                System.out.println("4. " + quiz.getOption4());

                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == quiz.getAnswerkey()) {
                    score++;
                }
            }

            System.out.println("Your score: " + score + "/10");
            if (score >= 8) {
                System.out.println("Excellent! You have got " + score + " out of 10");
            } else if (score >= 5) {
                System.out.println("Good. You have got " + score + " out of 10");
            } else if (score >= 2) {
                System.out.println("Very poor! You have got " + score + " out of 10");
            } else {
                System.out.println("Very sorry you are failed. You have got " + score + " out of 10");
            }

            System.out.print("Would you like to start again? press s for start or q for quit\n");
            String choice = scanner.nextLine();
            if (choice.equals("s")) {
                takeQuiz(scanner);
            }
        }
    }
}
