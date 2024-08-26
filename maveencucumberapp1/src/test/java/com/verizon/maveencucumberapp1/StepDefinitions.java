package com.verizon.maveencucumberapp1;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("I have {int} cakes in my belly")
    public void anExampleScenario(int cakes) {
    	Belly b = new Belly();
    	b.eat(cakes);
    }

    @When("I wait 1 hour")
    public void allStepDefinitionsAreImplemented() {
    	Belly b = new Belly();
         b.waitSec();
    }

    @Then("my belly should feel hungry")
    public void theScenarioPasses() {
    	Belly b = new Belly();
        b.end();
    }

}
