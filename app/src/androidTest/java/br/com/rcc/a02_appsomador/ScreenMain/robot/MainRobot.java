package br.com.rcc.a02_appsomador.ScreenMain.robot;
import br.com.rcc.a02_appsomador.R;
import br.com.rcc.a02_appsomador.common.ScreenRobot;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.FIRST_NUMBER;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.MAIN_APP_BAR;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.NUMBER1;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.NUMBER2;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.RESULT;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.RESULTADOSOMA;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.SECOND_NUMBER;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.SUM;
import static br.com.rcc.a02_appsomador.ScreenMain.constants.MainConstants.TXT_READY;

public class MainRobot extends ScreenRobot<MainRobot>{
    private static final int TV_FIRST_NUMBER = R.id.tvnumero1;
    private static final int ET_FIRST_NUMBER = R.id.etnumero1;
    private static final int TV_SECOND_NUMBER = R.id.tvnumero2;
    private static final int ET_SECOND_NUMBER = R.id.etnumero2;
    private static final int BTN_SUM = R.id.btsomar;
    private static final int TV_RESULT = R.id.tvresultado;
    private static final int ET_RESULT = R.id.etresultado;

    public MainRobot verificarPrimeiroElemento(){
        checkIsDisplayed(TV_FIRST_NUMBER);
        return this;
    }

    public MainRobot verificarSegundoElemento(){
        checkIsDisplayed(ET_FIRST_NUMBER);
        return this;
    }

    public MainRobot verificarTerceiroElemento(){
        checkIsDisplayed(TV_SECOND_NUMBER);
        return this;
    }

    public MainRobot verificarQuartoElemento(){
        checkIsDisplayed(ET_SECOND_NUMBER);
        return this;
    }

    public MainRobot verificarQuintoElemento(){
        checkIsDisplayed(BTN_SUM);
        return this;
    }

    public MainRobot verificarSextoElemento(){
        checkIsDisplayed(TV_RESULT);
        return this;
    }

    public MainRobot verificarSetimoElemento(){
        checkIsDisplayed(ET_RESULT);
        return this;
    }

    public MainRobot verificarTituloDaTela(){
        checkViewContainsText(MAIN_APP_BAR);
        return this;
    }

    public MainRobot verificarTextoDaTela2(){
        checkViewContainsText(FIRST_NUMBER);
        return this;
    }

    public MainRobot verificarTextoDaTela3(){
        checkViewContainsText(SECOND_NUMBER);
        return this;
    }

    public MainRobot verificarTextoDaTela4(){
        checkViewContainsText(SUM);
        return this;
    }

    public MainRobot verificarTextoDaTela5(){
        checkViewContainsText(RESULT);
        return this;
    }

    public MainRobot digitarNumero1(){
        enterTextIntoView(ET_FIRST_NUMBER, NUMBER1);
        return this;
    }

    public MainRobot digitarNumero2(){
        enterTextIntoView(ET_SECOND_NUMBER, NUMBER2);
        return this;
    }

    public MainRobot clicarEmSomar(){
        clickOnView(BTN_SUM);
        return this;
    }

    public MainRobot verificarOResultado(){
        checkViewContainsText(RESULTADOSOMA);
        return this;
    }

    public MainRobot verificarTxtPopup(){
        checkViewContainsText(TXT_READY);
        return this;
    }


}
