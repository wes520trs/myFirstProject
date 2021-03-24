package com.onlinecourses.apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredApiTest {

    @Test
    public void getRequest(){

        String url="https://reqres.in/api/users?page=2";
        Response response= RestAssured.get(url);
        Assert.assertEquals(response.statusCode(),200,"Response code mismatch");
        int total_pages=response.jsonPath().get("total_pages");
        System.out.println("the total page is: "+total_pages);
        Assert.assertEquals(total_pages,2,"total_pages value mismatch");

    }

    @Test
    public void postRequest(){

        String url="https://reqres.in/api/users";
        String contentType="application/json";
        String bodyData="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response response=RestAssured.
                given().contentType(contentType).body(bodyData).
                when().post(url).
                then().extract().response();
        Assert.assertEquals(response.statusCode(),201,"Response code mismatch");
        String name=response.jsonPath().get("name");
        Assert.assertEquals(name,"morpheus","name mismatch");
    }

    //@Test
    public void updateRequest(){
        String url="https://reqres.in/api/users/2";
        String contentType="application/json";
        String updateDate="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        Response response=RestAssured.
                given().contentType(contentType).body(updateDate).
                when().put(url).
                then().extract().response();
        Assert.assertEquals(response.statusCode(),200,"Response code mismatch");
        String job=response.jsonPath().get("job");
        Assert.assertEquals(job,"zion resident","job mismatch");

        RestAssured.
                given().contentType(contentType).body(updateDate).
                when().put(url).
                then().log().all();

    }

    //@Test
    public void deleteRequest(){
        String url="https://reqres.in/api/users/2";
        Response response=RestAssured.delete(url).then().extract().response();
        Assert.assertEquals(response.statusCode(),204,"Response code mismatch");

        RestAssured.delete(url).then().log().all();

    }
}
