package com.ckaroses

import org.junit.Assert
import org.junit.Test
import org.springframework.boot.test.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate

/**
 * Created by Colton on 2/15/2015.
 */
class PingControllerTest {

    RestTemplate template = new TestRestTemplate();

    @Test
    public void testRequest() {
        ResponseEntity<Void> response = template.getForEntity("http://localhost:8080", Void.class)
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode())
    }

}
