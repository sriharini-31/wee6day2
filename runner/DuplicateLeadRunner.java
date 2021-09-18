package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="D:\\SeleniumBatch\\src\\test\\java\\features\\DuplicateLead.feature" ,
glue="steps" ,
monochrome=true,
publish=true,
tags="@sanity")

public class DuplicateLeadRunner extends BaseClass{

}
