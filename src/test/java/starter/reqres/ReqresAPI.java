package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {
    public static String GET_LIST_USERS = Constants.BASE_URL + "/api/users?page={page}";
    public static String POST_CREATE_USERS = Constants.BASE_URL + "/api/users";
    public static String POST_LOGIN = Constants.BASE_URL + "/api/login";
    public static String GET_SINGLE = Constants.BASE_URL + "/api/users/{id}";
    public static String PUT_UPDATE_USER = Constants.BASE_URL + "/api/users/{id}";
    public static String PATCH_UPDATE_USER = Constants.BASE_URL + "/api/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL + "/api/users/{id}";
    public static String REGISTER_USER = Constants.BASE_URL + "/api/register";
    public static String LIST_RESOURCE = Constants.BASE_URL + "/api/unknown";
    public static String LIST_SINGLE_RESOURCE = Constants.BASE_URL + "/api/unknown/{id}";



    @Step("Get list users")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);
    }
    @Step("Get list users with invalid param")
    public void getListUsersInvalidParam(String page){
        SerenityRest.given()
                .pathParam("page", page);
    }
    @Step("Get list single resource")
    public void getListSingleResource(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Get list resource")
    public void getListResource(){
        SerenityRest.given();
    }
    @Step("Post create new user")
    public void postCreateUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Post Login Successfull")
    public void postLoginSuccessful(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Post Login Unsuccessful")
    public void postLoginUnsuccessful(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Get Single User")
    public void getSingleUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Get Single User with invalid parameter")
    public void getSingleUserInvalidParam(String id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Put Update User")
    public void putUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Put Update User With Invalid Parameter")
    public void putUpdateUserInvalidParameter(String id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    public void patchUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Patch Update User With Invalid Parameter")
    public void patchUpdateUserInvalidParameter(String id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Delete User")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Delete User With Invalid Parameter")
    public void deleteUserInvalidParam(String id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Register User")
    public void registerUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
