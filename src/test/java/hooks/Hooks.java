package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;

    @Before
    public void setup(){

        System.out.println("Before methodu calisti");
    }
    @After
    public void teardown(){

        System.out.println("After methodu calisti");
    }
}
