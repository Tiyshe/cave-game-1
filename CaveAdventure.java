import java.util.Scanner;

public class CaveAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("You wake up in a dark cave.");
        System.out.println("There's a torch on the wall and a tunnel ahead.");
        System.out.print("Do you take torch '1' or walk forward '2'? ");

        input = scanner.nextLine();

        if (input.equalsIgnoreCase("1")) {
            System.out.println("You now have a torch. The cave lights up!");
            System.out.println("You see a fork: left path or right path.");
            System.out.print("Do you go left 'L' or right? 'R' ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("l")) {
                System.out.println("You find an exit! You're free!");
                 System.out.println("you go outsifde and see a car in the open forest");
                System.out.print("Do you go to the car '1' or do you start gooning '2'? ");
                input = scanner.nextLine();

                 if (input.equalsIgnoreCase("1")) {
                      System.out.println("you walk up to the old car, it still looks like it works");
                    System.out.println("you think to urself about how the cave was very scary but then decide to take action on this car");
                    System.out.print("do you force the door open '3' or break the window '4'? ");
                    input = scanner.nextLine();

                    if (input.equalsIgnoreCase("3")) {
                      System.out.println("the door opens effortlessley");
                     System.out.println("you sit down in the car seat wondering what to do next on gig");
                     System.out.print(" do you start gooning '5' or do you try to start the viechle by hot wireing it '6'? ");
                     input = scanner.nextLine();
                
            } else if (input.equalsIgnoreCase("r")) {
                System.out.println("You fall into a pit. Game over.");
                } else if (input.equalsIgnoreCase("2")) {
                System.out.println("the goon monster comes up to you and touches you, game over");
                } else if (input.equalsIgnoreCase("4")) {
                System.out.println("you cuturself on the glass and bleed out to death, nice one bud game over");
                } else if (input.equalsIgnoreCase("6")) {
                System.out.println("your dumbass dosen't know how to start a friggin car yo, so you just fumble with the wires and you cut urself and die, game over"); 

            } else {
                System.out.println("You stand still too long and get eaten by a bat. Game over.");
            }

        } else if (input.equalsIgnoreCase("2")) {
            System.out.println("You stumble in the dark and fall into a hole. Game over.");
        } else {
            System.out.println("You wait too long. Something drags you into the shadows. Game over.");
        }

        scanner.close();
    }
}
}
}
