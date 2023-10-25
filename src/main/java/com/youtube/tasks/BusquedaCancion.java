package com.youtube.tasks;

import com.youtube.interactions.ClickAleatorio;
import com.youtube.utils.EscrituraExcel;
import com.youtube.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.youtube.userInterfaces.YoutubePrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaCancion implements Task {

    public static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();
    EscrituraExcel escrituraExcel = new EscrituraExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("DatosExcel.xlsx","DatosCancion");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
               Enter.theValue(leerExcel.get(0).get("Cancion")).into(TXT_BUSCAR).thenHit(Keys.ENTER),
                ClickAleatorio.click()

       );
    }

    public static BusquedaCancion busqueda() {
        return instrumented(BusquedaCancion.class);
    }

}



