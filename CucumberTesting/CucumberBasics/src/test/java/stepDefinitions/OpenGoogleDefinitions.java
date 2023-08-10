package stepDefinitions;









import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.ParameterType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class OpenGoogleDefinitions {
        private WebDriver driver;

        @Given("I am on the Google home page")
        public void i_am_on_the_Google_home_page() {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }

        @When("I search for {string}")
        public void i_search_for(String string) {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(string);
            searchBox.submit();
        }

        @Then("the search results page is displayed")
        public void the_search_results_page_is_displayed() {
            String title = driver.getTitle();
            assertTrue(title.contains("Google Search"));
        }

        @Then("I click on the {string} link")
        public void i_click_on_the_link(String string) {
            WebElement imagesLink = driver.findElement(By.linkText(string));
            imagesLink.click();
        }

        @Then("the images search results page is displayed")
        public void the_images_search_results_page_is_displayed() {
            String title = driver.getTitle();
            assertTrue(title.contains("Google Images"));
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }








