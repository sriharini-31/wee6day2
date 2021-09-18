package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
@CucumberOptions(features="D:\\SeleniumBatch\\src\\test\\java\\features\\Login.feature" 
                 ,glue="steps" 
                 ,monochrome=true
                 ,publish=true
                 ,tags="@functional")

public class CucumberRunner extends BaseClass {

}