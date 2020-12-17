import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        int skeletonHp = 150;
        int playerHp = 100;
        System.out.println("Defeat the Skeleton!");

        while (skeletonHp > 0 || playerHp > 0) {
          System.out.println("Skeleton's HP: " + skeletonHp);
          System.out.println("Your HP: " + playerHp);
          System.out.println("\n What will you do?: <1. Attack>");
          System.out.println("Choose a number!");
          int action;
          Scanner sc = new Scanner(System.in);
          action = sc.nextInt();

          if (action == 1) {
            skeletonHp -= 10;
          }

          playerHp -= 15;
        }


    }
}
