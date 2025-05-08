package com.qa.framework.api;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class ApiHelper {
    static {
        RestAssured.baseURI = "https://api.example.com";
    }

    public static String getToken(String user, String pass) {
        Response res = given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"" + user + "\", \"password\":\"" + pass + "\"}")
                .post("/auth/login")
                .then().statusCode(200)
                .extract().response();

        return res.jsonPath().getString("token");
    }

    public static String getDisplayName(String token) {
        Response res = given()
                .header("Authorization", "Bearer " + token)
                .get("/user/profile")
                .then().statusCode(200)
                .extract().response();

        return res.jsonPath().getString("displayName");
    }
}
