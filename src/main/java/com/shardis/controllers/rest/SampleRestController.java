package com.shardis.controllers.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Tomasz Kucharzyk
 */

@RestController
@RequestMapping("/rest")
public class SampleRestController {

    @RequestMapping("/test")
    public String test() {
        return "test " + new Date().toString();
    }


}
