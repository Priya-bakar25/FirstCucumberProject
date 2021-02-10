import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.runner.Request;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
public class JsoServerStepDef {
	RequestSpecification request;
	Response response;
	@Given("I make a request for comments data")
	public void i_make_a_request_for_comments_data() throws IOException {
      RestAssured.baseURI="http://dneonline.com";
      
      File file = new File("./soapResource/xmlSample.xml");
      FileInputStream fls = new FileInputStream(file);
     // String str=fls.toString();
	String str=IOUtils.toString(fls,"UTF-8");
      
      request=given().contentType("text/xml").accept(ContentType.XML).body(str);
      
      
	}

	@When("I make get request")
	public void i_make_get_request() {
	response = request.post(" /calculator.asmx");

	}

	@Then("I should get status code")
	public void i_should_get_status_code() {
		//response.then().statusCode(200).log().all().and().body("//*.ADDResult.text()",equalTo("5"));
      response.then().statusCode(200).log().all().and().body("//*:AddResult.text()",equalTo("5")).and().assertThat().
      body(RestAssuredMatchers.matchesXsdInClasspath("xsdschema.xsd"));
	}

	@Then("body id as {int}")
	public void body_id_as_s(Integer int1) {
       
	}

}
