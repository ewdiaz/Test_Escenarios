package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormFaker implements Task {
    private DataInjection dataInjection = new DataInjection();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(dataInjection.getFirstname()).into(FormPage.FIRST_NAME_INPUT),
                Enter.keyValues(dataInjection.getLastname()).into(FormPage.LAST_NAME_INPUT),
                Enter.keyValues(dataInjection.getEmail()).into(FormPage.EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER_SELECT),
                Enter.keyValues(dataInjection.getPhone()).into(FormPage.PHONE_INPUT),
                JavaScriptClick.on(FormPage.BIRTH_DAY_SELECT),
                JavaScriptClick.on(FormPage.MONTH_SELECT),
                JavaScriptClick.on(FormPage.MONTH_OPTION),
                JavaScriptClick.on(FormPage.YEAR_SELECT),
                JavaScriptClick.on(FormPage.YEAR_OPTION),
                JavaScriptClick.on(FormPage.DAY_OPTION),
                Enter.keyValues(dataInjection.getSubject()).into(FormPage.SUBJECT_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECT_INPUT),
                Scroll.to(FormPage.HOBBIES_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                Scroll.to(FormPage.BUTTON_UPLOAD),
                Enter.keyValues(dataInjection.getPicture()).into(FormPage.BUTTON_UPLOAD),
                Enter.keyValues(dataInjection.getAddress()).into(FormPage.ADDRESS_INPUT),
                JavaScriptClick.on(FormPage.STATE_INPUT),
                Enter.keyValues(dataInjection.getState()).into(FormPage.STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.STATE_INPUT),
                JavaScriptClick.on(FormPage.CITY_INPUT),
                Enter.keyValues(dataInjection.getCity()).into(FormPage.CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)


        );
    }
    public static FillFormFaker dataInjectionFaker(){
        return instrumented(FillFormFaker.class);
    }
}
