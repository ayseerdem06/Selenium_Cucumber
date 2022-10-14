package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },

        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp1",       // @All yazarsak hepsini birden çalıstirir
        dryRun = false        // true olduğunda browsere arka planda yaparak testi gerçeklestirir

)


public class TestRunner {




}
