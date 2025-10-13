package RestApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DataMultiplePassedInSingleApi {
//{
//    "name": "aaaa",
//    "job": "AAAAA",
//    "id": "324",
//    "createdAt": "2025-10-09T08:19:31.230Z"
//}
//ccccccc{
//    "name": "aaaa",
//    "job": "AAAAA",
//    "id": "324",
//    "createdAt": "2025-10-09T08:19:31.230Z"
//}
//id------------324
//
//
//{
//    "name": "ccccc",
//    "job": "CCCCCC",
//    "id": "409",
//    "createdAt": "2025-10-09T08:19:32.381Z"
//}
//ccccccc{
//    "name": "ccccc",
//    "job": "CCCCCC",
//    "id": "409",
//    "createdAt": "2025-10-09T08:19:32.381Z"
//}
//id------------409


    @DataProvider(name="multipleData")
    public Object [][] dataForPost(){
//        Object[][] data = new Object[2][2];
//        data[0][0]="aaaa";
//        data[0][1]="AAAAA";
//        data[1][0]="ccccc";
//        data[1][1]="CCCCCC";
      //  return data;
        //or
       return  new Object[][]{
            {"aaaa","AAAAA"},
            {"cccc","CCCC"}
        };
    }
    @Test(dataProvider ="multipleData" )
    public void PostreqMap(String name,String job) {

        RestAssured.baseURI = "https://reqres.in/api/users";

        Map<String,String> map= new HashMap<>();
        map.put("name",name);//aaaaa, cccccc
        map.put("job",job);//AAAAA, CCCC

        Response response=given().contentType(ContentType.JSON).body(map).header("x-api-key", "reqres-free-v1")
                .when().post();
        System.out.println("ccccccc"+response.prettyPrint());
        String id=response.jsonPath().get("id");
        System.out.println("id------------"+id);


    }
}

