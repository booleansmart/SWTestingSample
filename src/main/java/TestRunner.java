import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

/**
 * @author Muhamad Hanif on 20/11/2022
 * @project SwTestingSampleAutomation
 */
@CucumberOptions(features = {"src/main/resources/features"},
        glue = {"steps"})
public class TestRunner {
    final private TestNGCucumberRunner runner = new TestNGCucumberRunner(this.getClass());

    @Test(description = "Sample Test", dataProvider = "scenarios")
    public void runCucumberTest(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        runner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        return runner.provideScenarios();
    }

}
