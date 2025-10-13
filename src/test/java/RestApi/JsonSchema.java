package RestApi;


import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JsonSchema {
    @Test
    public void validateJSONSchema() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/2";
        given()
                .when().get()

                //verify JSON Schema
                .then().assertThat()
                .body(JsonSchemaValidator.
                        matchesJsonSchema(new File("src/test/java/RestApi/my.json")));
    }
}