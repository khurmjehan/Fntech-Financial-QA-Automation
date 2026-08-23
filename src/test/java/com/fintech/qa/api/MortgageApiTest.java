package com.fintech.qa.api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MortgageApiTest {

    @Test
    public void testMortgageCalculatorEndpoint() {
        RestAssured.baseURI = "https://www.mortgagecalculator.org";

        given()
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "text/html")
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .statusLine(containsString("OK"))
                .time(lessThan(5000L));
    }
}

