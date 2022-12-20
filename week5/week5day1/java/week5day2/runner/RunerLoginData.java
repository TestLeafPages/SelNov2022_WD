package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
import steps.Hooks;


@CucumberOptions(features="src/test/java/features/Login.feature",
                glue="steps",
                monochrome=true,
                publish=true,
              //  tags="@smoke or @dilip"//any one canrun
                
		tags="@dilip and @smoke"// both should be true
		//tags="not @testleaf"//it will not run
		)




public class RunerLoginData extends BaseClass{

}
