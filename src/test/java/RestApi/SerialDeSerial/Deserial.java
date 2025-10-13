package RestApi.SerialDeSerial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Deserial {
    //Deserialization in Rest Assured is converting Responsebody back to java object with the support of pojo classes.

        @Test
        public void getPojoFromProgramInfoObject() throws JsonMappingException, JsonProcessingException
        {
//Deserialization
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

            // GET request and deserialize response into User class
            User user = RestAssured
                    .given()
                    .when()
                    .get("/users/1")
                    .then()
                    .statusCode(200)
                    .extract()
                    .as(User.class); // 🔥 Deserialization here
            // Deserialize JSON array to User[]
//  User[] usersArray = response.as(User[].class);

            // Output the deserialized data
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());

            Address addr = user.getAddress();
            System.out.println("City: " + addr.getCity());
            System.out.println("Street: " + addr.getStreet());
            System.out.println("Zipcode: " + addr.getZipcode());
        }


    @Test
    public void getPojoArrayDummy() throws JsonMappingException, JsonProcessingException
    {
    Response response = RestAssured
            .given()
            .when()
            .get("https://mock-api/users")  // Replace with actual API returning above JSON
            .then()
            .statusCode(200)
            .extract()
            .response();

    // Deserialize JSON array to User[]
    User2[] usersArray = response.as(User2[].class);

    // Or deserialize to List<User>:
    // List<User> usersList = response.jsonPath().getList("", User.class);

        for (User2 user : usersArray) {
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Emails:");
        for (String email : user.getEmails()) {
            System.out.println("  - " + email);
        }
        System.out.println("Address: " + user.getAddress().getStreet() + ", " + user.getAddress().getCity());
        System.out.println("Geo: Lat=" + user.getAddress().getGeo().getLat() + ", Lng=" + user.getAddress().getGeo().getLng());
        System.out.println("-----------------------");
    }
}
    }

