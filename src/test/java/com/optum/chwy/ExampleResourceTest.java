package com.optum.chwy;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

@QuarkusTest
class ExampleResourceTest {

    @Test
void testHelloEndpoint() {
        given()
                .when().get("/retrievedata")
                .then()
                .statusCode(200)
                .body("data.continents.name",hasItems("Africa","Asia"));
    }

}