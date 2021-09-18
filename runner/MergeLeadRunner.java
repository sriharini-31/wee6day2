package runner;

import io.cucumber.testng.CucumberOptions;

import steps.BaseClass;

@CucumberOptions(features="D:\\SeleniumBatch\\src\\test\\java\\features\\MergeLead.feature" ,glue="steps" ,monochrome=true,publish=true)


public class MergeLeadRunner extends BaseClass {

}
