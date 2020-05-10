package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldHaveHungerOf50() {
        VirtualPet underTest = new VirtualPet(50, 0, 0, 0);
        int hunger = underTest.getHunger();
        assertEquals(50, hunger);
    }

    @Test
    public void shouldHaveHungerOf40() {
        VirtualPet underTest = new VirtualPet(40, 0, 0, 0);
        int hunger = underTest.getHunger();
        assertEquals(40, hunger);
    }

    @Test
    public void shouldHaveHungerOf0AfterFeedingOf5() {
        VirtualPet underTest = new VirtualPet(5, 0, 0, 0);
        underTest.feed(5);
        int hunger = underTest.getHunger();
        assertEquals(0, hunger);
    }

    @Test
    public void shouldHaveThirstOf45AfterWateringOf5() {
        VirtualPet underTest = new VirtualPet(50, 50, 50, 0);
        underTest.water(5);
        int thirst = underTest.getThirst();
        assertEquals(45, thirst);
    }

    @Test
    public void shouldHaveBoredomOf0AfterPlayingOf5() {
        VirtualPet underTest = new VirtualPet(0, 0, 5, 0);
        underTest.play(5);
        int boredom = underTest.getBoredom();
        assertEquals(0, boredom);
    }

    @Test
    public void shouldHaveHungerAndThirstOf5AfterPlayOf5() {
        VirtualPet underTest = new VirtualPet(0, 0, 5, 0);
        underTest.play(5);
        int hunger = underTest.getHunger();
        int thirst = underTest.getThirst();
        assertEquals(1, hunger);
        assertEquals(1, thirst);
    }

    @Test
    public void shouldHaveThirstOf5AfterFeedOf5() {
        VirtualPet underTest = new VirtualPet(5, 0, 0, 0);
        underTest.feed(5);
        int hunger = underTest.getHunger();
        int thirst = underTest.getThirst();
        assertEquals(0, hunger);
        assertEquals(1, thirst);
    }

    @Test
    public void shouldHaveBoredomOf1AfterWaterOf2(){
        VirtualPet underTest = new VirtualPet(0,5,0, 0);
        underTest.water(2);
        int thirst = underTest.getThirst();
        int boredom = underTest.getBoredom();
        assertEquals(3, thirst);
        assertEquals(1, boredom);
    }

    @Test
    public void shouldAdd1OfEverythingAfterBeingIdle(){
        VirtualPet underTest = new VirtualPet(10,10,10, 1);
        underTest.idle(1);
        int hunger = underTest.getHunger();
        int thirst = underTest.getThirst();
        int boredom = underTest.getBoredom();
        assertEquals(11, hunger);
        assertEquals(11, thirst);
        assertEquals(11, boredom);
    }

    @Test
    public void tickShouldAdd1OfEverythingAfterIdle(){
        VirtualPet underTest = new VirtualPet(10,10,10,0);
        underTest.idle(1);
        underTest.tick(1);
        int hunger = underTest.getHunger();
        int thirst = underTest.getThirst();
        int boredom = underTest.getBoredom();
        int tick = underTest.getTick();
        assertEquals(12, hunger);
        assertEquals(12, thirst);
        assertEquals(12, boredom);
        assertEquals(1, tick);
    }

}

