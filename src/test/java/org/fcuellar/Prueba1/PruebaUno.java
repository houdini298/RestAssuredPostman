package org.fcuellar.Prueba1;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class PruebaUno {


    @Test
    public void GetAllUsers() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.asString());
    }

    @Test
    public void GetOneUser() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.asString());

    }
}
