

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    private static final String USERS_FILE = "./src/main/resources/users.json";
    private static final String QUIZZES_FILE = "./src/main/resources/quiz.json";

    public static User login(Scanner scanner) {
        System.out.print("System:> Enter your username\nUser:> ");
        String username = scanner.nextLine();
        System.out.print("System:> Enter password\nUser:> ");
        String password = scanner.nextLine();

        List<User> users = readUsersFromFile();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("System:> Welcome " + user.getUsername() + "!");
                return user;
            }
        }
        return null;
    }

    public static List<User> readUsersFromFile() {
        try (Reader reader = new FileReader(USERS_FILE)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<User>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Quiz> readQuizzesFromFile() {
        try (Reader reader = new FileReader(QUIZZES_FILE)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Quiz>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveQuizToFile(List<Quiz> quizzes) {
        try (Writer writer = new FileWriter(QUIZZES_FILE)) {
            Gson gson = new Gson();
            gson.toJson(quizzes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
