package com.mycompany.codesamples;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
/**
 *
 * @author baur
 */
public class CoinTest {
    private String[] expected = new String[] {"Heads", "Tails"};

    @Test
    public void testCoin() {
        Coin coin = new Coin();
        assertTrue(Arrays.asList(expected).contains(coin.getFaceUp()));
    }
}
