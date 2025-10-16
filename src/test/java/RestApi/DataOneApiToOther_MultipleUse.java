package RestApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static RestApi.DataOneApiToOther_MultipleUseOfApi.id111;
import static io.restassured.RestAssured.given;

class DataOneApiToOther_MultipleUse {
    //Runing with xml file OneApiOther
        @Test
        public void Deletereqres(ITestContext context) {
         // String id = (String) context.getAttribute("member_id"); // for single xsuite Test
            String id = (String) context.getSuite().getAttribute("member_id");// for Multiple test in xml file

            System.out.println("id-----readyforDelete-------" + id);

            RestAssured.baseURI = "https://reqres.in/api/users/id";
            Response response1 = given().contentType(ContentType.JSON).header("x-api-key", "reqres-free-v1")
                    .when().delete();
            System.out.println(response1.getStatusCode());
            Assert.assertEquals(response1.getStatusCode(), 204);/////no content
        }

    @Test
    public void Deletereqres222( ) {
        System.out.println("id111------------" + id111);
        RestAssured.baseURI = "https://reqres.in/api/users/798";
        Response response1 = given().contentType(ContentType.JSON).header("x-api-key", "reqres-free-v1")
                .when().delete();
        System.out.println(response1.getStatusCode());
        Assert.assertEquals(response1.getStatusCode(), 204);/////no content
    }
    }
