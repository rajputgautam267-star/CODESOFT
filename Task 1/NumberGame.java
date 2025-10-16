import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean playAgain = true;

            while (playAgain) {
                int number =(int) (Math.random() * 100) + 1;
                int attempts =0;
                int maxAttempts = 7;
                boolean correct = false;

                System.out.println("Welocome to the number guessing game!");
                System.out.println("Guess the number between 1 and 100. you have " + maxAttempts + "attempts.");

                while (!correct && attempts < maxAttempts) {
                    System.out.print( "Enter your guess:");

                    if (!sc.hasNextInt()) {
                        System.out.println( "Please enter a valid number!");
                        sc.next();
                        continue;
                    }
                    int guess = sc.nextInt();
                    attempts++;

                    if (guess == number) {
                        System.out.println("Correct! you guessed it in" + attempts + " attempts.");
                        correct = true;
                    }else if (guess < number) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too High!");
                    }

                    if (!correct && attempts < maxAttempts) {
                        System.out.println("Out of attempts! The number was " + number);
                    }

                    System.out.print("Play again? (yes/no): ");
                    String response = sc.next().toLowerCase();
                    playAgain = response.equals("yes");

                    }
                    }
                    }

                }
            }