import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import database.DbManager;
import entities.User;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static DbManager dbManager = new DbManager();


    public static void runMenu() {
        LogIn logIn = new LogIn().invoke();
        long personId = logIn.getPersonId();
        List<User> userPersonId = logIn.getUserPersonId();
        if (userPersonId.toString().equals("[" + (personId) + "]")) {
            String choice = "";
            while (!choice.equals("7")) {
                adminMenu();
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        Operations.geografija();
                        break;
                    case "2":
                        Operations.istorija();
                        break;
                    case "3":
                        Operations.chemija();
                        break;
                    case "4":
                        Operations.matematika();
                        break;
                    case "5":
                        Operations.lietuviu();
                        break;
                    case "6":
                        Operations.changeQuestion();
                        break;
                    case "7":
                        Operations.createQuestion();
                        break;
                    case "8":
                        System.out.println("Is viso teisingai atsakyta: " +
                                dbManager.getAllCorrectAnswersCount());
                        break;
                    case "9":
                        System.out.println("I geografijos klausimus teisingai buvo atsakyta kartu: "
                                + dbManager.getAllCorrectGeogfrafijaAnswersCount());
                        break;
                    case "10":
                        System.out.println("I istorijos klausimus teisingai buvo atsakyta kartu: "
                                + dbManager.getAllCorrectIstorijaAnswersCount());
                        break;
                    case "11":
                        System.out.println("I chemijos klausimus teisingai buvo atsakyta kartu: "
                                + dbManager.getAllCorrectChemijaAnswersCount());
                        break;
                    case "12":
                        System.out.println("I matematikos klausimus teisingai buvo atsakyta kartu: "
                                + dbManager.getAllCorrectMatematikaAnswersCount());
                        break;
                    case "13":
                        System.out.println("I lietuviu klausimus teisingai buvo atsakyta kartu: "
                                + dbManager.getAllCorrectLietuviuAnswersCount());
                        break;
                    case "14":
                        System.out.println("Teisingu atsakymu vidurkis procentais: "
                                + dbManager.getAverageCorrectAnswersCount());
                        break;
                    case "15":
                        System.out.println("A variantu pasirinkta kartu: " + dbManager.getAnswersA());
                        break;
                    case "16":
                        System.out.println("B variantu pasirinkta kartu: " + dbManager.getAnswersB());
                        break;
                    case "17":
                        System.out.println("C variantu pasirinkta kartu: " + dbManager.getAnswersC());
                        break;
                    case "0":
                        System.out.println("BYE BYE");
                        break;
                    default:
                        System.out.println("Iveskite pasirinkima");
                }
            }
        } else {
            String choice1 = "";

            while (!choice1.equals("6")) {
                userMenu();
                choice1 = scanner.nextLine();
                switch (choice1) {
                    case "1":
                        Operations.geografija();
                        break;
                    case "2":
                        Operations.istorija();
                        break;
                    case "3":
                        Operations.chemija();
                        break;
                    case "4":
                        Operations.matematika();
                        break;
                    case "5":
                        Operations.lietuviu();
                        break;
                    case "6":
                        System.out.println("BYE BYE");
                        break;
                    default:
                        System.out.println("Iveskite pasirinkima");
                        break;
                }
            }
        }
    }


    private static void userMenu() {
        System.out.println("[1] Geografija" +
                "\n[2] Istorija" +
                "\n[3] Chemija" +
                "\n[4] Matematika" +
                "\n[5] Lietuviu" +
                "\n[6] Atsijungti");
    }

    private static void adminMenu() {
        System.out.println("[1] Geografija" +
                "\n[2] Istorija" +
                "\n[3] Chemija" +
                "\n[4] Matematika" +
                "\n[5] Lietuviu" +
                "\n[6] Pakeisti klausima" +
                "\n[7] Sukurti klausima" +
                "\n[8] Paziureti kiek is viso buvo teisingai atsakyta klausimu" +
                "\n[9] Paziureti kiek is viso buvo teisingai atsakyta geografijos klausimu" +
                "\n[10] Paziureti kiek is viso buvo teisingai atsakyta istorijos klausimu" +
                "\n[11] Paziureti kiek is viso buvo teisingai atsakyta chemijos klausimu" +
                "\n[12] Paziureti kiek is viso buvo teisingai atsakyta matematikos klausimu" +
                "\n[13] Paziureti kiek is viso buvo teisingai atsakyta lietuviu klausimu" +
                "\n[14] Paziureti teisingu atsakymu procenta" +
                "\n[15] Paziureti kiek is viso kartu buvo pasirinkta 'A'" +
                "\n[16] Paziureti kiek is viso kartu buvo pasirinkta 'B'" +
                "\n[17] Paziureti kiek is viso kartu buvo pasirinkta 'C'" +
                "\n[0] Atsijungti");
    }

    private static class LogIn {
        private long personId;
        private List<User> userPersonId;

        public long getPersonId() {
            return personId;
        }

        public List<User> getUserPersonId() {
            return userPersonId;
        }

        public LogIn invoke() {
            System.out.println("Iveskie asmens koda");
            personId = scanner.nextLong();
            userPersonId = dbManager.userValidator();
            return this;
        }
    }
}


