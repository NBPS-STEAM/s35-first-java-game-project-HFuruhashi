import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        // Initialize each variable
        int skeletonHp = 150;
        int playerHp = 100;
        boolean useHeal = true;
        int healCount = 0;

        // Print the first message
        System.out.println("Defeat the Skeleton!");

        // Loop until either HP reaches 0.
        while (skeletonHp > 0 && playerHp > 0) {
          // Show both HP
          System.out.println("\nSkeleton's HP: " + skeletonHp);
          System.out.println("Your HP: " + playerHp);

          // Show the options of player
          System.out.println("\nWhat will you do?: 1. Attack 2. Heal");
          System.out.println("Choose a number!");

          // Ask the player to input the option
          int action;
          Scanner sc = new Scanner(System.in);
          action = sc.nextInt();

          // Program for each option
          if (action == 1) {

            // Skeleton's HP decreases by 10
            skeletonHp -= 10;
            System.out.println("\nYou attacked!");
          } else if (action == 2) {
            if (useHeal == true) {

              // Your HP increases by 50 (when the HP is over 100, it will be set to 100)
              playerHp += 50;
              if (playerHp > 100) {
                playerHp = 100;
              }
              useHeal = false;
              System.out.println("You healed yourself!");
              System.out.println("Your HP: " + playerHp);
            } else {
              System.out.println("\nYou used it in the last turn. Wait until your next turn!");
            }
          } else {

            // When the player input something not in the options, print an error message
            System.out.println("Invalid Command!");
          }

          System.out.println("\nSkeleton's Multiple Attack!!");

          // Your HP decreases by 5 * 3 times
          for (int i = 0; i < 3; i++) {
            playerHp -= 5;
            System.out.println("\nYour HP: " + playerHp);
          }

          // Make Heal to be used only once every two turns.
          if (useHeal == false) {
            if (healCount == 0) {
              healCount += 1;
            } else {
              useHeal = true;
              healCount = 0;
            }
          }
        }

        // Show the final message according to the final result
        if (skeletonHp == 0 && playerHp > 0) {
          System.out.println("\nYou defeated the skeleton!!");
        } else {
          System.out.println("\nYou lost!");
        }


    }
}
