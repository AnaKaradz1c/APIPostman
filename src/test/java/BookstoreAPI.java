import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import pojo.body;

import static io.restassured.RestAssured.given;

public class BookstoreAPI {
    @Test
    public void CreateUser() {
        body createUserBody = new body();
        createUserBody.setUserName("PeraPeric");
        createUserBody.setPassword("Qwerty123!@#");
        RestAssured.baseURI = "https://demoqa.com";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(createUserBody)
                .post("Account/v1/User")
                .then().log().all()
                .assertThat().statusCode(201);

    }

    @Test
    public void User () {

        body createdBody = new body();
        createdBody.setUserName("usernam79");
        createdBody.setPassword("Qwerty123!@#");
        RestAssured.baseURI = "https://demoqa.com";
       String response =  given().log().all()
                .header("Content-Type", "application/json")
                .body(createdBody)
                .post("Account/v1/user")
                .then().log().all()
                .assertThat().statusCode(201)
               .extract().response().asString();

        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String userID = js.getString("userID");

        String response1 = given().log().all()
                .header("Content-Type", "application/json")
                .when().get("Account/v1/user" + userID)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

      /*  String response2 = given().log().all()
                .header("Content-Type", "application/json")
                .when().delete("Account/v1/user" + userID)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().toString();*/

    }
}