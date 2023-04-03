import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει ένα μενού επαναληπτικά, έως ότου
 * αποφασίσει ο χρήστης να εξέλθει από αυτό πληκτρολογώντας
 * την αντίστοιχη επιλογή.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.print("Παρακαλώ επιλέξτε μία από τις παραπάνω ενέργειες πληκτρολογώντας τον αντίστοιχο αριθμό: ");
            userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Επιλέξατε την Εισαγωγή.\n");
            } else if (userChoice == 2) {
                System.out.println("Επιλέξατε τη Διαγραφή.\n");
            } else if (userChoice == 3) {
                System.out.println("Επιλέξατε την Ενημέρωση.\n");
            } else if (userChoice == 4) {
                System.out.println("Επιλέξατε την Αναζήτηση.\n");
            } else if (userChoice == 5) {
                System.out.println("Επιλέξατε την Έξοδο. Καλή συνέχεια...");
            } else if (userChoice<0 || userChoice>5){
                System.out.println("Μη έγκυρη εισαγωγή. Παρακαλώ επιλέξτε ξανά.\n");
            }
        } while (userChoice != 5);
    }
}
