package RestApi.JsonReader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
//import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class  JsonReader {
    @Test
    public void readJsonPojo1() throws IOException {
        String filePath = "src/test/java/RestApi/JsonReader/JsonData.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonPojo jsonPojoObject = mapper.readValue(new File(filePath), JsonPojo.class);
        System.out.println("jsonPojoObject.getId---" + jsonPojoObject.getId());
        System.out.println("jsonPojoObject.getName---" + jsonPojoObject.getName());
        //o/p
        // jsonPojoObject.getId---11
        //jsonPojoObject.getName---Polly
    }

    //   JsonPojo jsonPojoObject specific pojo----------JsonNode jsonNode not any specific
    @Test
    public void readJsonNode1() throws IOException {
        String filePath = "src/test/java/RestApi/JsonReader/JsonData.json";
        // both works--JsonNode.class passing --------------not any specific pojo
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readValue(new File(filePath), JsonNode.class);
        System.out.println("jsonPojoObject.getId---" + jsonNode.get("id"));
        System.out.println("jsonPojoObject.getName---" + jsonNode.get("name"));


        String filePath2 = "src/test/java/RestApi/JsonReader/JsonData2.json";
        JsonNode jsonNode2 = mapper.readValue(new File(filePath2), JsonNode.class);
        System.out.println("jsonPojoObject.getId.getId1---" + jsonNode2.get("id").get("id1"));
        System.out.println("jsonPojoObject.getId.getname---" + jsonNode2.get("id").get("name"));
        System.out.println("jsonPojoObject.getName---" + jsonNode2.get("name"));
    }

    //  JsonNode jsonNode=mapper.readTree(new File(filePath));
//  JsonNode jsonNode2=mapper.readValue(new File(filePath2),JsonNode.class);
    @Test
    public void readJsonNodeTree1() throws IOException {
        String filePath = "src/test/java/RestApi/JsonReader/JsonData2.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File(filePath));
        System.out.println("jsonPojoObject.getId---" + jsonNode.get("id").get("id1"));
        System.out.println("jsonPojoObject.getId.getname---" + jsonNode.get("id").get("name"));
        System.out.println("jsonPojoObject.getName---" + jsonNode.get("name"));
    }

    @Test
    //{
    //  "id":{
    //    "id1": 1,
    //    "name": "amit"
    //  },
    //  "name": "Polly"
    //}
    public void readJsonPojo() throws IOException {//JsonPojo
        String filePath = "src/test/java/RestApi/JsonReader/JsonData2.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonPojo2 jsonPojoObject = mapper.readValue(new File(filePath), JsonPojo2.class);
        System.out.println("jsonPojoObject.getName---" + jsonPojoObject.getName());
        System.out.println("jsonPojoObject.getId---" + jsonPojoObject.getId().name);
        // o/p
        //jsonPojoObject.getId---amit
        //jsonPojoObject.getName---Polly
    }

    @Test
    public void readJsonDataComplex() throws IOException {
        String jsonStr = "{ \"name\" : \"Raja\", \"age\" : 30," +
                " \"technologies\" : [\"Java\", \"Scala\", \"Python\"]," +
                " \"nestedObject\" : { \"field\" : \"value\" } }";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper.readValue(jsonStr, JsonNode.class);
        JsonNode nameNode = node.get("name");
        String name = nameNode.asText();
        System.out.println(name);
        JsonNode ageNode = node.get("age");
        int age = ageNode.asInt();// as Int must
        System.out.println(age);
        JsonNode array = node.get("technologies");
        JsonNode jsonNode = array.get(1);  // can not use []
        String techStr = jsonNode.asText(); // as Text must
        System.out.println(techStr);
        JsonNode child = node.get("nestedObject");
        JsonNode childField = child.get("field");
        String field = childField.asText();
        System.out.println(field);
    }


    @Test
    public void readJsonNodeTree() throws IOException {//JsonNode
        ObjectMapper mapper = new ObjectMapper();
        String filePath2 = "src/test/java/RestApi/JsonReader/JsonData2.json";
        String jsonD = "{\n" +
                "  \"id\":{\n" +
                "    \"id1\": 1,\n" +
                "    \"name\": \"amit\"\n" +
                "  },\n" +
                "  \"name\": \"Polly\"\n" +
                "}";

        String filePath = "src/test/java/RestApi/JsonReader/JsonData2.json";
        ObjectMapper mapper2 = new ObjectMapper();
        JsonNode jsonPojoObject = mapper2.readValue(new File(filePath), JsonNode.class);
        System.out.println("jsonPojoObject.id---" + jsonPojoObject.get("id"));
        System.out.println("jsonPojoObject.id---" + (jsonPojoObject.get("id")).get("id1"));
        System.out.println("jsonPojoObject.id---" + (jsonPojoObject.get("id")).get("name"));
        System.out.println("jsonPojoObject.name---" + jsonPojoObject.get("name"));
    }
// want to save then asInt(), asText()
    //{
//  "user": {
//    "id": 123,
//    "name": "Alice",
//    "roles": ["admin", "editor"],
//    "address": {
//      "city": "Wonderland",
//      "zip": "12345"
//    }
//  }
//}
    ////////////////////////////////////////////
    @Test
    public void readJsonNodeTreeComplex() throws IOException {
        String filePath2 = "src/test/java/RestApi/JsonReader/JsonComplex.json";
        ObjectMapper mapper = new ObjectMapper();
            // Load JSON file into a tree
        //JsonNode jsonNode = mapper.readTree(response.asString());  -----------------response
            JsonNode rootNode = mapper.readTree(new File(filePath2));
            // Navigate the tree
            JsonNode userNode = rootNode.get("user");
            int id = userNode.get("id").asInt();
            String name = userNode.get("name").asText();
            // Accessing array
            JsonNode rolesNode = userNode.get("roles");
        System.out.println("Role-00000: " + rolesNode.get(0));
            for (JsonNode role : rolesNode) {
                System.out.println("Role: " + role.asText());
            }
            // Accessing nested object
            JsonNode addressNode = userNode.get("address");
            String city = addressNode.get("city").asText();
            String zip = addressNode.get("zip").asText();
            // Output
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("ZIP: " + zip);
        }



    @Test
    public void readJsonDataWithJsonPath() {
        String jsonStr = "{ \"name\" : \"Raja\", \"age\" : 30," +
                " \"technologies\" : [\"Java\", \"Scala\", \"Python\"]," +
                " \"nestedObject\" : { \"field\" : \"value\" } }";

        // Read a simple field----  $ means root of the JSON document
        String name = JsonPath.read(jsonStr, "$.name");
        System.out.println("Name: " + name);

        // Read an array
        List<String> technologies = JsonPath.read(jsonStr, "$.technologies[*]");
        System.out.println("Technologies: " + technologies);
        //    Not work------------JsonPath jsonPath = new JsonPath();
        String firstTech = JsonPath.read(jsonStr, "$.technologies[0]");
        System.out.println("Technologies[0]: " + firstTech);

        // Read a nested field
        String nestedValue = JsonPath.read(jsonStr, "$.nestedObject.field");
        System.out.println("Nested Field: " + nestedValue);

        // You can also extract multiple things using map syntax
        Map<String, Object> result = JsonPath.parse(jsonStr)
                .read("$", Map.class);
        System.out.println("Whole JSON as Map: " + result);
        System.out.println("Name JSON as Map: " + result.get("name"));
    }


    @Test
    public void fromFileJsonPath() throws IOException {

            // Path to your JSON file
            String filePath2 = "src/test/java/RestApi/JsonReader/JsonComplex.json";
            File file = new File(filePath2);

            // ✅ Read a simple field
        String name = JsonPath.read(file, "$.user.name");
        System.out.println("Name: " + name);

        int id = JsonPath.read(file, "$.user.id");
        System.out.println("id: " + id);



        }


    @Test
    public void fromFileJsonPathPostMan() throws IOException {
        // Path to your JSON file
        String filePath2 = "src/test/java/RestApi/JsonReader/postman_collection.json";
        File file = new File(filePath2);

        // ✅ Read a simple field
        String name = JsonPath.read(file, "$.info.name");
        System.out.println("Name: " + name);




    }
}

