package com.better.sparrow.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/log")
public class LoggerTestControllor {
    private Logger logger = Logger.getLogger(LoggerTestControllor.class);
    @GetMapping(value="/get/info",produces = MediaType.APPLICATION_JSON_VALUE)
    public String shareLog(
            @RequestParam(name = "num1") String num1,
            @RequestParam(name = "num2") String num2
    ){
        int addition =  Integer.valueOf(num1) +Integer.valueOf(num2) ;
        // show the log information
        logger.info("Info log"+"num1" +"num2" + "=" + addition + "so far, so go");
        logger.debug("Debug log"+"num1" +"num2" + "=" + addition + "so far, so go");
        logger.error("Error log"+"num1" +"num2" + "=" + addition + "so far, so go");
        logger.warn("Warning log"+"num1" +"num2" + "=" + addition + "so far, so go");
        return String.valueOf(addition);
    }
}
