package Steps;

import Pages.WebTablesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepsDefinition {

   public static WebDriver driver;
   public WebDriverWait wait;

   public WebTablesPage webTablesPage;


   @Before
    public void setUp () {

    driver = new ChromeDriver();
    WebDriverManager.chromedriver().setup();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    driver.manage().window().maximize();

     webTablesPage = new WebTablesPage();

   }


    @Given("User is on Web tables page")
    public void userIsOnWebTablesPage() {

     driver.navigate().to("https://demoqa.com/webtables");

    }


   @When("User clicks 'Add' button")
    public void userClicksAddButton() {

        webTablesPage.clickOnAddButton();
    }

    @And("User inputs firstname {string}, lastname {string} and email {string}")
    public void userInputsFirstnameLastnameAndEmail(String firstname, String lastname, String email ) {


       webTablesPage.inputFirstName(firstname);
       webTablesPage.inputLastName(lastname);
       webTablesPage.inputEmail(email);

    }


    @And("User inputs age {string},salary {string} and department {string}")
    public void userInputsAgeSalaryAndDepartment (String age, String salary, String department) {

       webTablesPage.inputAge(age);
       webTablesPage.inputSalary(salary);
       webTablesPage.inputDepartment(department);




    }


    @And("User clicks submit")
    public void userClicksSubmit() {
       webTablesPage.clickOnSubmitButton();


    }


    @Then("User added a new table row")
    public void userAddedANewTableRow() {




    }








}
