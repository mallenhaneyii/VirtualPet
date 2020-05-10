package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet babyYoda = new VirtualPet(10, 10, 10, 0);

        System.out.println("Congratulations on your new Baby Yoda!");
        System.out.println("   _\n" + "< o o >\n" + "   u\n" + " (   )");
        System.out.println("What would you like to do with Baby Yoda?");
        System.out.println("1. Give Baby Yoda food");
        System.out.println("2. Give Baby Yoda a drink");
        System.out.println("3. Play with Baby Yoda");
        System.out.println("4. Nothing");
        int yodaAction = input.nextInt();

        while (yodaAction != 6) {

            if (yodaAction == 1) {
                babyYoda.feed(3);
                System.out.println("   _\n" + "< o o >\n" + "   O\n" + " (   )");
            } else if (yodaAction == 2) {
                babyYoda.water(3);
                System.out.println("   _\n" + "< o o >\n" + "   x\n" + " (   )");
            } else if (yodaAction == 3) {
                babyYoda.play(3);
                System.out.println("   _\n" + "< o o >\n" + "   u\n" + " (   )");
            } else if (yodaAction == 4) {
                babyYoda.idle(2);
                System.out.println("   _\n" + "< o o >\n" + "   `\n" + " (   )");
            } else {
                System.out.println("Baby Yoda is confused");
                System.out.println("   _ \n" + "< 0 o >\n" + "  | |");
            }

            if (babyYoda.getHunger() >= 19) {
                System.out.println("Baby Yoda died of hunger!");
                System.out.println("   _ \n" + "< x x >\n" + "  | |");
            } else if (babyYoda.getThirst() >= 19) {
                System.out.println("Baby Yoda died of thirst!");
                System.out.println("   _ \n" + "< x x >\n" + "  | |");
            } else if (babyYoda.getBoredom() >= 19) {
                System.out.println("Baby Yoda died of boredom!");
                System.out.println("   _ \n" + "< x x >\n" + "  | |");
            } else if(babyYoda.getTick() >= 900) {
                System.out.println("Baby Yoda is 900. He is now one with the force.");
                System.out.println("   _ \n" + "< x x >\n" + "  | |");
            }

            babyYoda.tick(0);

            System.out.println("Hunger: " + babyYoda.getHunger());
            System.out.println("Thirst: " + babyYoda.getThirst());
            System.out.println("Boredom: " + babyYoda.getBoredom());
            System.out.println("Age: " + babyYoda.getTick());

            System.out.println("What would you like to do with Baby Yoda next?");
            System.out.println("1. Give Baby Yoda food");
            System.out.println("2. Give Baby Yoda a drink");
            System.out.println("3. Play with Baby Yoda");
            System.out.println("4. Nothing");
            yodaAction = input.nextInt();
        }
    }
}

