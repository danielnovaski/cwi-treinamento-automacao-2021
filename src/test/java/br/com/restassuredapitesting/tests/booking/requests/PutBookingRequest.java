package br.com.restassuredapitesting.tests.booking.requests;

import br.com.restassuredapitesting.tests.booking.payloads.BookingPayloads;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PutBookingRequest {
    BookingPayloads bookingPayloads = new BookingPayloads();
    public RequestSpecification updateBookingToken(int id,String token){
        return (RequestSpecification) given()
                .header("Content-Type","application/json")
                .header("Accept:","application/json")
                .header("Cookie:",token)
                .when()
                .body(BookingPayloads.payloadValidoBooking().toString())
                .put("booking/" + id);
    }


}
