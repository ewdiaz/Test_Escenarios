package com.toolsqa.test.stepdefinitions;

import com.toolsqa.automation.interactions.OpenTheBrowser;
import com.toolsqa.automation.tasks.FillFormExcel;
import com.toolsqa.automation.tasks.FillFormFaker;
import com.toolsqa.automation.tasks.FillFormProperties;
import com.toolsqa.automation.tasks.Validation;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.SpecialMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormUserStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Eduard").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user to register in toolsqa$")
    public void that_a_web_user_to_register_in_toolsqa() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormPage.URL));
        SpecialMethods.ScreenshotsPage(driver);
    }

    @When("^he fills all the requested fields in the form register with faker$")
    public void he_fills_all_the_requested_fields_in_the_form_register_with_faker() {
        theActorInTheSpotlight().attemptsTo(FillFormFaker.dataInjectionFaker());
        SpecialMethods.ScreenshotsPage(driver);
    }

    @Then("^he should see it a message using faker\\.$")
    public void he_should_see_it_a_message_using_faker() {
        theActorInTheSpotlight().attemptsTo(Validation.compareText());
        SpecialMethods.ScreenshotsPage(driver);
    }

    @When("^he fills all the requested fields in the form register with excel$")
    public void he_fills_all_the_requested_fields_in_the_form_register_with_excel() {
        theActorInTheSpotlight().attemptsTo(FillFormExcel.dataInjectionSheet());
        SpecialMethods.ScreenshotsPage(driver);
    }

    @Then("^he should see it a message using excel\\.$")
    public void he_should_see_it_a_message_using_excel() {
        theActorInTheSpotlight().attemptsTo(Validation.compareText());
        SpecialMethods.ScreenshotsPage(driver);
    }

    @When("^he fills all the requested fields in the form register with properties$")
    public void he_fills_all_the_requested_fields_in_the_form_register_with_properties() {
        theActorInTheSpotlight().attemptsTo(FillFormProperties.dataInectionProperties());
        SpecialMethods.ScreenshotsPage(driver);
    }

    @Then("^he should see it a message using properties\\.$")
    public void he_should_see_it_a_message_using_properties() {
        theActorInTheSpotlight().attemptsTo(Validation.compareText());
        SpecialMethods.ScreenshotsPage(driver);
    }

}

