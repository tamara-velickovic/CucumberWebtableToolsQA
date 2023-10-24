package Pages;

import Steps.StepsDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends StepsDefinition {

  public WebTablesPage () {  PageFactory.initElements(driver, this); }


    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;
    @FindBy(id = "userEmail")
    public WebElement emailField;
    @FindBy(id = "age")
    public WebElement ageField;

    @FindBy(id = "salary")
    public WebElement salaryField;
    @FindBy(id = "department")
    public WebElement departmentField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id="searchBox")
    public WebElement searchBox;

    @FindBy(id="basic-addon2")
    public WebElement searchButton;


    @FindBy(className="rt-resizable-header-content")
    public List<WebElement> columns;

    //Metode za ove dole fale

    @FindBy(className="select-wrap -pageSizeOptions")
    public WebElement rowsPerPageDropDown;

    @FindBy(className="-pageJump")
    public WebElement currentPage; //jumptoPage


    @FindBy(className="-totalPages")
    public WebElement totalPages;




   //Rows/output text
    // edit
    // delete

//----------------------------------------------------------------------------------

    public void clickOnAddButton() {

     addButton.click();

    }

    public void inputFirstName(String input) {

      firstNameField.clear();
      firstNameField.sendKeys(input);

    }

    public void inputLastName(String input) {

        lastNameField.clear();
        lastNameField.sendKeys(input);

    }

    public void inputEmail(String input) {

        emailField.clear();
        emailField.sendKeys(input);

    }

    public void inputAge(String input) {

       ageField.clear();
       ageField.sendKeys(input);

    }

    public void inputSalary(String input) {

        salaryField.clear();
        salaryField.sendKeys(input);

    }

    public void inputDepartment(String input) {

        departmentField.clear();
        departmentField.sendKeys(input);

    }

    public void clickOnSubmitButton() {

        submitButton.click();
    }


    public void inputInSearchBox(String input) {

        searchBox.clear();
        searchBox.sendKeys(input);

    }

    public void clickOnSearchButton() {

    searchButton.click();
    }

    public void clickOnColumnNamed (String columnName) {

        for (int i = 0; i < columns.size(); i++) {

            if (columns.get(i).getText().equals(columnName))
                columns.get(i).click();

        }


    }













}
