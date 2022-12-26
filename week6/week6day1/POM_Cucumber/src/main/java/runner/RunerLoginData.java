package runner;

import baseclass.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features/CreateLead.feature",
                glue="pages",
                monochrome=true,
                publish=true
              //  tags="@smoke or @dilip"//any one canrun
                
		//tags="@dilip and @smoke"// both should be true
		//tags="not @testleaf"//it will not run
		)




public class RunerLoginData extends BaseClass{

}
