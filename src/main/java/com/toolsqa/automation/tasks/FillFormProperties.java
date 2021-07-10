package com.toolsqa.automation.tasks;

import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormProperties implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Enter.keyValues(SpecialMethods.properties.getProperty("firstname")).into(FormPage.FIRST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("lastname")).into(FormPage.LAST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("email")).into(FormPage.EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER_SELECT),
                Enter.keyValues(SpecialMethods.properties.getProperty("phone")).into(FormPage.PHONE_INPUT),
                //Enter.keyValues(Keys.CLEAR).into(FormPage.BIRTH_DAY_SELECT),
                //Enter.keyValues(SpecialMethods.properties.getProperty("birthday")).into(FormPage.BIRTH_DAY_SELECT)
                JavaScriptClick.on(FormPage.BIRTH_DAY_SELECT),
                JavaScriptClick.on(FormPage.MONTH_SELECT),
                JavaScriptClick.on(FormPage.MONTH_OPTION),
                JavaScriptClick.on(FormPage.YEAR_SELECT),
                JavaScriptClick.on(FormPage.YEAR_OPTION),
                JavaScriptClick.on(FormPage.DAY_OPTION),
                Enter.keyValues(SpecialMethods.properties.getProperty("subject")).into(FormPage.SUBJECT_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECT_INPUT),
                Scroll.to(FormPage.HOBBIES_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(FormPage.BUTTON_UPLOAD),
                Enter.keyValues(SpecialMethods.properties.getProperty("address")).into(FormPage.ADDRESS_INPUT),
                JavaScriptClick.on(FormPage.STATE_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("state")).into(FormPage.STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.STATE_INPUT),
                JavaScriptClick.on(FormPage.CITY_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("city")).into(FormPage.STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)
        );
    }
    public static FillFormProperties dataInectionProperties(){
        return instrumented(FillFormProperties.class);
    }
}
