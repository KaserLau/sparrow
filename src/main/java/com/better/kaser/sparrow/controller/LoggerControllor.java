package com.better.kaser.sparrow.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/log")
public class LoggerControllor {
    private Logger logger = Logger.getLogger(LoggerControllor.class);
    @GetMapping(value="/get/info")
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
        String responsInfo = "num1" + " + "+"num2 " +" = " + addition;
        return responsInfo;
    }
}
