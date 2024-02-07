package bdd.tests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions (
        features = "classpath:features",
        glue = "bdd/steps",
        plugin = {
                "html:target/test_reports/report.html"
        }
)
public class TestRunner {
}
