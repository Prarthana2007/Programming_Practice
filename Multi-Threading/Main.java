import java.util.Scanner;
class TimeBomb extends Thread {
    boolean isDefused = false;

    public void run() {
        try {
            for(int i=10;i>=0;i--)
            {
                if (isDefused) {
                    System.out.println("Bomb Defused!");
                    return;
                }

                System.out.println("Bomb exploding in" + i + " seconds!");
                Thread.sleep(1000);
            }
            System.out.println("Bomb exploded!");
        } catch (InterruptedException e) {
            System.out.println("Bomb Defused!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        TimeBomb bomb = new TimeBomb();
        bomb.start();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to defuse:");
        String password = sc.nextLine();

        if (password.equals("8000")) {
            bomb.isDefused = true;
        }
        else {
            System.out.println("Wrong password!");
        }
        sc.close();
    }
}
