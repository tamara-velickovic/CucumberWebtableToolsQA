package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/add.feature"},
        glue = {"Steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    //Da bismo radili projekat koristeci Cucumber trebaju nam 2 dependencya
    //Pored toga potrebno je da instaliramo i 2 plugina
    //Instalacija pluginova se nalazi u File -> Settings -> Plugins
    //Potrebno je instalirati
    // 1) Cucumber for Java
    // 2) Gherkin

    //Testrunner klasa nam sluzi da bismo mogli da pokrenemo sve testove
    //Neophodno je u klasi da pre svega prosledimo @CucumberOptions
    //gde ce biti prosledjena lokacija feature fajla
    //i u kom paketu se nalaze metode za korake

    //Feature file pravimo tako sto prvo kliknemo desni klik na projekat (Cucumber17 u gornjem levom uglu)
    //New -> Directory -> Izaberemo resource folder koji nam je ponudjen

    //Unutar tog foldera (koji nam se sada nalazi u "test" folderu projekta
    //Kreiramo feature fajl koji mora da ima ekstenziju .feature
    //Samo na taj nacin kreiramo cucumber fajl

    //U tom fajlu ubacujemo scenarije pisane u Gherkin formatu

    //Paket Steps ima klasu StepDefinition koja ce imati metode za sve korake scenarija
    //U toj klasi deklarisemo stranice i driver i pravimo setUp metodu sa Cucumber anotacijom @Before (nije BeforeClass)

    //Ako hocemo kroz odredjeni korak u scenariju da prosledimo string za unos u neko polje
    //taj deo koraka pisemo pod navodnicima:
    //When User inputs valid username "tomsmith"
    //U ovom slucaju string "tomsmith" se salje na metodu da se bas taj string unese u username polje

    //Kada pravimo metodu za taj korak potrebno je da ima isti naziv, samo umesto string "tomsmith" pisemo {string}
    //@When("User inputs valid username {string}")
    //I u parametar metode prosledjujemo String sa bilo kojim nazivom koji ce u daljem delu metode da se tumaci kao "tomsmith"
    //    public void user_inputs_username(String username) {
    //        loginPage.inputUsername(username);
    //    }

    //Ako pravimo testove sa vise razlicitih primera, onda taj string koji menjamo ne pisemo kao "username" nego <username>
    //To je oznaka da ce se ti podaci izvuci iz Examples tabele
    //U tom slucaju ne pravimo Scenario nego Scenario Outline
    //Examples tabela mora imati onoliko kolona koliko delova scenarija menjamo
    //Ako iz scenarija prosledjujemo samo username onda ce Examples tabela imati samo jednu kolonu
    //Potrebno je da svaka kolona u redu bude popunjena u tabeli
    //Takodje ako prosledjujemo string moramo da pisemo pod navodnicima

    //Scenario Outline: User cannot log in with invalid credentials
    //      Given User is on login page
    //      When User inputs valid username <username>
    //      And User inputs valid password <password>
    //      And User clicks on Login button
    //      Then User is not logged in

    //Examples:
    //        | username | password          |
    //        | "user 1" | "some password 1" |
    //        | "user 2" | "some password 2" |
    //        | "user 3" | "some password 3" |

}