package WheelsUpApi;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Utils {


    static String endpoint= "https://wheelsup.com/_mock_/initial-data.json";

    public static Response getResponseApi(){
        Response resp=	given()
                .when()
                .get(endpoint);

        return resp;
    }




}
