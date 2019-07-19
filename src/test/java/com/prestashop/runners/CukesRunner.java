package com.prestashop.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber; //ayn� �ey midir
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/prestashop/features",
		glue="com/prestashop/step_definitions"
		)
public class CukesRunner {

}
