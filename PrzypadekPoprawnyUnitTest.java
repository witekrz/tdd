import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrzypadekPoprawnyUnitTest {

    private WniosekOferta wniosekOferta;

    @Test
    public void testSprawdzaCzyIstniejeOfertaDlaWniosku() {
        //given
        Wniosek w = new WniosekBudowniczy().zKwota(20000).zLiczbaRat(58).zKlientem("Janusz").buduj();

        //when
        boolean czyOferta = wniosekOferta.czyIstniejeOferta(w);

        //then
        Assert.assertTrue(czyOferta);
    }

    @Test
    public void testSprawdzCzyNaWnioskuNieMaWieluKredytobiorcw() {
        Wniosek w = new WniosekBudowniczy().zKwota(5000).zLiczbaRat(60).zKlientem("Staszek").buduj();

        List<String> kredytobiorcy = w.getKredytobiorcow();

        Assert.assertFalse(kredytobiorcy.size()==1);
    }
}

