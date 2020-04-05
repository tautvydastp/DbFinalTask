import database.DbManager;
import entities.Answer;

import java.util.List;
import java.util.Scanner;

public class Operations {
    private static Scanner scanner = new Scanner(System.in);
    private static DbManager dbManager = new DbManager();

    public static void geografija() {
        System.out.println(dbManager.getFirstGeografijaQuestion());
        List<Answer> answer1 = dbManager.getFirstGeografijaAnswer();
        System.out.println(answer1.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(1, 1, choice1);
        System.out.println(dbManager.getSecondGeografijaQuestion());
        List<Answer> answer2 = dbManager.getSecondGeografijaAnswer();
        System.out.println(answer2.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("C")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(1, 2, choice2);
        System.out.println(dbManager.getThirdGeografijaQuestion());
        List<Answer> answer3 = dbManager.getThirdGeografijaAnswer();
        System.out.println(answer3.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice3 = scanner.nextLine();
        if (choice3.equalsIgnoreCase("A")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(1, 3, choice3);
    }

    public static void istorija() {
        System.out.println(dbManager.getFirstIstorijaQuestion());
        List<Answer> answer1 = dbManager.getFirstIstorijaAnswer();
        System.out.println(answer1.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(2, 4, choice1);
        System.out.println(dbManager.getSecondIstorijaQuestion());
        List<Answer> answer2 = dbManager.getSecondIstorijaAnswer();
        System.out.println(answer2.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("A")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(2, 5, choice2);
        System.out.println(dbManager.getThirdIstorijaQuestion());
        List<Answer> answer3 = dbManager.getThirdIstorijaAnswer();
        System.out.println(answer3.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice3 = scanner.nextLine();
        if (choice3.equalsIgnoreCase("A")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(2, 6, choice3);

    }

    public static void chemija() {
        System.out.println(dbManager.getFirstChemijaQuestion());
        List<Answer> answer1 = dbManager.getFirstChemijaAnswer();
        System.out.println(answer1.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("C")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(3, 7, choice1);
        System.out.println(dbManager.getSecondChemijaQuestion());
        List<Answer> answer2 = dbManager.getSecondChemijaAnswer();
        System.out.println(answer2.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(3, 8, choice2);
        System.out.println(dbManager.getThirdChemijaQuestion());
        List<Answer> answer3 = dbManager.getThirdChemijaAnswer();
        System.out.println(answer3.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice3 = scanner.nextLine();
        if (choice3.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(3, 9, choice3);
    }

    public static void matematika() {
        System.out.println(dbManager.getFirstMatematikaQuestion());
        List<Answer> answer1 = dbManager.getFirstMatematikaAnswer();
        System.out.println(answer1.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("A")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(4, 10, choice1);
        System.out.println(dbManager.getSecondMatematikaQuestion());
        List<Answer> answer2 = dbManager.getSecondMatematikaAnswer();
        System.out.println(answer2.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("A")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(4, 11, choice2);
        System.out.println(dbManager.getThirdMatematikaQuestion());
        List<Answer> answer3 = dbManager.getThirdMatematikaAnswer();
        System.out.println(answer3.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice3 = scanner.nextLine();
        if (choice3.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(4, 12, choice3);
    }

    public static void lietuviu() {
        System.out.println(dbManager.getFirstLietuviuQuestion());
        List<Answer> answer1 = dbManager.getFirstLietuviuAnswer();
        System.out.println(answer1.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(5, 13, choice1);
        System.out.println(dbManager.getSecondLietuviuQuestion());
        List<Answer> answer2 = dbManager.getSecondLietuviuAnswer();
        System.out.println(answer2.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("C")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(5, 14, choice2);
        System.out.println(dbManager.getThirdLietuviuQuestion());
        List<Answer> answer3 = dbManager.getThirdLietuviuAnswer();
        System.out.println(answer3.toString());
        System.out.println("Iveskite savo pasirinkima: ");
        String choice3 = scanner.nextLine();
        if (choice3.equalsIgnoreCase("B")) {
            System.out.println("Atsakymas teisingas");
        } else System.out.println("Atsakymas neteisingas");
        dbManager.insertAnswerToResults(5, 15, choice3);
    }


    public static void changeQuestion() {
        System.out.println(dbManager.getAllQuestions());
        System.out.println("Pasirinkite klausimo numeri, kuri norite koreaguoti ar pakeisti");
        int choice = scanner.nextInt();
        System.out.println("Iveskite pilna nauja klausima, kuris turi buti issaugotas, vietoje seno");
        String text = scanner.nextLine();
        dbManager.changeQuestion(choice, text);
    }

    public static void createQuestionWithCorrectA() {
        System.out.println("Pasirinkite kokia tema bus sukurtas klausimas" +
                "\n[1] Geografija" +
                "\n[2] Istorija" +
                "\n[3] Chemija" +
                "\n[4] Matematika" +
                "\n[5] Lietuviu");
        int id = scanner.nextInt();
        System.out.println("Iveskite klausima");
        String question = scanner.nextLine();
        System.out.println("[A] Iveskite teisinga atsakymo varianta");
        String answer1 = scanner.nextLine();
        System.out.println("[B] Iveskite antraji galima atsakymo varianta");
        String answer2 = scanner.nextLine();
        System.out.println("[C] Iveskite treciaji galima atsakymo varianta");
        String answer3 = scanner.nextLine();
        dbManager.createQuestionCorrectA(id, question, answer1, answer2, answer3);


    }

    public static void createQuestionWithCorrectB() {
        System.out.println("Pasirinkite kokia tema bus sukurtas klausimas" +
                "\n[1] Geografija" +
                "\n[2] Istorija" +
                "\n[3] Chemija" +
                "\n[4] Matematika" +
                "\n[5] Lietuviu");
        int id = scanner.nextInt();
        System.out.println("Iveskite klausima");
        String question = scanner.nextLine();
        System.out.println("[A] Iveskite teisinga atsakymo varianta");
        String answer1 = scanner.nextLine();
        System.out.println("[B] Iveskite antraji galima atsakymo varianta");
        String answer2 = scanner.nextLine();
        System.out.println("[C] Iveskite treciaji galima atsakymo varianta");
        String answer3 = scanner.nextLine();
        dbManager.createQuestionCorrectB(id, question, answer1, answer2, answer3);


    }

    public static void createQuestionWithCorrectC() {
        System.out.println("Pasirinkite kokia tema bus sukurtas klausimas" +
                "\n[1] Geografija" +
                "\n[2] Istorija" +
                "\n[3] Chemija" +
                "\n[4] Matematika" +
                "\n[5] Lietuviu");
        int id = scanner.nextInt();
        System.out.println("Iveskite klausima");
        String question = scanner.nextLine();
        System.out.println("[A] Iveskite teisinga atsakymo varianta");
        String answer1 = scanner.nextLine();
        System.out.println("[B] Iveskite antraji galima atsakymo varianta");
        String answer2 = scanner.nextLine();
        System.out.println("[C] Iveskite treciaji galima atsakymo varianta");
        String answer3 = scanner.nextLine();
        dbManager.createQuestionCorrectC(id, question, answer1, answer2, answer3);
    }

    public static void createQuestion() {
        System.out.println("Pasirinkite, kuris atsakymo variantas bus teisingas: A, B ar C");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("A")) {
            createQuestionWithCorrectA();
        } else if (choice.equalsIgnoreCase("B")) {
            createQuestionWithCorrectB();
        } else if (choice.equalsIgnoreCase("C")) {
            createQuestionWithCorrectC();
        }
    }

}



