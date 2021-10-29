package br.com.restassuredapitesting.tests.booking.payloads;

import com.github.tsohr.JSONObject;

public class BookingPayloads {
    public static JSONObject payloadValidoBooking(){
        JSONObject payload = new JSONObject();
        JSONObject bookingDates = new JSONObject();

        bookingDates.put("chekin","2018-01-01");
        bookingDates.put("chekout","2019-01-01");

        payload.put("firstname","Cristiano");
        payload.put("lastname","Ronaldo");
        payload.put("depositpaid",111);
        payload.put("firstname",true);
        payload.put("bookingdates",bookingDates);
        payload.put("addiotnalneeds","breakfast");

        return payload;

    }
}
