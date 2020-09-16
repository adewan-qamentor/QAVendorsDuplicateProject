package com.executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				glue="com.stepDefinition",
//				tags="@boxExampleScenario_part1 or @boxExampleScenario_part2 or @boxExampleScenario_part3",
				tags="@pagination or @headers",
				plugin ={"pretty",
						"html:reports/htmlreports/report.html",
						"json:reports/report.json",
						"junit:reports/Cucumber.xml"},
				monochrome=true,
				snippets=SnippetType.CAMELCASE,
				strict = true,
				dryRun=false
				)
public class TestRunner {

}



