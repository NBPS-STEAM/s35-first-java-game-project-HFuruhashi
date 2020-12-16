public class App {
    public static void main(String[] args) {
        int skeletonHp = 150;
        int playerHp = 100;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Defeat the Skeleton!");

        while (skeletonHp > 0 || playerHp > 0) {
          System.out.println("Skeleton's HP: " + skeletonHp);
          System.out.println("Your HP: " + playerHp);
          System.out.println("Choose a number!");
          int action = myObj.nextInt();

          if (action == 1) {
            skeletonHp -= 10;
          }

          playerHp -= 15;
        }


    }
}
