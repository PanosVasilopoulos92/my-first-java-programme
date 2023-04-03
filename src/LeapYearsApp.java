import java.util.Scanner;

/**
 *  Το πρόγραμμα αυτό λαμβάνει ως είσοδο από τον χρήστη έναν ακέραιο αριθμό,
 *  που αντιπροσωπεύει ένα συγκεκριμένο έτος, και εκτυπώνει στην κονσόλα έπειτα
 *   από κάποιους υπολογισμούς αν το έτος εισόδου είναι δίσεκτο ή όχι.
 */

public class LeapYearsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;

        System.out.print("Παρακαλώ εισαγάγετε το έτος που σας ενδιαφέρει: ");
        inputYear = scanner.nextInt();

        if ((inputYear % 4 == 0) && (inputYear % 100 != 0) || (inputYear % 400 == 0)) {
            System.out.printf("Το έτος %d είναι δίσεκτο.", inputYear);
        } else {
            System.out.printf("Το έτος %d δεν είναι δίσεκτο.", inputYear);
        }
    }
}
