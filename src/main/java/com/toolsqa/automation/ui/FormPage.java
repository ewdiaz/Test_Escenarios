//Mapeo de los elementos

package com.toolsqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static String URL = "https://www.demoqa.com/automation-practice-form";
    public static final Target FIRST_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_SELECT = Target.the("").locatedBy("//label[@for='gender-radio-1']");
    public static final Target PHONE_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target BIRTH_DAY_SELECT = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target MONTH_SELECT = Target.the("").locatedBy("//*[@class='react-datepicker__month-select']");
    public static final Target MONTH_OPTION = Target.the("").locatedBy("//*[@value='2' and text()='March']");
    public static final Target YEAR_SELECT = Target.the("").locatedBy("//*[@class='react-datepicker__year-select']");
    public static final Target YEAR_OPTION = Target.the("").locatedBy("//*[@value='1991' and text()='1991']");
    public static final Target DAY_OPTION = Target.the("").locatedBy("//*[@class='react-datepicker__day react-datepicker__day--001' and text()='1']");
    public static final Target SUBJECT_INPUT =Target.the("").located(By.id("subjectsInput"));
    public static final Target HOBBIES_INPUT = Target.the("").locatedBy("//label[@for='hobbies-checkbox-3']");
    public static final Target BUTTON_UPLOAD = Target.the("").located(By.id("uploadPicture"));
    public static final Target ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target STATE_INPUT = Target.the("").locatedBy("//*[@id='react-select-3-input' and @type='text']");
    public static final Target CITY_INPUT = Target.the("").locatedBy("//*[@id='react-select-4-input' and @type='text']");
    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
    public static final Target VALIDATION = Target.the("").locatedBy("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
}
