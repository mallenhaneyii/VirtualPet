package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int boredom;
    private int tick;

    public VirtualPet(int hunger, int thirst, int boredom, int tick) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tick = tick;
    }

    public int getHunger() {
        return hunger;
    }

    public void feed(int food) {
        hunger -= food;
        thirst += 1;
        tick += 1;
    }

    public int getThirst() {
        return thirst;
    }

    public void water(int liquid) {
        thirst -= liquid;
        boredom += 1;
        tick += 1;
    }

    public int getBoredom() {
        return boredom;
        }

    public void play(int toy) {
        boredom -= toy;
        hunger += 1;
        thirst += 1;
        tick += 1;
    }

    public void idle(int nothing) {
        hunger += 1;
        thirst += 1;
        boredom += 1;
        tick += 1;
    }

    public void tick(int time){
        hunger += 1;
        thirst += 1;
        boredom += 1;
    }

    public int getTick() {
        return tick;
    }
}

