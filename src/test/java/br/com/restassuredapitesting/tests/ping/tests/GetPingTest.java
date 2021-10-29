package br.com.restassuredapitesting.tests.ping.tests;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.suites.AllTests;
import br.com.restassuredapitesting.tests.ping.requests.GetPingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class GetPingTest extends BaseTest {

    GetPingRequest getPingRequest =  new GetPingRequest();

    @Test
    @Category({AllTests.class})
    public void ValidaApiOnline(){

        getPingRequest.pingReturnApi()
                .then()
                .statusCode(201);
    }

}
