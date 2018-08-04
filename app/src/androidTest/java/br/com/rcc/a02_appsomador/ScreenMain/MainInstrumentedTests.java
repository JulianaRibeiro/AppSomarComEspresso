package br.com.rcc.a02_appsomador.ScreenMain;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import br.com.rcc.a02_appsomador.MainActivity;
import br.com.rcc.a02_appsomador.ScreenMain.robot.MainRobot;

@RunWith(AndroidJUnit4.class)
public class MainInstrumentedTests {
 @Rule
 public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

@Test
public void TesteDeVerificarElementos() throws InterruptedException {

    new MainRobot()
            .verificarPrimeiroElemento()
            .verificarSegundoElemento()
            .verificarTerceiroElemento()
            .verificarQuartoElemento()
            .verificarQuintoElemento()
            .verificarSextoElemento()
            .verificarSetimoElemento();
}

    @Test
    public void VerificarTextosNaTela() throws InterruptedException {

        new MainRobot()
                .verificarTituloDaTela()
                .verificarTextoDaTela2()
                .verificarTextoDaTela3()
                .verificarTextoDaTela4()
                .verificarTextoDaTela5();
    }

    @Test
    public void VerificarResultadoDaSoma() throws InterruptedException {

        new MainRobot()
                .digitarNumero1()
                .digitarNumero2()
                .clicarEmSomar()
                .verificarTxtPopup()
                .pressBack()
                .verificarOResultado();

    }
}
