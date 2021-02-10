 import static org.assertj.core.api.Assertions.assertThat;

import com.calculator.pakage.Calculator;
import com.calculator.pakage.StngReverse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDef {
	Calculator calculator;
	StngReverse stngReverse;
	Integer result;
	Integer result1;
	String s;
	//Integer expectedResult= 3;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	   calculator = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	     result = calculator.add(int1,int2);
	}

	@Then("i should get {int}")
	public void i_should_get(Integer int1) {
	  assertThat(result).isEqualTo(int1);	 
	}

	@When("I multiply {int} and {int}")
	public void i_multiply_and(Integer int1, Integer int2) {
	   result1=calculator.multilply(int1,int2);
	}

	@Then("I should have {int}")
	public void i_should_have(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertThat(result1).isEqualTo(int1);
	    
	}
	
	@Given("I have a String")
	public void i_have_a_String() {
     stngReverse = new StngReverse();
	}

	@When("I enter {string}")
	public void i_enter_Priya(String str) {
		
		s=stngReverse.Rvr(str);

	}

	@Then("I should have {string}")
	public void i_should_have_ayirP(String str1) {
	   assertThat(s).isEqualTo(str1);
	}


}
