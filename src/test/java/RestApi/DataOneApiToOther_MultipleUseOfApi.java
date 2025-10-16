package RestApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DataOneApiToOther_MultipleUseOfApi {
    static String id111 = "";
    //Runing with xml file OneApiOther
    //{ All string
    //    "name": "aaaaa",
    //    "job": "AAAA",
    //    "id": "971",
    //    "createdAt": "2025-10-09T07:31:40.183Z"
    //}
    @Test
    public void PostreqMap(ITestContext context) {

        RestAssured.baseURI = "https://reqres.in/api/users";

        Map<String,String> map= new HashMap<>();
        map.put("name","aaaaa");
        map.put("job","AAAA");

        Response response=given().contentType(ContentType.JSON).body(map).header("x-api-key", "reqres-free-v1")
                .when().post();
        System.out.println("ccccccc"+response.prettyPrint());
        String id=response.jsonPath().get("id");
        System.out.println("id-------created-----"+id);
       // context.setAttribute("member_id",id); // for single Test
        context.getSuite().setAttribute("member_id",id);// for Multiple test in xml file
    }

    @Test
    public void PostreqMap2() {

        RestAssured.baseURI = "https://reqres.in/api/users";

        Map<String,String> map= new HashMap<>();
        map.put("name","aaaaa");
        map.put("job","AAAA");

        Response response=given().contentType(ContentType.JSON).body(map).header("x-api-key", "reqres-free-v1")
                .when().post();
        System.out.println("ccccccc"+response.prettyPrint());
        id111=response.jsonPath().get("id");
        System.out.println("id111------------"+id111);

    }
}

