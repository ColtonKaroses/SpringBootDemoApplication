package com.ckaroses

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Colton on 2/15/2015.
 */
@RestController
class PingController {

    @RequestMapping("/")
    public void ping() {}

}
