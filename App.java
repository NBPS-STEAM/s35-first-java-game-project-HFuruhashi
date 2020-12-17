import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        int skeletonHp = 150;
        int playerHp = 100;
        boolean useHeal = true;
        int healCount = 0;

        System.out.println("Defeat the Skeleton!");
        while (skeletonHp > 0 && playerHp > 0) {
          System.out.println("\nSkeleton's HP: " + skeletonHp);
          System.out.println("Your HP: " + playerHp);
          System.out.println("\nWhat will you do?: 1. Attack 2. Heal");
          System.out.println("Choose a number!");
          int action;
          Scanner sc = new Scanner(System.in);
          action = sc.nextInt();

          if (action == 1) {
            skeletonHp -= 10;
            System.out.println("\nYou attacked!");
          } else if (action == 2) {
            if (useHeal == true) {
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
            System.out.println("Invalid Command!");
          }

          System.out.println("\nSkeleton's Multiple Attack!!");
          for (int i = 0; i < 3; i++) {
            playerHp -= 5;
            System.out.println("\nYour HP: " + playerHp);
          }

          if (useHeal == false) {
            if (healCount == 0) {
              healCount += 1;
            } else {
              useHeal = true;
              healCount = 0;
            }
          }
        }

        if (skeletonHp == 0 && playerHp > 0) {
          System.out.println("\nYou defeated the skeleton!!");
        } else {
          System.out.println("\nYou lost!");
        }


    }
}
