import br.ufjf.model.Investidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvestidorTest {
    
    @Test
    public void investirPoupancaTest() {
        Investidor investidor = new Investidor(1000);
        assertEquals(1061.7,investidor.investirPoupancaAnual());
    }

    @Test
    public void investirCDBTest() {
        Investidor investidor = new Investidor(1000);
        assertEquals(1109.2,investidor.investirCDBAnual());
    }

    @Test
    public void investirTesouroIPCATest() {
        Investidor investidor = new Investidor(1000);
        assertEquals(1114.3,investidor.investirTesouroIPCAAnual());
    }
    
}
