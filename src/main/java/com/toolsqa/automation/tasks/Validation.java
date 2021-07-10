package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.questions.GetRegisterQuestion;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class Validation implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.should(
                    seeThat(GetRegisterQuestion.in(FormPage.VALIDATION), equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetname(), 0, 9)))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Validation compareText(){
        return instrumented(Validation.class);
    }
}
