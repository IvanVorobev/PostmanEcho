package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankApiTest {
    @Test
    void shouldPostData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Bank")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("dat", equalTo("Bank"))
        ;

    }
}
