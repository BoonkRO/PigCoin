package org.mvpigs.pigcoin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WalletTest {

    @Test
    public void testWallet(){
        Wallet cartera1 = new Wallet();
        assertEquals(0d, cartera1.getTotal_input(), 0d);
        assertEquals(0d, cartera1.getTotal_output(), 0d);
        assertEquals(0d, cartera1.getBalance(), 0d);
    }


}
