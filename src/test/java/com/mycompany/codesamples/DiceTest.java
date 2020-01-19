package com.mycompany.codesamples;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
/**
 *
 * @author baur
 */
public class DiceTest {
    private int[] expected = new int[] {1, 2, 3, 4, 5, 6};

    @Test
    public void testDice() {
        Dice dice = new Dice();
        assertTrue( Arrays.binarySearch(expected, dice.roll()) > 0);
    }
}
