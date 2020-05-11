package virtual_pet;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet babyYoda = new VirtualPet(10, 10, 10, 10, 0);

        System.out.println("      ________________.  ___     .______\n" +
                "     /                | /   \\    |   _  \\\n" +
                "    |   (-----|  |----`/  ^  \\   |  |_)  |\n" +
                "     \\   \\    |  |    /  /_\\  \\  |      /\n" +
                ".-----)   |   |  |   /  _____  \\ |  |\\  \\-------.\n" +
                "|________/    |__|  /__/     \\__\\| _| `.________|\n" +
                " ____    __    ____  ___     .______    ________.\n" +
                " \\   \\  /  \\  /   / /   \\    |   _  \\  /        |\n" +
                "  \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----`\n" +
                "   \\            / /  /_\\  \\  |      /  \\   \\\n" +
                "    \\    /\\    / /  _____  \\ |  |\\  \\---)   |\n" +
                "     \\__/  \\__/ /__/     \\__\\|__| `._______/");
        System.out.println("Congratulations on your new Baby Yoda!");
        System.out.println("He is just a youngling but one day he");
        System.out.println("hopes to become a Jedi Master! Baby Yoda");
        System.out.println("is relying on you to train and take care");
        System.out.println("of him.");
        System.out.println("");
        System.out.println("But the evil empire also has hopes for the");
        System.out.println("young Baby Yoda. Keep him out of their reach");
        System.out.println("to save the galaxy...");
        System.out.println("");


        System.out.println("----------------------------");
        System.out.println("   _\n" + "< o o >\n" + "   u\n" + " (   )");
        System.out.println("What would you like to do with Baby Yoda?");
        System.out.println("1. Give Baby Yoda food");
        System.out.println("2. Give Baby Yoda a drink");
        System.out.println("3. Play with Baby Yoda");
        System.out.println("4. Use the force");
        System.out.println("5. Nothing");
        System.out.println("66. Sell Baby Yoda to the Empire!");
        int yodaAction = input.nextInt();

        while (babyYoda.getForce() < 100) {

            if (yodaAction == 1) {
                babyYoda.feed(5);
                System.out.println("   _\n" + "< o o >\n" + "   O\n" + " (   )");
                System.out.println("Hunger decreased by 5");
            } else if (yodaAction == 2) {
                babyYoda.water(5);
                System.out.println("   _\n" + "< o o >\n" + "   x\n" + " (   )");
                System.out.println("Thirst decreased by 5");
            } else if (yodaAction == 3) {
                babyYoda.play(5);
                System.out.println("   _\n" + "< o o >\n" + "   u\n" + " (   )");
                System.out.println("Boredom decreased by 5");
            } else if (yodaAction == 5) {
                babyYoda.idle(1);
                System.out.println("   _\n" + "< o o >\n" + "   `\n" + " (   )");
            } else if (yodaAction == 4) {
                babyYoda.use(1);
                System.out.println("   _\n" + "< - - >\n" + "   - c\"  \n" + " (   )");
                System.out.println("Baby Yoda used the force");
            } else if (yodaAction == 66) {
                System.out.println("You sold Baby Yoda to the Empire");
                System.out.println("   _\n" + "< o o >\n" + "   ^'  \n" + " (   )\n");
                System.out.println("Game Over");
                break;
            } else {
                babyYoda.confused(1);
                System.out.println("   _\n" + "< o o >\n" + "   ~  \n" + " (   )");
                System.out.println("Baby Yoda is confused");
            }

            if (babyYoda.getHunger() >= 29) {
                System.out.println("----------------------------");
                System.out.println("Baby Yoda died of hunger!");
                System.out.println("   _\n" + "< x x >\n" + "   -  \n" + " (   )");
                System.out.println("Game Over. Thanks for playing.");
                break;
            } else if (babyYoda.getThirst() >= 29) {
                System.out.println("----------------------------");
                System.out.println("Baby Yoda died of thirst!");
                System.out.println("   _\n" + "< x x >\n" + "   -  \n" + " (   )");
                System.out.println("Game Over. Thanks for playing.");
                break;
            } else if (babyYoda.getBoredom() >= 29) {
                System.out.println("----------------------------");
                System.out.println("Baby Yoda died of boredom!");
                System.out.println("   _\n" + "< x x >\n" + "   -  \n" + " (   )");
                System.out.println("Game Over. Thanks for playing.");
                break;
            } else if (babyYoda.getTick() >= 100) {
                System.out.println("----------------------------");
                System.out.println("Baby Yoda is 900. He is now one with the force.");
                System.out.println("   _\n" + "< x x >\n" + "   -  \n" + " (   )");
                System.out.println("Game Over. Thanks for playing.");
                break;
            } else if (babyYoda.getForce() >= 99) {
                System.out.println("Baby Yoda is now a Jedi Master!");
                System.out.println("Trained hard you have. Thankful Yoda is.");
                System.out.println("");
                System.out.println(" ********** **                    ********               **      \n" +
                        "/////**/// /**                   /**/////               /**      \n" +
                        "    /**    /**       *****       /**       *******      /**      \n" +
                        "    /**    /******  **///**      /******* //**///**  ******      \n" +
                        "    /**    /**///**/*******      /**////   /**  /** **///**      \n" +
                        "    /**    /**  /**/**////       /**       /**  /**/**  /**      \n" +
                        "    /**    /**  /**//******      /******** ***  /**//******      \n" +
                        "    //     //   //  //////       //////// ///   //  //////   ");
                break;
            } else if (babyYoda.getForce() >= 66) {
                System.out.println("Baby Yoda is a Jedi Knight");
            } else if (babyYoda.getForce() >= 33) {
                System.out.println("Baby Yoda is a Padawan");
            }

            babyYoda.tick(0);

            System.out.println("");
            if (babyYoda.getHunger() >= 23) {
                System.out.println("Awfully hungry, Baby Yoda is");
            } else if (babyYoda.getThirst() >= 23) {
                System.out.println("Very thirsty, Baby Yoda is");
            } else if (babyYoda.getBoredom() >= 23) {
                System.out.println("Extremely bored, Baby Yoda is");
            }

            System.out.println("Hunger: " + babyYoda.getHunger());
            System.out.println("Thirst: " + babyYoda.getThirst());
            System.out.println("Boredom: " + babyYoda.getBoredom());
            System.out.println("Ability: " + babyYoda.getForce());
            System.out.println("Age: " + babyYoda.getTick());
            System.out.println("----------------------------");


            System.out.println("What would you like to do with Baby Yoda next?");
            System.out.println("1. Give Baby Yoda food");
            System.out.println("2. Give Baby Yoda a drink");
            System.out.println("3. Play with Baby Yoda");
            System.out.println("4. Use the force");
            System.out.println("5. Nothing");
            System.out.println("66. Sell Baby Yoda to the Empire!");
            yodaAction = input.nextInt();
        }
    }
}

