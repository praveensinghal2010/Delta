package Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepdefinitions {

    WebDriver driver;
    @Given("User is homepage")
    public void user_is_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    @When("User open google page")
    public void user_open_google_page() {
        driver.get("https://www.google.com/");
        driver.close();
    }
    }
