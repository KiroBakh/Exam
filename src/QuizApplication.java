import java.util.Scanner;


public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5;
        int score = 0;

        System.out.println("Welcome to the Present Continue Quiz!");
        System.out.println("Answer the following questions by entering the corresponding letter (a, b, c, d).");
        System.out.println("Enter 'q' at any time to quit the quiz.\n");

        String[] questions = {
                "What is the third-person singular form of the verb 'go'?",
                "Which option is correct for the sentence 'She ____ to the park every day.'?",
                "Choose the correct form of the verb: 'He ____ football on Saturdays.'",
                "What is the negative form of the sentence 'I eat apples.'?",
                "Which option is correct for the sentence 'Do they ____ English?'?"
        };
        String[] options = {
                "a) goes\nb) go\nс) going\nd) goed",
                "a) go\nb) goes\nc) to go\nd) going",
                "a) play\nb) plays\nc) playing\nd) played",
                "a) I not eat apples.\nb) I don't eat apples.\nc) I doesn't eat apples.\nd) I not eats apples.",
                "a) speak\nb) speaks\nc) speaking\nd) spoke"
        };
        String[] correctAnswers = {"a", "b", "b", "b", "a"};

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);

            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("q")) {
                System.out.println("Quiz ended. Goodbye!");
                return;
            }

            while (!userAnswer.matches("[abcd]")) {
                System.out.println("Invalid option. Please enter a valid answer (a, b, c, d) or 'q' to quit:");
                userAnswer = scanner.nextLine().toLowerCase();
            }

            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            }

            System.out.println();
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);
        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Percentage: " + percentage + "%");

        System.out.println("\nAdministrator View:");
        System.out.println("Enter the password to view the correct answers:");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Correct Answers:");
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println("Question " + (i + 1) + ": " + correctAnswers[i]);
            }
        } else {
            System.out.println("Incorrect password. The correct answers cannot be displayed.");
        }
    }
}
