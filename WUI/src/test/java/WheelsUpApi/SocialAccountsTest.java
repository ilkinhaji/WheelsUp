package WheelsUpApi;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;



public class SocialAccountsTest {

String twitter = "https://twitter.com/WheelsUp";
String instagram = "https://www.instagram.com/wheelsup8760/";

@Test
    public void verifySocialAccounts(){

    Response resp = Utils.getResponseApi();


    String twitterKey= JsonPath.read(resp.asString(), "$.keys.twitter");
    String instaKey = JsonPath.read(resp.asString(), "$.keys.instagram");

    Assert.assertEquals(twitter, twitterKey);
    Assert.assertNotEquals(instagram, instaKey);
}

@Test
public void displayEditedKeys() {

    Response resp = Utils.getResponseApi();


    LinkedHashMap<String, String> keys= JsonPath.read(resp.asString(), "$.keys");
    System.out.println(keys.size());

    keys.remove("google_tag_manager");
    keys.remove("mapbox_accesstoken");
    keys.remove("footer_disclaimer");
    keys.replace("email", "info@wheelsup.com", "ilkin.ehajiyev@gmail.com");

    for(Map.Entry<String, String> map: keys.entrySet()){
        System.out.println(map);
    }


}



}
