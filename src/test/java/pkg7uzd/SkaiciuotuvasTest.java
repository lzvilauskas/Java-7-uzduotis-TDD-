/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7uzd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class SkaiciuotuvasTest {
    
    public SkaiciuotuvasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of skaiciuoti method, of class Skaiciuotuvas.
     */
    @Test
    public void sudedaDuSkaiciusKaiPerduodamasZodisIsDidziosiosRaidesSudeti() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("Sudeti",5,5));
    }
    
    @Test
    public void atimaDuSkaiciusKaiPerduodamasZodisIsDidziosiosRaidesAtimti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("Atimti",10,5));
    }
    
    @Test
    public void sudauginaDuSkaiciusKaiPerduodamasZodisIsDidziosiosRaidesDauginti() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti("Dauginti",5,5));
    }
    @Test
    public void padalinaDuSkaiciusKaiPerduodamasZodisIsDidziosiosRaidesDalinti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("Dalinti",10,2));
    }
    
    @Test
    public void sudedaDuSkaiciusKaiPerduodamasZodisMazosiomisRaidemisSudeti() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("sudeti",5,5));
    }
    
    @Test
    public void atimaDuSkaiciusKaiPerduodamasZodisMazosiomisRaidemisAtimti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("atimti",10,5));
    }
    
    @Test
    public void sudauginaDuSkaiciusKaiPerduodamasZodisMazosiomisRaidemisDauginti() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti("dauginti",5,5));
    }
    @Test
    public void padalinaDuSkaiciusKaiPerduodamasZodisMazosiomisRaidemisDalinti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("dalinti",10,2));
    }
    
    @Test
    public void sudedaDuSkaiciusKaiPerduodamasZodisDidziosiomisRaidemisSudeti() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("SUDETI",5,5));
    }
    
    @Test
    public void atimaDuSkaiciusKaiPerduodamasZodisDidziosiomisRaidemisAtimti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("ATIMTI",10,5));
    }
    
    @Test
    public void sudauginaDuSkaiciusKaiPerduodamasZodisDidziosiomisRaidemisDauginti() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti("DAUGINTI",5,5));
    }
    @Test
    public void padalinaDuSkaiciusKaiPerduodamasZodisDidziosiomisRaidemisDalinti() {
         assertEquals(5, Skaiciuotuvas.skaiciuoti("DALINTI",10,2));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiIntTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("sudeti",new Integer(5), new Integer(5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiDoubleTipoSkaiciai() {
         assertEquals(9, Skaiciuotuvas.skaiciuoti("sudeti",new Double(5.5), new Double(4.5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiFloatTipoSkaiciai() {
         assertEquals(9, Skaiciuotuvas.skaiciuoti("sudeti",new Float(5.5), new Float(4.5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiLongTipoSkaiciai() {
         assertEquals(200, Skaiciuotuvas.skaiciuoti("sudeti",new Long(150), new Long(50)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiByteTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("sudeti",(byte)2, (byte)8));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiShortTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("sudeti",(short)2, (short)8));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiSkirtingoTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti("sudeti", 6, 4.5));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPirmasSkaiciusYraNeigiamas() {
         assertEquals(-4, Skaiciuotuvas.skaiciuoti("sudeti", -6, 2));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiAntrasSkaiciusYraNeigiamas() {
         assertEquals(4, Skaiciuotuvas.skaiciuoti("sudeti", 6, -2));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamiDuNeigiamiSkaiciai() {
         assertEquals(-8, Skaiciuotuvas.skaiciuoti("sudeti", -6, -2));
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVeiksmoParametruiPerduodamaNullReiksmeGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti(null, 5, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguSkaiciausParametruiPerduodamaNullReiksmeGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti("sudeti", null, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVeiksmoParametruiPerduodamaTusciasStringGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti("", 5, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVeiksmoParametruiPerduodamaNetinkamasStringGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti("abcd", 5, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguDalinamasIsNulioGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti("dalinti", 5, 0);
    }
    
    
    
    @Test
    public void sudedaDuSkaiciusKaiPerduodamasSudetiesSimbolis() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('+',5,5));
    }
    
     @Test
    public void atimaDuSkaiciusKaiPerduodamasAtimtiesSimbolis() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('-',15,5));
    }
    
     @Test
    public void dalinaDuSkaiciusKaiPerduodamasDalybosSimbolis() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('/',50,5));
    }
    
     @Test
    public void sudauginaDuSkaiciusKaiPerduodamasDaugybosSimbolis() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti('*',5,5));
    }
    
     @Test
    public void sudedaDuSkaiciusKaiPerduodamasSudetiesUnicode() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('\u002B',5,5));
    }
    
     @Test
    public void atimaDuSkaiciusKaiPerduodamasAtimtiesUnicode() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('\u002D',15,5));
    }
    
     @Test
    public void dalinaDuSkaiciusKaiPerduodamasDalybosUnicode() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('\u002F',50,5));
    }
    
     @Test
    public void sudauginaDuSkaiciusKaiPerduodamasDaugybosUnicode() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti('\u002A',5,5));
    }
    
     @Test
    public void sudedaDuSkaiciusKaiPerduodamasSudetiesSimbolioNumeris() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti((char)43,5,5));
    }
    
      @Test
    public void atimaDuSkaiciusKaiPerduodamasAtimtiesSimbolioNumberis() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti((char)45,15,5));
    }
    
     @Test
    public void dalinaDuSkaiciusKaiPerduodamasDalybosSimbolioNumeris() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti((char)47 ,50,5));
    }
    
     @Test
    public void sudauginaDuSkaiciusKaiPerduodamasDaugybosSimbolioNumeris() {
         assertEquals(25, Skaiciuotuvas.skaiciuoti((char)42,5,5));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrIntTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('+',new Integer(5), new Integer(5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrDoubleTipoSkaiciai() {
         assertEquals(9, Skaiciuotuvas.skaiciuoti('+',new Double(5.5), new Double(4.5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrFloatTipoSkaiciai() {
         assertEquals(9, Skaiciuotuvas.skaiciuoti('+',new Float(5.5), new Float(4.5)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrLongTipoSkaiciai() {
         assertEquals(200, Skaiciuotuvas.skaiciuoti('+',new Long(150), new Long(50)));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrByteTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('+',(byte)2, (byte)8));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrShortTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('+',(short)2, (short)8));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrSkirtingoTipoSkaiciai() {
         assertEquals(10, Skaiciuotuvas.skaiciuoti('+', 6, 4.5));
    }
    
     @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrPirmasSkaiciusYraNeigiamas() {
         assertEquals(-4, Skaiciuotuvas.skaiciuoti('+', -6, 2));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrAntrasSkaiciusYraNeigiamas() {
         assertEquals(4, Skaiciuotuvas.skaiciuoti('+', 6, -2));
    }
    
    @Test
    public void atliekaNurodytaVeiksmaKaiPerduodamasSimbolisIrDuNeigiamiSkaiciai() {
         assertEquals(-8, Skaiciuotuvas.skaiciuoti('+', -6, -2));
    }
    
       @Test(expected = RuntimeException.class)
    public final void jeiguSimbolioParametruiPerduodamaNullReiksmeGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti(null, 5, 5);
    }
    
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVeiksmoParametruiPerduodamaTusciasSimbolisGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti(' ', 5, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVeiksmoParametruiPerduodamaNetinkamasSimbolisGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti('b', 5, 5);
    }
    
    @Test(expected = RuntimeException.class)
    public final void jeiguVienamisSkaiciuParametruiPerduodamaNullReiksmeGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti('b', null, 5);
    }
    
    @Test(expected = ArithmeticException.class)
    public final void jeiguDalinamaIsNulioGaunamaRuntimeIsimtis() {
        Skaiciuotuvas.skaiciuoti('/', 5, 0);
    }
   
    
}
