package com.marlen.api_tests.test;

import com.marlen.api_tests.models.Booking;
import com.marlen.api_tests.models.CreateJsonBody;
import com.marlen.api_tests.models.Header;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class ApiTests {

    private static final String AUTH_ENDPOINT = "https://restful-booker.herokuapp.com/auth";
    private static final String HEALTH_CHECK = "https://restful-booker.herokuapp.com/ping";
    private static final String GET_BOOKING_IDS = "https://restful-booker.herokuapp.com/booking";
    private static final String GET_BOOKING = "https://restful-booker.herokuapp.com/booking/%s";
    private static final String CREATE_BOOKING = "https://restful-booker.herokuapp.com/booking";
    private static final String UPDATE_BOOKING = "https://restful-booker.herokuapp.com/booking/%s";
    private static final String DELETE_BOOKING = "https://restful-booker.herokuapp.com/booking/%s";

    private final Header header = new Header();
    private final CreateJsonBody createJsonBody = new CreateJsonBody();
    private final int id = 29;
    private final String username = "admin";
    private final String password = "password123";
    private final Booking booking = new Booking();

    @Test
    public void apiHealthCheck() {
        var response =
                given().
                        when().
                        get(HEALTH_CHECK).
                        then().
                        assertThat().
                        statusCode(201);
        response.log().body();
    }

    @Test
    public void createToken() {
        var response =
                given().
                        headers(header.contentType()).
                        body(createJsonBody.getAuth()).
                        when().
                        post(AUTH_ENDPOINT).
                        then().
                        assertThat().
                        statusCode(200);
        response.log().body();
    }

    @Test
    public void createBooking() {
        var response =
                given().
                        headers(header.post()).
                        body(createJsonBody.getPostBody()).
                        when().
                        post(CREATE_BOOKING).
                        then().
                        assertThat().
                        statusCode(200);
        response.log().body();
    }

    @Test
    public void getBooking() {
        var response =
                given().
                        when().
                        get(format(GET_BOOKING, id)).
                        then().
                        assertThat().
                        statusCode(200);
        response.log().body();
    }

    @Test
    public void updateBooking() {
        var response =
                given().auth().basic(username, password).
                        headers(header.update()).
                        body(createJsonBody.getUpdateBody()).
                        when().
                        put(format(UPDATE_BOOKING, id)).
                        then().
                        assertThat().
                        statusCode(201);
        response.log().body();
    }

    @Test
    public void deleteBooking() {
        var response =
                given().
                        headers(header.contentType()).
                        auth().basic(username, password).
                        when().
                        delete(format(DELETE_BOOKING, id)).
                        then().
                        assertThat().
                        statusCode(201);
    }
}
