package testes;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class ApiTests {
    private String token;

    @Before
    public void SetUp(){
        RestAssured.baseURI = "http://5d9cc58566d00400145c9ed4.mockapi.io/";
        //RestAssured.basePath = "shopping_cart";
    }

    @Test
    public void testBuscandoSomenteUmItemEspecifico() {
        RestAssured
                .given()
                    .header("Content-Type","application/json")
                .when()
                    .get("shopping_cart")
                .then()
                    .assertThat()
                        .statusCode(200)
                        .body("shopping_cart", Matchers.equalTo(1))
                        .body("sku[0]", Matchers.equalTo("demo_2"))
                        .body("sku[1]", Matchers.equalTo("demo_1"))
                        .body("sku[2]", Matchers.equalTo("demo_7"))

                        .body("color[0]", Matchers.equalTo("Black"))
                        .body("color[1]", Matchers.equalTo("Orange"))
                        .body("color[2]", Matchers.equalTo("Yellow"))

                        .body("size[0]", Matchers.equalTo("S"))
                        .body("size[1]", Matchers.equalTo("S"))
                        .body("size[2]", Matchers.equalTo("S"));
    }
}
