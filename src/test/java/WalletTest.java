import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void test_wallet_created(){
        Wallet wallet=new Wallet(500000);
        double actual=wallet.getSolde();
        assertEquals(500000.0,actual);
    }
}
