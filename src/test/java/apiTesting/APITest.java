package apiTesting;

import apiTestingAuxClasses.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.GlobalVariables;

public class APITest {

    @Test(groups = {"all","get"})
    public void getTest(){
        String getAllUsers = GlobalVariables.apiHost  + "/users/all";
        Response response = RequestMaker.makeGetRequest(getAllUsers);
        String responseString = response.asString();
        JSONArray jsonArray =  new JSONArray(responseString);
        System.out.println(jsonArray.toString(10));
        if(jsonArray.length() > 0){
            Assert.fail("Fail test");
        }
    }

    @Test(groups = {"all","post"})
    public void postMethod(){
        String getAllUsers = GlobalVariables.apiHost  + "/users/add";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstname", "Wolff")
                .put("lastname", "Jose")
                .put("username","josewolff")
                .put("email","wolff@laserants.com");
        Response response = RequestMaker.makePostRequest(getAllUsers, jsonObject.toString());
        System.out.println(response.asString());
    }

    @AfterClass
    public void after(){
        System.out.println("After");
    }
}
