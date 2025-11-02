package RestApi.SerialDeSerial;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class serial {

    @Test
    public void WithoutSerialPostreqMap() {

        RestAssured.baseURI = "https://reqres.in/api/users";

        Map<String, String> map = new HashMap<>();
        map.put("name", "aaaaa");
        map.put("job", "AAAA");

        Response response = given().contentType(ContentType.JSON).body(map).header("x-api-key", "reqres-free-v1")
                .when().post();
        System.out.println("ccccccc" + response.prettyPrint());

    }


    @Test
    public void tosetProgramDetails(){
        User user = new User();  // Java object
        user.setName("Amit");
        RestAssured.baseURI="https://jsonplaceholder.typicode.com/users/1";
        Response res =  RestAssured
                .given().contentType("application/json; charset=UTF-8")
                .body(user) //-----//
                .when()
                .put();// post -> need to pass all values, put & patch working

                //.then().assertThat().statusCode(200).extract().response();
        String response = res.asString();
        System.out.println(response);
  }
}
