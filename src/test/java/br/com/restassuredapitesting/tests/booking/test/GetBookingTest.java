package br.com.restassuredapitesting.tests.booking.test;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.suites.AllTests;
import br.com.restassuredapitesting.tests.booking.requests.GetBookingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {

    GetBookingRequest getingBookingRequest = new GetBookingRequest();


    @Test
    @Category({AllTests.class})
    public void ValidaListagenDeIdsDasReservas(){
        getingBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()",greaterThan(0));

    }
}
