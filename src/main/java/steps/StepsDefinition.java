package steps;

import data.CheckBoxData;
import data.DataSupplier;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muhamad Hanif on 20/11/2022
 * @project SwTestingSampleAutomation
 */
public class StepsDefinition {

    public WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }

    @Given("user navigates to Demo QA Elements page")
    public void userNavigatesToDemoQAElementsPage() {
        driver.get("https://demoqa.com/elements");
    }

    @When("user clicks on Text Box section")
    public void userClicksOnTextBoxSection() {
        driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[1]/div/ul[@class='menu-list']/li[1]")).click();
    }

    @And("users enters Full Name")
    public void usersEntersFullName() {
        driver.findElement(By.id("userName")).sendKeys(DataSupplier.textBoxData.getFullName());
    }

    @And("user enters correct email")
    public void userEntersCorrectEmail() {
        driver.findElement(By.id("userEmail")).sendKeys(DataSupplier.textBoxData.getEmail());
    }

    @And("user enters address")
    public void userEntersAddress() {
        driver.findElement(By.id("currentAddress")).sendKeys(DataSupplier.textBoxData.getCurrentAddress());
    }

    @And("user enters permanent address")
    public void userEntersPermanentAddress() {
        driver.findElement(By.id("permanentAddress")).sendKeys(DataSupplier.textBoxData.getPermanentAddress());
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("all the data are displayed below the form")
    public void allTheDataAreDisplayedBelowTheForm() {
        Assert.assertTrue(driver.findElement(By.id("name")).getText().contains(DataSupplier.textBoxData.getFullName()));
        Assert.assertTrue(driver.findElement(By.id("email")).getText().contains(DataSupplier.textBoxData.getEmail()));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='output']//p[@id='currentAddress']")).getText().contains(DataSupplier.textBoxData.getCurrentAddress()));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='output']//p[@id='permanentAddress']")).getText().contains(DataSupplier.textBoxData.getPermanentAddress()));
    }

    @And("user enters incorrect email")
    public void userEntersIncorrectEmail() {
        driver.findElement(By.id("userEmail")).sendKeys(DataSupplier.textBoxData.getIncorrectEmail());
    }

    @Then("all the data are displayed below the form except email")
    public void allTheDataAreDisplayedBelowTheFormExceptEmail() {
        Assert.assertTrue(driver.findElement(By.id("name")).getText().contains(DataSupplier.textBoxData.getFullName()));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='output']//p[@id='currentAddress']")).getText().contains(DataSupplier.textBoxData.getCurrentAddress()));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='output']//p[@id='permanentAddress']")).getText().contains(DataSupplier.textBoxData.getPermanentAddress()));
    }

    @Then("data is not displayed")
    public void dataIsNotDisplayed() {
        Assert.assertFalse(driver.findElements(By.id("email")).size() > 1, "Checking the result if exist");
    }

    @When("user clicks on Check Box section")
    public void userClicksOnCheckBoxSection() {
        driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[1]/div/ul[@class='menu-list']/li[2]/span[@class='text']")).click();
    }

    @And("user checks home")
    public void userChecksHome() {
        driver.findElement(By.className("rct-checkbox")).click();
    }

    @Then("all data inside home are displayed")
    public void allDataInsideHomeAreDisplayed() {
        List<WebElement> elements = driver.findElements(By.className("text-success"));
        elements.stream().forEach(element -> System.out.println(element.getText()));
        Arrays.stream(DataSupplier.checkBoxData.getHome()).forEach(data -> {
            Boolean test = false;
            for(int i=0; i<elements.size(); i++){
                if(data.equalsIgnoreCase(elements.get(i).getText())) {
                    test = true;
                    break;
                }
            }
            Assert.assertTrue(test, "Test Element exist "+data);
        });
    }

    @And("user clicks dropdown home")
    public void userClicksDropdownHome() {
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
    }

    @And("user checks desktop")
    public void userChecksDesktop() {
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]")).click();
    }

    @Then("all data inside desktop are displayed")
    public void allDataInsideDesktopAreDisplayed() {
        List<WebElement> elements = driver.findElements(By.className("text-success"));
        elements.stream().forEach(element -> System.out.println(element.getText()));
        Arrays.stream(DataSupplier.checkBoxData.getDesktopFolder()).forEach(data -> {
            Boolean test = false;
            for(int i=0; i<elements.size(); i++){
                if(data.equalsIgnoreCase(elements.get(i).getText())) {
                    test = true;
                    break;
                }
            }
            Assert.assertTrue(test, "Test Element exist "+data);
        });
    }

    @When("user clicks on Radio Button section")
    public void userClicksOnRadioButtonSection() {
        driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[1]/div/ul[@class='menu-list']/li[3]/span[@class='text']")).click();
    }

    @And("user clicks on Yes")
    public void userClicksOnYes() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
    }

    @Then("Text Success is set to Yes")
    public void textSuccessIsSetToYes() {
        Assert.assertTrue(driver.findElement(By.className("text-success")).getText().contains("Yes"));
    }

    @And("user clicks on Impressive")
    public void userClicksOnImpressive() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
    }

    @Then("Text Success is set to Impressive")
    public void textSuccessIsSetToImpressive() {
        Assert.assertTrue(driver.findElement(By.className("text-success")).getText().contains("Impressive"));
    }
}
