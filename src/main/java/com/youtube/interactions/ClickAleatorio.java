package com.youtube.interactions;

import com.youtube.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static com.youtube.userInterfaces.YoutubeCatalogoUI.LBL_CANCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickAleatorio implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaCanciones = LBL_CANCION.resolveAllFor(actor);
        Random random = new Random();
        int radomCancion = random.nextInt(listaCanciones.size());

        EscrituraExcel.escrituraExcel("DatosExcel.xlsx",listaCanciones.get(radomCancion).getText(),1,1);
        listaCanciones.get(radomCancion).click();

    }

    public static ClickAleatorio click (){
        return instrumented(ClickAleatorio.class);
    }
}
