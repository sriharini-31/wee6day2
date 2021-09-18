package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="D:\\SeleniumBatch\\src\\test\\java\\features\\EditLead.feature" ,glue="steps" ,monochrome=true,publish=true)

public class EditLeadRunner extends BaseClass {

}
