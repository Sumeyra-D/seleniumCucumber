package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {
    @Given("Ilk feature icin cucumber indirdim")
    public void Ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step i calisti");

    }
    @When("Senaryomu caistirdigimda")
    public void senaryomu_caistirdigimda() {
        System.out.println("When step i calisti");


    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step i calisti");

    }

}
