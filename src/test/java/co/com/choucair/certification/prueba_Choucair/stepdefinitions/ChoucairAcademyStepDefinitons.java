package co.com.choucair.certification.prueba_Choucair.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;


public class ChoucairAcademyStepDefinitons {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than anyer wants to learn automation at the academy choucair$")
    public void thanAnyerWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Anyer").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course Guias Tecnicas Analista Financial on the choucair academy plattform$")
    public void heSearchForTheCourseGuiasTecnicasAnalistaFinancialOnTheChoucairAcademyPlattform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the());


    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledGuiasTecnicas(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
