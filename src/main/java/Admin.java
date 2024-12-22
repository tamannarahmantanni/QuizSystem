

import java.util.List;
import java.util.Scanner;

public class Admin {

    public void manageQuestions(Scanner scanner) {
        List<Quiz> quizList = FileUtil.readQuizzesFromFile();

        while (true) {
            System.out.print("System:> Input your question\nAdmin:> ");
            String question = scanner.nextLine();
            System.out.print("System: Input option 1:\nAdmin:> ");
            String option1 = scanner.nextLine();
            System.out.print("System: Input option 2:\nAdmin:> ");
            String option2 = scanner.nextLine();
            System.out.print("System: Input option 3:\nAdmin:> ");
            String option3 = scanner.nextLine();
            System.out.print("System: Input option 4:\nAdmin:> ");
            String option4 = scanner.nextLine();
            System.out.print("System: What is the answer key?\nAdmin:> ");
            int answerKey = Integer.parseInt(scanner.nextLine());

            Quiz newQuiz = new Quiz(question, option1, option2, option3, option4, answerKey);
            quizList.add(newQuiz);

            FileUtil.saveQuizToFile(quizList);

            System.out.print("System:> Saved successfully! Do you want to add more questions? (press s for start and q for quit)\n");
            String choice = scanner.nextLine();
            if (choice.equals("q")) {
                break;
            }
        }
    }
}
