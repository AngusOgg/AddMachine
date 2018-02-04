package test.java;

import main.java.AddMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddMachineTest {

    private final AddMachine adder = new AddMachine();

    @Test
    void testAddingTwoNumbers(){
        Assertions.assertEquals(3, adder.add(1, 2));
    }


    @Test
    void testAddingOneNegativeNumber() {
        Assertions.assertEquals(1, adder.add(-1, 2));
        Assertions.assertEquals(-1, adder.add(1, -2));
    }

    @Test
    void testAddingTwoNegativeNumbers() {
        Assertions.assertEquals(-5, adder.add(-2, -3), "Should cope with double negatives!");
    }
}