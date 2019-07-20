package com.prestashop.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber; //ayný þey midir
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@login",
		features="src/test/resources/com/prestashop/features",
		glue="com/prestashop/step_definitions",
		dryRun=false
		)
public class CukesRunner {

}
