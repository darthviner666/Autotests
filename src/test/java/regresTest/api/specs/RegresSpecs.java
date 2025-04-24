package regresTest.api.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.PropertiesLoader;

public class RegresSpecs {
    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(PropertiesLoader.getProperty("regres.properties","URI"))
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification responseSpecification(int statusCode) {
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build().statusCode(statusCode);
    }
}
