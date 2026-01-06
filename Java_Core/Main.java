import java.util.Scanner;

class Dancer {
    String name;

    Dancer(String name) {
        this.name = name;
    }
}

class Team {
    String teamName;
    Dancer[] dancers = new Dancer[2];
    int count = 0;

    Team(String teamName) {
        this.teamName = teamName;
    }

    public void addDancer(String name) {
        if (count == dancers.length) {
            System.out.println(teamName + " is already full!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (dancers[i].name.equalsIgnoreCase(name)) {
                System.out.println("Dancer is already in " + teamName);
                return;
            }
        }

        dancers[count] = new Dancer(name);
        count++;
        System.out.println("Dancer is added to " + teamName);
    }

    public void viewTeam() {
        System.out.println(teamName + " Dancers:");
        for (int i = 0; i < dancers.length; i++) {
            if (dancers[i] != null) {
                System.out.println((i + 1) + ". " + dancers[i].name);
            } else {
                System.out.println((i + 1) + ". Empty");
            }
        }
    }

    public boolean searchDancer(String name) {
        for (int i = 0; i < count; i++) {
            if (dancers[i].name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}

public class DanceTeamManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Team teamA = new Team("Team A");
        Team teamB = new Team("Team B");

        while (true) {
            System.out.println("\n1. View Teams");
            System.out.println("2. Add Dancer");
            System.out.println("3. Search Dancer");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    teamA.viewTeam();
                    teamB.viewTeam();
                    break;

                case 2:
                    System.out.println("Choose Team:");
                    System.out.println("1. Team A");
                    System.out.println("2. Team B");
                    System.out.print("Enter choice: ");

                    int teamChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Dancer Name: ");
                    String name = sc.nextLine();

                    if (teamA.searchDancer(name) || teamB.searchDancer(name)) {
                        System.out.println("Error: Dancer already exists in a team!");
                    } else {
                        if (teamChoice == 1) {
                            teamA.addDancer(name);
                        } else if (teamChoice == 2) {
                            teamB.addDancer(name);
                        } else {
                            System.out.println("Invalid team choice!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Dancer name: ");
                    String searchName = sc.nextLine();

                    if (teamA.searchDancer(searchName)) {
                        System.out.println(searchName + " is in Team A");
                    } else if (teamB.searchDancer(searchName)) {
                        System.out.println(searchName + " is in Team B");
                    } else {
                        System.out.println("Dancer not found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
