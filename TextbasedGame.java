import java.util.Scanner;
import java.util.Random;

public class TextbasedGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] players = {"A", "B", "C", "D", "E"};
        boolean[] alive = {true, true, true, true, true};

        int mafiaIndex = rand.nextInt(players.length);
        int day = 1;

        System.out.println("=== TEXT BASED MAFIA GAME ===");

        while (true) {

            /* CHECK END CONDITION BEFORE NIGHT */
            int aliveCount = 0;
            for (boolean status : alive) {
                if (status) aliveCount++;
            }

            if (alive[mafiaIndex] && aliveCount == 2) {
                System.out.println("\nOnly two players left...");
                System.out.println(" Mafia Wins! ");
                break;
            }

            System.out.println("\n--- Day " + day + " ---");

            /* NIGHT PHASE */
            System.out.println("Night has come...");

            int killIndex;
            do {
                killIndex = rand.nextInt(players.length);
            } while (killIndex == mafiaIndex || !alive[killIndex]);

            alive[killIndex] = false;
            System.out.println("Player " + players[killIndex] + " was killed during the night!");

            /* CHECK IF MAFIA DIED AT NIGHT */
            if (!alive[mafiaIndex]) {
                System.out.println("\nMafia was killed during the night!");
                System.out.println(" YOU WIN ");
                break;
            }

            /* DAY PHASE */
            System.out.println("\nAlive Players:");
            for (int i = 0; i < players.length; i++) {
                if (alive[i]) {
                    System.out.println(i + " : Player " + players[i]);
                }
            }

            System.out.print("\nWho do you suspect? Enter player number: ");
            int choice = sc.nextInt();

            /* INPUT VALIDATION */
            if (choice < 0 || choice >= players.length || !alive[choice]) {
                System.out.println("Invalid choice! Choose a living player.");
                continue;
            }

            if (choice == mafiaIndex) {
                System.out.println("\nYou found the Mafia!");
                System.out.println(" YOU WIN ");
                break;
            } else {
                System.out.println("Wrong choice! Player " + players[choice] + " was innocent.");
                alive[choice] = false;
            }

            /* CHECK END CONDITION AFTER DAY VOTE */
            int aliveAfterVote = 0;
            for (boolean status : alive) {
                if (status) aliveAfterVote++;
            }

            if (alive[mafiaIndex] && aliveAfterVote == 2) {
                System.out.println("\nOnly two players left...");
                System.out.println(" Mafia Wins! ");
                break;
            }

            day++;
        }

        System.out.println("\n=== GAME OVER ===");
        sc.close();
    }
}
