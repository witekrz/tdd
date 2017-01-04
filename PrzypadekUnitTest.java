    private static final BigDecimal KWOTA = new BigDecimal(20000);
    private static final Integer LICZBA_RAT = 58;

    private WniosekOferta wniosekOferta;

    @Test
    public void testSprawdzaCzyWniosekJestOK(){
        Wniosek w = new Wniosek(KWOTA,LICZBA_RAT,"Janusz");
        boolean czyOferta  = wniosekOferta.czyIstniejeOferta(w);

        List<String> kredytobiorcy = w.getKredytobiorcow();

        Assert.assertTrue(czyOferta);
        Assert.assertFalse(kredytobiorcy.size()==1);
    }

