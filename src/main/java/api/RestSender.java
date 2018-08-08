package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class RestSender {
    String login;
    String password;
public RestSender(String login, String password){
    this.login= login;
    this.password= password;
}
    public String getRequest(String link) {

        Response response = given().auth().preemptive().basic(login, password).when().get(link);
        return response.asString();
    }

    public String postRequest(String link, String body, int resultCode) {

        RequestSpecification request = RestAssured.given();
        request.auth().preemptive().basic(login, password);
        request.header("Content-Type", "application/json");
        request.body(body);
        Response response = request.post(link);
        Assert.assertEquals(resultCode, response.getStatusCode());
        return response.asString();
    }
}
