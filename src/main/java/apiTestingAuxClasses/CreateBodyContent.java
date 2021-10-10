package apiTestingAuxClasses;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.json.JSONObject;

public class CreateBodyContent {

    public static String getBodyContentUsers(){
        JSONObject body = new JSONObject();

        Faker faker = new Faker();
        Name name = faker.name();
        String firstName =  name.firstName();
        String lastName =  name.lastName();
        String userName =  name.username();
        String email = faker.internet().emailAddress();

        body.put("username",userName)
                .put("firstname", firstName)
                .put("lastname", lastName)
                .put("email", email);
        return body.toString();
    }
}
