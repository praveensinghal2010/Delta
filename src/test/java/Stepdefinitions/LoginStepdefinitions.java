package Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepdefinitions {

    WebDriver driver;
    @Given("User is homepage")
    public void user_is_homepage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Headless mode
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*"); // Optional
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-data-dir=/tmp/unique-profile-" + System.currentTimeMillis());

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    @When("User open google page")
    public void user_open_google_page() {
        driver.get("https://www.google.com/");
        driver.close();
    }
    }
