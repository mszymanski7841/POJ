import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("slowa.txt"));
        Scanner usersInput = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        Random random = new Random();

        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }

        int randomNumber = random.nextInt(words.size());
        String randomWord = words.get(randomNumber);
        StringBuilder secretWord = new StringBuilder();

        System.out.println(randomWord);
        int attempts = 8;
        encryptWord(secretWord, randomWord);
        while (true) {
            if (attempts > 0) {
                System.out.println("Podaj literę:");
                String letter = usersInput.nextLine();
                letter = letter.toLowerCase();
                if (checkSyntax(letter)) {
                    if (letters.contains(letter.charAt(0))) {
                        System.out.println("Podana litera została już wykorzystana!");
                    } else {
                        letters.add(letter.charAt(0));
                        if (checkLetter(letter, randomWord)) {
                            System.out.println("Podana litera nie występuje w wyrazie!");
                            attempts--;
                            drawHangman(attempts);
                        } else if (usersLetter(usersInput, randomWord, secretWord, letters)) {
                            System.out.println("Brawo wygrałeś!");
                            break;
                        }
                    }
                }else {
                    System.out.println("Podano nieprawidłową literę!");
                }
            } else {

                System.out.println("Przegrałeś! Wylosowane słowo to: " + randomWord);
                break;
            }
        }
    }


    private static void encryptWord(StringBuilder secretWord, String randomWord) {
        for (int i = 0; i < randomWord.length(); i++) {
            secretWord.append('_');
        }
        System.out.println(secretWord);
    }

    private static boolean usersLetter(Scanner usersInput, String randomWord, StringBuilder secretWord, List<Character> letters) {
        int correctCount = 0;

        for (int i = 0; i < randomWord.length(); i++) {
            if (letters.contains(randomWord.charAt(i))) {
                secretWord.setCharAt(i, randomWord.charAt(i));
                correctCount++;
            }
        }
        System.out.println(secretWord);
        return (randomWord.length() == correctCount);
    }

    private static boolean checkLetter(String letter, String randomWord) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (letter.equals(String.valueOf(randomWord.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSyntax(String letter) {
        if (letter.isEmpty() || !letter.matches("[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]")) {
            return false;
        }
        return true;
    }

    private static void drawHangman(int attempts) {
        if (attempts == 7) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 6) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println(" 0      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 5) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println(" 0      |");
            System.out.println("\\       |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 4) {
            System.out.println("  --------");
            System.out.println("  |      |");
            System.out.println("  0      |");
            System.out.println("\\ |      |");
            System.out.println("         |");
            System.out.println("         |");
        }

        if (attempts == 3) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("          |");
            System.out.println("          |");
        }
        if (attempts == 2) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println("          |");
        }
        if (attempts == 1) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println(" /        |");
        }
        if (attempts == 0) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println(" / \\      |");

        }
    }

}