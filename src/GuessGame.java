import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        String username = getUsersName();

        String greeting = greetUser(username);

        System.out.println(greeting);
        System.out.println("==================================");
        System.out.println("    Welcome to the guess game.  ");
        System.out.println("==================================");

        makeLine();
        makeLine();

        menu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");

        int startGame = scanner.nextInt();

        makeLine();
        makeLine();
        switch (startGame) {
            case 1:
                int limit = 5;

                // Generate a random number.
                int randNum = randInt(20);

                while (true) {
                    if (limit == 0) {
                        System.out.println("Game Over...");

                        break;
                    }

                    // Get the user's number.
                    int u_num = takeUsersNum();

                    if (u_num == randNum) {
                        System.out.println("Congratulations!!!");
                        System.out.println("You Won.");
                        makeLine();

                        break;
                    } else if (u_num > randNum) {
                        System.out.println("Guess a smaller number.");
                        makeLine();

                    } else if (u_num < randNum) {
                        System.out.println("Guess a higher number.");
                        makeLine();

                    }

                    limit--;
                }

                break;

            case 0:
                System.out.println("Bye " + username);

                break;
        }
    }

    private static String getUsersName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");

        return scanner.next();
    }

    private static int takeUsersNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number: ");

        return scanner.nextInt();
    }

    private static String greetUser(String username) {
        return "Hi, " + username;
    }

    private static void makeLine() {
        System.out.println();
    }

    private static int randInt(int max) {
        return new Random().nextInt(max);
    }

    private static void menu() {
        System.out.println("Game Menu:");
        System.out.println("Press");
        System.out.println("1 - Start Game");
        System.out.println("0 - Abort Game");
    }
}
