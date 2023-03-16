package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke test icin hazirliklar yapildi")
    public void smoke_test_icin_hazirliklar_yapildi() {

    }
    @When("Smoke test calistiginda")
    public void smoke_test_calistiginda() {

    }
    @Then("Smoke test baarili olmali")
    public void smoke_test_basarili_olmali() {
        System.out.println("smoke test calisti");

    }

    @Given("Regression test icin hazirliklar yapildi")
    public void regression_test_icin_hazirliklar_yapildi() {

    }
    @When("Regression test calistiginda")
    public void regression_test_calistiginda() {

    }
    @Then("Regression test basarili olmali")
    public void regression_test_basarili_olmali() {
        System.out.println("Regression Test Calisti");

    }


}
