package com.cucumber.google_search;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// features used to specify feature file, glue used to specify package the stepDefinitions specified.
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"},
        features = {"classpath:features/Test.feature"},
        glue = {"com.cucumber.google_search"})
public class RunCucumberTest {
}
