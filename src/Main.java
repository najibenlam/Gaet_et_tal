//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean igen = true;
        while (igen) {
            System.out.println("====== GÆT ET TAL ====== ");
            System.out.println("Du skal gætte et tal mellem");
            System.out.println("det interval du vælger.");
            System.out.println("Vælger du forkert, får du at vide ");
            System.out.println("om du skal højere op eller lavere ned.");
            System.out.println("======== LEVELS ========");
            System.out.println("Let: 1-10, ∞ forsøg (1)");
            System.out.println("Mellem: 1-50, 10 forsøg (2)");
            System.out.println("Svær: 1-100, 7 forsøg (3)");
            System.out.println("Bonus: 1-5, 2 forsøg (4)");
            System.out.println("Vælg en sværhedsgrads (1, 2 eller 3) for at begynde spillet.");
            System.out.println("Tast 0 for at afslutte spillet.");
            System.out.println("========================");
            int level = input.nextInt();
            System.out.println(level(level));
            int tal = randomTal(level);
            int maxForsøg = maxForsøg(level);
            spilSpillet(tal, maxForsøg, input);
            igen = spilIgen(input);
        }

    }

    static int maxForsøg(int level) {
        if (level == 1) {
            return -1;
        } else if (level == 2) {
            return 10;
        } else if (level == 3) {
            return 7;
        } else if (level == 4) {
            return 2;
        } else {
            return 0;
        }
    }


    static String level(int level) {
        if (level == 1) {
            return "Level 1. Gæt et tal mellem 1-10";
        } else if (level == 2) {
            return "Level 2. Gæt et tal mellem 1-50";
        } else if (level == 3) {
            return "Level 3. Gæt et tal mellem 1-100";
        } else if (level == 4) {
            return "Level 4. Gæt et tal mellem 1-5. Du har 2 forsøg";
        } else {
            return "Ugyldigt valg. Vælg 1,2 eller 3.";
        }
    }

    static int randomTal(int level) {
        if (level == 1) {
            return (int) (Math.random() * 10) + 1;
        } else if (level == 2) {
            return (int) (Math.random() * 50) + 1;
        } else if (level == 3) {
            return (int) (Math.random() * 100) + 1;
        } else if (level == 4) {
            return (int) (Math.random() * 5) + 1;
        } else {
            return 0;
        }
    }

    static void spilSpillet(int randomTal, int maxForsøg, Scanner input) {
        int gæt = 0;
        int forsøg = 0;

        while (gæt != randomTal && (maxForsøg == -1 || forsøg < maxForsøg)) {
            System.out.println("Gæt et tal:");
            gæt = input.nextInt();
            forsøg++;

            if (gæt < randomTal) {
                System.out.println("For lavt!");
            } else if (gæt > randomTal) {
                System.out.println("For højt!");
            } else {
                System.out.println("Korrekt!");
                System.out.println("Du brugte " + forsøg + " forsøg.");
            }
            if(maxForsøg != -1) {
                System.out.println("Du har " + (maxForsøg-forsøg) + " forsøg tilbage.");
            }
        }



            if (gæt != randomTal) {
                System.out.println("Du har brugt alle dine forsøg.");
                System.out.println("Det rigtige tal var: " + randomTal);
            }
        }
        static boolean spilIgen(Scanner input) {
            System.out.println("Vil du spille igen?");
            System.out.println("1. Ja");
            System.out.println("2. Nej");
            int valg = input.nextInt();

            switch (valg){
                case 1:
                    return true;
                case 2:
                    System.out.println("Spillet er slut.");
                    return false;
                default:
                    System.out.println("Ugyldigt valg.");
                    return false;
            }
        }
    }




