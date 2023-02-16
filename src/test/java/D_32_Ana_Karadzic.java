import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import pojo.D_32_Ana_Karadzic_BodyPets;

import static io.restassured.RestAssured.given;

public class D_32_Ana_Karadzic {


    @Test
    public void PlaceAnOrderForAPet () {
        D_32_Ana_Karadzic_BodyPets newOrder = new D_32_Ana_Karadzic_BodyPets();
        newOrder.setId(1);
        newOrder.setPetId(1789);
        newOrder.setQuantity(1);
        newOrder.setShipDate("2023-01-26T16:11:51.026Z");
        newOrder.setStatus("placed");
        newOrder.setComplete(true);
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(newOrder)
                .post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void FindPurchaseByOrderID () {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body(D_32_Ana_Karadzic_BodyPets.newOrderCreated())
                .when().post("store/order")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

        JsonPath js = new JsonPath(response);
        String orderID = js.getString("id");


        String response1 = given().log().all()
                .when().get("store/order/"+ orderID)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }

    @Test
    public void DeletePurchaseByOrderID () {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body(D_32_Ana_Karadzic_BodyPets.newOrderCreated())
                .when().post("store/order")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

        JsonPath js = new JsonPath(response);
        String orderID = js.getString("id");


        String response1 = given().log().all()
                .delete("store/order/"+ orderID)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
}
