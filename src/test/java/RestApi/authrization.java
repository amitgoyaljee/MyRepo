package RestApi;

import io.cucumber.java.nl.Stel;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.mortbay.jetty.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;


  import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;


import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class authrization {

    private static final String BASE_URL = "https://httpbin.org/basic-auth/user/pass";
    private static final String TOKEN = "Basic dXNlcjpwYXNz";

    @Before
    public void setup() {
        given().baseUri(BASE_URL);
    }

    @Test
    public void validateToken() {


        Response response = given()
              //  .header("Accept", "application/json")
                //.header("Authorization",TOKEN)
                .header("Authorization", TOKEN)
                .contentType(ContentType.JSON)
                .when()
                .get("https://httpbin.org/basic-auth/user/pass")
                .then()
                .log().all()
                .extract()
                .response()
               ;
        System.out.println("validateToken---" + response.asString());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
// if not pass auth--  //.header("Authorization",TOKEN)
    //HTTP/1.1 401 UNAUTHORIZED
    //Date: Sun, 04 Aug 2024 05:23:39 GMT
    //Content-Length: 0
    //Connection: keep-alive
    //Server: gunicorn/19.9.0
    //WWW-Authenticate: Basic realm="Fake Realm"
    //Access-Control-Allow-Origin: *
    //Access-Control-Allow-Credentials: true
    //validateToken---

    //else
    //TTP/1.1 200 OK
    //Date: Sun, 04 Aug 2024 05:26:57 GMT
    //Content-Type: application/json
    //Content-Length: 47
    //Connection: keep-alive
    //Server: gunicorn/19.9.0
    //Access-Control-Allow-Origin: *
    //Access-Control-Allow-Credentials: true
    //
    //{
    //    "authenticated": true,
    //    "user": "user"
    //}
    //validateToken---{
    //  "authenticated": true,
    //  "user": "user"
    //}

    @Test
    public void basicT() {
        Response response = given().auth()
                .basic("user1", "user1Pass")
                .when()
                .get("http://localhost:8080/spring-security-rest-basic-auth/api/foos/1");
        System.out.println("validateToken---" + response.asString());
    }


}