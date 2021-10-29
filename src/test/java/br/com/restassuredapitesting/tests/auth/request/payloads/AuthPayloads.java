package br.com.restassuredapitesting.tests.auth.request.payloads;

import com.github.tsohr.JSONObject;

public class AuthPayloads {
    public JSONObject JsonAuthLogin(){
        JSONObject payloadLogin = new JSONObject();

        payloadLogin.put("username","admin");
        payloadLogin.put("password","password123");

        return payloadLogin;

    }
}
