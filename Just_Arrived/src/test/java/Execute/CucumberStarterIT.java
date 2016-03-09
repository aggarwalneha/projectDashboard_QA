package Execute;


import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(
    //this code will only look into "features/" folder for features
    features={"src/test/resources/Feature/Login.feature"},
    glue = { "stepdef"},
    tags = { "@RunMe" }
    )
public class CucumberStarterIT {
}
