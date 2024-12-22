import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = FileUtil.login(scanner);

        if (user != null) {
            if (user.getRole().equals("admin")) {
                Admin admin = new Admin();
                admin.manageQuestions(scanner);
            } else {
                Student student = new Student();
                student.takeQuiz(scanner);
            }
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }
}
