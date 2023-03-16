package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.AmazonSearchPage;
import utilities.Driver;

public class AmazonStepsDefinition {
    @Given("Kullanici amazon sitesine girer.")
    public void kullaniciAmazonSitesineGirer() {

        Driver.getDriver().get("https://www.amazon.com.tr/");
    }

    @When("Kullanici amazonda {string} arattir")
    public void kullaniciAmazondaArattir(String arg0) {
        AmazonHomePage hp= new AmazonHomePage(Driver.getDriver());
        hp.searchKeyHitEnter(arg0);
    }

    @Then("Kullanici arma sonuclarinda {string} gormelidir")
    public void kullaniciArmaSonuclarindaGormelidir(String arg0) {
        AmazonSearchPage sp = new AmazonSearchPage(Driver.getDriver());
        sp.validateResultTextHasKey(arg0);

    }

    @And("Ekran goruntusu alir")
    public void ekranGoruntusuAlir() {
        System.out.println("Ekran goruntusu alinir");
    }

    @And("Kullanici browser i kapatir")
    public void kullaniciBrowserIKapatir() {
        Driver.closeDriver();
    }
}
