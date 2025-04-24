package regresTest.api;

import org.junit.jupiter.api.Test;
import regresTest.api.endpoints.RegresEndpoints;
import regresTest.api.pojo.rq.CreateUserRq;
import regresTest.api.specs.RegresSpecs;

import static io.restassured.RestAssured.given;

public class CreateUserTest {
    @Test
    public void CreateUserTest() {
        CreateUserRq user = CreateUserRq
                .builder()
                .job("job")
                .name("name")
                .build();

        given()
                .spec(RegresSpecs.requestSpecification())
                .post(RegresEndpoints.CREATE_USER)
                .then()
                .spec(RegresSpecs.responseSpecification(201));

    }
}
