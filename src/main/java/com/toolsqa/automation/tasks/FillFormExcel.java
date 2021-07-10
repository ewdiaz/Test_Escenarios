package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormExcel implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,0)).into(FormPage.FIRST_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,1)).into(FormPage.LAST_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,2)).into(FormPage.EMAIL_INPUT),
                    JavaScriptClick.on(FormPage.GENDER_SELECT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,3)).into(FormPage.PHONE_INPUT),
                    JavaScriptClick.on(FormPage.BIRTH_DAY_SELECT),
                    JavaScriptClick.on(FormPage.MONTH_SELECT),
                    JavaScriptClick.on(FormPage.MONTH_OPTION),
                    JavaScriptClick.on(FormPage.YEAR_SELECT),
                    JavaScriptClick.on(FormPage.YEAR_OPTION),
                    JavaScriptClick.on(FormPage.DAY_OPTION),
                    Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,4)).into(FormPage.SUBJECT_INPUT),
                    Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECT_INPUT),
                    JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                    Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,5)).into(FormPage.BUTTON_UPLOAD),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,6)).into(FormPage.ADDRESS_INPUT),
                    JavaScriptClick.on(FormPage.STATE_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,7)).into(FormPage.STATE_INPUT),
                    Enter.keyValues(Keys.ENTER).into(FormPage.STATE_INPUT),
                    JavaScriptClick.on(FormPage.CITY_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetname(),0,8)).into(FormPage.CITY_INPUT),
                    Enter.keyValues(Keys.ENTER).into(FormPage.CITY_INPUT),
                    JavaScriptClick.on(FormPage.SUBMIT_BUTTON)
            );

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static FillFormExcel dataInjectionSheet(){
        return instrumented(FillFormExcel.class);
    }
}
